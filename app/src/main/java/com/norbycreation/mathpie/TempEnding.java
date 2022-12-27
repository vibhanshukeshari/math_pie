package com.norbycreation.mathpie;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import static com.norbycreation.mathpie.MainActivity.*;

public class TempEnding extends AppCompatActivity {

    Button mainMenu, feedback, rateUs, restart;
    ImageButton facebook, instagram;

    int sound_click;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_ending);

        mainMenu = findViewById(R.id.main_menu);
        feedback = findViewById(R.id.feedback);
        restart = findViewById(R.id.restart);

        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);

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
        } else {
            soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        }


        sound_click = soundPool.load(this, R.raw.sound_click, 1);


        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
                onBackPressed();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Intent feedbackEmail = new Intent(Intent.ACTION_SEND);
                feedbackEmail.setType("message/rfc822");
                feedbackEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"vibhanshu.keshari@gmail.com"});
                feedbackEmail.putExtra(Intent.EXTRA_SUBJECT, "Feedback for Math Pie app");
                feedbackEmail.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(feedbackEmail,"choose you email app to send."));


//                if (feedbackEmail.resolveActivity(getPackageManager()) != null) {
//                    startActivity(feedbackEmail);
//                } else {
//                    Toast toast = Toast.makeText(TempEnding.this, "Gmail App is not installed.", Toast.LENGTH_SHORT);
//                    toast.show();
//                }
            }
        });








        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(TempEnding.this, R.style.MyDialogTheme);
                builder.setTitle(R.string.clear_all_data);
                builder.setMessage(R.string.if_you_clear_the_data_game_will_restart);
                builder.setIcon(R.drawable.warning);

                builder.setPositiveButton(R.string.restart, new DialogInterface.OnClickListener() {
                    @SuppressLint("ApplySharedPref")
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        LayoutInflater inflater = getLayoutInflater();
                        View layout = inflater.inflate(R.layout.custom_toast,
                                (ViewGroup) findViewById(R.id.custom_toast_container));
                        TextView text = layout.findViewById(R.id.custom_toast_text);
                        text.setText(R.string.game_is_Restarted);
                        Toast toast = new Toast(getApplicationContext());
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast.setDuration(Toast.LENGTH_LONG);
                        toast.setView(layout);
                        toast.show();


//                                Clearing all cookies and catches;
                        SharedPreferences sharedPreferences = getSharedPreferences("level_unlock", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("executed", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_2", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_3", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_4", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_5", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_6", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_7", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_8", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_9", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_10", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_11", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_12", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_13", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_14", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_15", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_16", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_17", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_18", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_19", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_20", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_21", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_22", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_23", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_24", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_25", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_26", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_27", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_28", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_29", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_30", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_31", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_32", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_33", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_34", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_35", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_36", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_37", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_38", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_39", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_40", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_41", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_42", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_43", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_44", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_45", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_46", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_47", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();


                        sharedPreferences = getSharedPreferences("level_status_48", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_49", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_50", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_51", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_52", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_53", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_54", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_55", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_56", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_57", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_58", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_59", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_60", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_61", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_62", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_63", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_64", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_65", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_66", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_67", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_68", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_69", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_70", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_71", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_72", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_73", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_74", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_75", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_76", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_77", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_78", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_79", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_80", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_81", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_82", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_83", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_84", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_85", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_86", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_87", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_88", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_89", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_90", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_91", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_92", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_93", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_94", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_95", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_96", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_97", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_98", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_99", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_100", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_101", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_102", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_103", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_104", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_105", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_106", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_107", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_108", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_109", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_110", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();

                        sharedPreferences = getSharedPreferences("level_status_111", MODE_PRIVATE);
                        editor = sharedPreferences.edit();
                        editor.clear().commit();


                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

                builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }
                        dialogInterface.cancel();
                    }
                });

                androidx.appcompat.app.AlertDialog alert = builder.create();

                alert.show();
                alert.setCancelable(false);
                alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red_opacity_eighty_percent));
                alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.dark_green));

            }
        });


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Uri uri = Uri.parse("https://www.facebook.com/norbycreation/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Uri uri = Uri.parse("https://www.instagram.com/norbycreation?r=nametag");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();

            }
        });
    }




    @Override
    protected void onResume() {
        super.onResume();


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
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onSupportNavigateUp();
    }
}