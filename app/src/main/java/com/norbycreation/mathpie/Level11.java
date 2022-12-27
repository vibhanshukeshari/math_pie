package com.norbycreation.mathpie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Objects;

import static com.norbycreation.mathpie.MainActivity.*;

public class Level11 extends AppCompatActivity {

    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0;
    Button button_done;
    Button button_hint;
    private SoundPool soundPool;
    EditText editTextAnswer;
    int sound_correct;
    int sound_wrong;
    int sound_click;
    int sound_delete;
    LinearLayout layoutAskFriend;
    private RewardedAd rewardedAd;
    RewardedAdLoadCallback rewardedAdLoadCallback;
    RewardedAdCallback rewardedAdCallback;
    boolean earn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(htmlTextWhiteMenuBack());
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        setContentView(R.layout.activity_level11);

        //It is used for null pointer exception throw;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(4)
                    .setAudioAttributes(audioAttributes)
                    .build();
            getWindow().setNavigationBarColor(Color.parseColor("#1c1c1c"));
        } else {
            soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        }

        sound_correct = soundPool.load(this, R.raw.sound_correct, 1);
        sound_wrong = soundPool.load(this, R.raw.sound_wrong, 1);
        sound_click = soundPool.load(this, R.raw.sound_click, 1);
        sound_delete = soundPool.load(this, R.raw.sound_delete, 1);

        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_done = findViewById(R.id.button_done);
        editTextAnswer = findViewById(R.id.editTextAnswer);
        button_hint = findViewById(R.id.button_hint);
        layoutAskFriend = findViewById(R.id.Ask_friend);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        final MaterialButton buttonAskFriend = new MaterialButton(this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(15, 5, 15, 5);

        buttonAskFriend.setText(R.string.ask_friend);
        buttonAskFriend.setTextColor(Color.parseColor("#cfcfcf"));
        buttonAskFriend.setRippleColor(ColorStateList.valueOf(Color.parseColor("#3d121212")));
        buttonAskFriend.setLayoutParams(params);

        final TextInputLayout textInputLayout = findViewById(R.id.answerEditTextLayout);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (toggleStatus) {
                    soundPool.play(sound_delete, 1, 1, 1, 0, 1);
                }
                editTextAnswer.setText("");
            }
        });

        button_hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
                videoAds(view);

            }
        });

        button_done.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view) {

                String answerString = "0" + editTextAnswer.getText().toString();
                int answerInt = Integer.parseInt(answerString);

                if (answerInt == 18) {

                    if (toggleStatus) {
                        soundPool.play(sound_correct, 1, 1, 1, 0, 1);
                    }

                    level_unlock = 11;
                    level_status_12 = true;

                    SharedPreferences sharedPreferences = getSharedPreferences("level_unlock", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("int", 11);
                    editor.commit();

                    sharedPreferences = getSharedPreferences("level_status_12", MODE_PRIVATE);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("boolean", true);
                    editor.commit();

                    Intent correct = new Intent(getApplicationContext(), Correct.class);
                    startActivity(correct);
                    finish();

                } else {

                    askFriendStatus++;

                    if (askFriendStatus >= 1) {
                        askFriendStatus = 0;
                        layoutAskFriend.removeAllViews();
                        layoutAskFriend.addView(buttonAskFriend);
                    }

                    if (toggleStatus) {
                        soundPool.play(sound_wrong, 1, 1, 1, 0, 1);
                    } else {
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            vibrator.vibrate(VibrationEffect.createOneShot(40, VibrationEffect.DEFAULT_AMPLITUDE));
                        } else {
                            vibrator.vibrate(40);
                        }
                    }


                    CountDownTimer timer = new CountDownTimer(700, 1000) {
                        @Override
                        public void onTick(long l) {
//                            this is helper text shows below the edit text but i have turned it off because is extends the layout size that is why;
                            textInputLayout.setError(".");//I was trying to remove, but it sets hint color and outline(Red).//match_parent is hiding this, from xml which is done with my intention.
                            textInputLayout.setHint("Wrong Answer");
                            editTextAnswer.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red_opacity_eighty_percent));
                        }

                        @Override
                        public void onFinish() {
                            textInputLayout.setError(null);
                            editTextAnswer.setText("");
                            editTextAnswer.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.opacity_Eighty_percent));
                        }
                    }.start();
                }
            }
        });

        buttonAskFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share();
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("0"));

            }

        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("1"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("2"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("3"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("4"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("5"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("6"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("7"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("8"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout.setEndIconVisible(true);
                editTextAnswer.setText(editTextAnswer.getText().append("9"));
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });
    }

    public void videoAds(View view) {
        showRewardedAd();
    }

    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        rewardedAd.loadAd(adRequest, rewardedAdLoadCallback);

    }

    private void showRewardedAd() {
        if (rewardedAd.isLoaded()) {
            rewardedAdCallback = new RewardedAdCallback() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    earn = true;
                }

                @Override
                public void onRewardedAdClosed() {
                    super.onRewardedAdClosed();
                    if (earn) {
                        Intent level11Hint = new Intent(getApplicationContext(), Level11Hint.class);
                        startActivity(level11Hint);
                        editTextAnswer.setText("18");
                        earn = false;
                    }

                }
            };
            rewardedAd.show(Level11.this, rewardedAdCallback);
        } else {

            //        This id is a Test id please ensure to add real one before publishing;
            rewardedAd = new RewardedAd(this, "ca-app-pub-2808567025402378/9038945711");
            loadRewardedAd();

            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(this, R.style.MyDialogTheme);
            builder.setTitle("Get the Solution");

            builder.setMessage("Ad is not loaded, Please try again in a few seconds.");
            builder.setIcon(R.drawable.network_error);


            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (toggleStatus) {
                        soundPool.play(sound_click, 1, 1, 1, 0, 1);
                    }
                    dialogInterface.cancel();
                }
            });
            androidx.appcompat.app.AlertDialog alert = builder.create();

//            I have called show() first then getButton(..) other wise it will throw null pointer;
            alert.show();
            alert.setCanceledOnTouchOutside(false);
            alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.background_121212));

        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        //        This id is a Test id please ensure to add real one before publishing;
        rewardedAd = new RewardedAd(this, "ca-app-pub-2808567025402378/9038945711");
        loadRewardedAd();

        SharedPreferences getShared = getSharedPreferences("toggleStatus", MODE_PRIVATE);
        toggleStatus = getShared.getBoolean("boolean", true);

        getShared = getSharedPreferences("level_status_2", MODE_PRIVATE);
        level_status_2 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_3", MODE_PRIVATE);
        level_status_3 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_4", MODE_PRIVATE);
        level_status_4 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_5", MODE_PRIVATE);
        level_status_5 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_6", MODE_PRIVATE);
        level_status_6 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_7", MODE_PRIVATE);
        level_status_7 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_8", MODE_PRIVATE);
        level_status_8 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_9", MODE_PRIVATE);
        level_status_9 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_10", MODE_PRIVATE);
        level_status_10 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_11", MODE_PRIVATE);
        level_status_11 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_12", MODE_PRIVATE);
        level_status_12 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_13", MODE_PRIVATE);
        level_status_13 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_14", MODE_PRIVATE);
        level_status_14 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_15", MODE_PRIVATE);
        level_status_15 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_16", MODE_PRIVATE);
        level_status_16 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_17", MODE_PRIVATE);
        level_status_17 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_18", MODE_PRIVATE);
        level_status_18 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_19", MODE_PRIVATE);
        level_status_19 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_20", MODE_PRIVATE);
        level_status_20 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_21", MODE_PRIVATE);
        level_status_21 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_22", MODE_PRIVATE);
        level_status_22 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_23", MODE_PRIVATE);
        level_status_23 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_24", MODE_PRIVATE);
        level_status_24 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_25", MODE_PRIVATE);
        level_status_25 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_26", MODE_PRIVATE);
        level_status_26 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_27", MODE_PRIVATE);
        level_status_27 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_28", MODE_PRIVATE);
        level_status_28 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_29", MODE_PRIVATE);
        level_status_29 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_30", MODE_PRIVATE);
        level_status_30 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_31", MODE_PRIVATE);
        level_status_31 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_32", MODE_PRIVATE);
        level_status_32 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_33", MODE_PRIVATE);
        level_status_33 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_34", MODE_PRIVATE);
        level_status_34 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_35", MODE_PRIVATE);
        level_status_35 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_36", MODE_PRIVATE);
        level_status_36 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_37", MODE_PRIVATE);
        level_status_37 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_38", MODE_PRIVATE);
        level_status_38 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_39", MODE_PRIVATE);
        level_status_39 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_40", MODE_PRIVATE);
        level_status_40 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_41", MODE_PRIVATE);
        level_status_41 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_42", MODE_PRIVATE);
        level_status_42 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_43", MODE_PRIVATE);
        level_status_43 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_44", MODE_PRIVATE);
        level_status_44 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_45", MODE_PRIVATE);
        level_status_45 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_46", MODE_PRIVATE);
        level_status_46 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_47", MODE_PRIVATE);
        level_status_47 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_48", MODE_PRIVATE);
        level_status_48 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_49", MODE_PRIVATE);
        level_status_49 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_50", MODE_PRIVATE);
        level_status_50 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_51", MODE_PRIVATE);
        level_status_51 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_52", MODE_PRIVATE);
        level_status_52 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_53", MODE_PRIVATE);
        level_status_53 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_54", MODE_PRIVATE);
        level_status_54 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_55", MODE_PRIVATE);
        level_status_55 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_56", MODE_PRIVATE);
        level_status_56 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_57", MODE_PRIVATE);
        level_status_57 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_58", MODE_PRIVATE);
        level_status_58 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_59", MODE_PRIVATE);
        level_status_59 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_60", MODE_PRIVATE);
        level_status_60 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_61", MODE_PRIVATE);
        level_status_61 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_62", MODE_PRIVATE);
        level_status_62 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_63", MODE_PRIVATE);
        level_status_63 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_64", MODE_PRIVATE);
        level_status_64 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_65", MODE_PRIVATE);
        level_status_65 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_66", MODE_PRIVATE);
        level_status_66 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_67", MODE_PRIVATE);
        level_status_67 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_68", MODE_PRIVATE);
        level_status_68 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_69", MODE_PRIVATE);
        level_status_69 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_70", MODE_PRIVATE);
        level_status_70 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_71", MODE_PRIVATE);
        level_status_71 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_72", MODE_PRIVATE);
        level_status_72 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_73", MODE_PRIVATE);
        level_status_73 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_74", MODE_PRIVATE);
        level_status_74 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_75", MODE_PRIVATE);
        level_status_75 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_76", MODE_PRIVATE);
        level_status_76 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_77", MODE_PRIVATE);
        level_status_77 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_78", MODE_PRIVATE);
        level_status_78 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_79", MODE_PRIVATE);
        level_status_79 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_80", MODE_PRIVATE);
        level_status_80 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_81", MODE_PRIVATE);
        level_status_81 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_82", MODE_PRIVATE);
        level_status_82 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_83", MODE_PRIVATE);
        level_status_83 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_84", MODE_PRIVATE);
        level_status_84 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_85", MODE_PRIVATE);
        level_status_85 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_86", MODE_PRIVATE);
        level_status_86 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_87", MODE_PRIVATE);
        level_status_87 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_88", MODE_PRIVATE);
        level_status_88 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_89", MODE_PRIVATE);
        level_status_89 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_90", MODE_PRIVATE);
        level_status_90 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_91", MODE_PRIVATE);
        level_status_91 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_92", MODE_PRIVATE);
        level_status_92 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_93", MODE_PRIVATE);
        level_status_93 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_94", MODE_PRIVATE);
        level_status_94 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_95", MODE_PRIVATE);
        level_status_95 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_96", MODE_PRIVATE);
        level_status_96 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_97", MODE_PRIVATE);
        level_status_97 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_98", MODE_PRIVATE);
        level_status_98 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_99", MODE_PRIVATE);
        level_status_99 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_100", MODE_PRIVATE);
        level_status_100 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_101", MODE_PRIVATE);
        level_status_101 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_102", MODE_PRIVATE);
        level_status_102 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_103", MODE_PRIVATE);
        level_status_103 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_104", MODE_PRIVATE);
        level_status_104 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_105", MODE_PRIVATE);
        level_status_105 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_106", MODE_PRIVATE);
        level_status_106 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_107", MODE_PRIVATE);
        level_status_107 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_108", MODE_PRIVATE);
        level_status_108 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_109", MODE_PRIVATE);
        level_status_109 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_110", MODE_PRIVATE);
        level_status_110 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_status_111", MODE_PRIVATE);
        level_status_111 = getShared.getBoolean("boolean", false);

        getShared = getSharedPreferences("level_unlock", MODE_PRIVATE);
        level_unlock = getShared.getInt("int",0);

    }

    void share() {

        if (toggleStatus) {
            soundPool.play(sound_click, 1, 1, 1, 0, 1);
        }

        Bitmap bm = BitmapFactory.decodeResource(this.getResources(), R.drawable.level_11_share);

        String text = "Math Pie - Boost your IQ, Memory, Attention, Accuracy, And Logical Skills with 110+" +
                " Math Riddles/Reasoning And Puzzles." +
                " https://play.google.com/store/apps/details?id=com.vibhunorby.mathpie";
        File filesDir = getApplicationContext().getFilesDir();
        File imageFile = new File(filesDir, "MathPie.png");

        OutputStream os;
        try {
            os = new FileOutputStream(imageFile);
            bm.compress(Bitmap.CompressFormat.PNG, 100, os);
            os.flush();
            os.close();
        } catch (Exception e) {
            Log.e(getClass().getSimpleName(), "Error writing bitmap", e);
        }
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        Uri uri = FileProvider.getUriForFile(this, BuildConfig.APPLICATION_ID, imageFile);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        intent.setType("image/png");
        startActivity(Intent.createChooser(intent, "send"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent levels = new Intent(getApplicationContext(), Levels.class);
        startActivity(levels);
        finish();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (toggleStatus) {
                soundPool.play(sound_click, 1, 1, 1, 0, 1);
            }
            finish();
            Intent levels = new Intent(getApplicationContext(), Levels.class);
            startActivity(levels);
        }
        return super.onOptionsItemSelected(item);
    }

    Spanned htmlTextWhiteMenuBack() {
        if (Build.VERSION.SDK_INT >= 24) {

            return Html.fromHtml("<font color='#cfcfcf'>Level 11</font>", Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml("<font color='#cfcfcf'>Level 11</font>");
        }
    }
}