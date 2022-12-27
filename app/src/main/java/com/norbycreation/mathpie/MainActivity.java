package com.norbycreation.mathpie;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Serializable;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //    I have Suppress to avoid memory leak because I know static ToggleButton is not a real issue of leak;
    @SuppressLint("StaticFieldLeak")
    static ToggleButton soundButton;
    static  int progressPercent;
    private SoundPool soundPool;
    static boolean toggleStatus = true;
    static int level_unlock = 0;
    static int askFriendStatus = 0;
    static boolean level_status_2 = false;
    static boolean level_status_3 = false;
    static boolean level_status_4 = false;
    static boolean level_status_5 = false;
    static boolean level_status_6 = false;
    static boolean level_status_7 = false;
    static boolean level_status_8 = false;
    static boolean level_status_9 = false;
    static boolean level_status_10 = false;
    static boolean level_status_11 = false;
    static boolean level_status_12 = false;
    static boolean level_status_13 = false;
    static boolean level_status_14 = false;
    static boolean level_status_15 = false;
    static boolean level_status_16 = false;
    static boolean level_status_17 = false;
    static boolean level_status_18 = false;
    static boolean level_status_19 = false;
    static boolean level_status_20 = false;
    static boolean level_status_21 = false;
    static boolean level_status_22 = false;
    static boolean level_status_23 = false;
    static boolean level_status_24 = false;
    static boolean level_status_25 = false;
    static boolean level_status_26 = false;
    static boolean level_status_27 = false;
    static boolean level_status_28 = false;
    static boolean level_status_29 = false;
    static boolean level_status_30 = false;
    static boolean level_status_31 = false;
    static boolean level_status_32 = false;
    static boolean level_status_33 = false;
    static boolean level_status_34 = false;
    static boolean level_status_35 = false;
    static boolean level_status_36 = false;
    static boolean level_status_37 = false;
    static boolean level_status_38 = false;
    static boolean level_status_39 = false;
    static boolean level_status_40 = false;
    static boolean level_status_41 = false;
    static boolean level_status_42 = false;
    static boolean level_status_43 = false;
    static boolean level_status_44 = false;
    static boolean level_status_45 = false;
    static boolean level_status_46 = false;
    static boolean level_status_47 = false;
    static boolean level_status_48 = false;
    static boolean level_status_49 = false;
    static boolean level_status_50 = false;
    static boolean level_status_51 = false;
    static boolean level_status_52 = false;
    static boolean level_status_53 = false;
    static boolean level_status_54 = false;
    static boolean level_status_55 = false;
    static boolean level_status_56 = false;
    static boolean level_status_57 = false;
    static boolean level_status_58 = false;
    static boolean level_status_59 = false;
    static boolean level_status_60 = false;
    static boolean level_status_61 = false;
    static boolean level_status_62 = false;
    static boolean level_status_63 = false;
    static boolean level_status_64 = false;
    static boolean level_status_65 = false;
    static boolean level_status_66 = false;
    static boolean level_status_67 = false;
    static boolean level_status_68 = false;
    static boolean level_status_69 = false;
    static boolean level_status_70 = false;
    static boolean level_status_71 = false;
    static boolean level_status_72 = false;
    static boolean level_status_73 = false;
    static boolean level_status_74 = false;
    static boolean level_status_75 = false;
    static boolean level_status_76 = false;
    static boolean level_status_77 = false;
    static boolean level_status_78 = false;
    static boolean level_status_79 = false;
    static boolean level_status_80 = false;
    static boolean level_status_81 = false;
    static boolean level_status_82 = false;
    static boolean level_status_83 = false;
    static boolean level_status_84 = false;
    static boolean level_status_85 = false;
    static boolean level_status_86 = false;
    static boolean level_status_87 = false;
    static boolean level_status_88 = false;
    static boolean level_status_89 = false;
    static boolean level_status_90 = false;
    static boolean level_status_91 = false;
    static boolean level_status_92 = false;
    static boolean level_status_93 = false;
    static boolean level_status_94 = false;
    static boolean level_status_95 = false;
    static boolean level_status_96 = false;
    static boolean level_status_97 = false;
    static boolean level_status_98 = false;
    static boolean level_status_99 = false;
    static boolean level_status_100 = false;
    static boolean level_status_101 = false;
    static boolean level_status_102 = false;
    static boolean level_status_103 = false;
    static boolean level_status_104 = false;
    static boolean level_status_105 = false;
    static boolean level_status_106 = false;
    static boolean level_status_107 = false;
    static boolean level_status_108 = false;
    static boolean level_status_109 = false;
    static boolean level_status_110 = false;
    static boolean level_status_111 = false;


    public boolean running = false;

    //    rightFab
    FloatingActionButton addSocialFab, facebookFab, instagramFab;
    TextView instagramText, facebookText;

    //    leftFab
    FloatingActionButton addMoreFab, shareFab, rateFab,settingsFab;
    TextView shareText, rateUsText,settingsText;

    Boolean isAllFabsVisible;
    Boolean isAllLeftFabsVisible;

    public  TextView txtProgress;
    public   ProgressBar progressBar;
    private Handler handler = new Handler();
    int sound_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




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
;

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



        progress();


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


        Button play = findViewById(R.id.playButton);
        Button levels = findViewById(R.id.levelsButton);
        soundButton = findViewById(R.id.soundsButton);
        Button exit = findViewById(R.id.exitButton);
        txtProgress =  findViewById(R.id.txtProgress);
        progressBar = findViewById(R.id.progressBar);

        addSocialFab = findViewById(R.id.add_social_fab);
        addMoreFab = findViewById(R.id.add_more);

//        rightFab
        facebookFab = findViewById(R.id.add_facebook_fab);
        instagramFab = findViewById(R.id.add_instagram_fab);

        instagramText = findViewById(R.id.add_instagram_text);
        facebookText = findViewById(R.id.add_facebook_text);

//        leftFab
        settingsFab = findViewById(R.id.add_settings_fab);
        rateFab = findViewById(R.id.add_rate_us);
        shareFab = findViewById(R.id.add_share_fab);

        settingsText = findViewById(R.id.add_settings_text);
        rateUsText = findViewById(R.id.add_rate_us_text);
        shareText = findViewById(R.id.add_share_text);

        sound_click = soundPool.load(this, R.raw.sound_click, 1);

        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
            }
        });

        levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Intent levels = new Intent(getApplicationContext(), Levels.class);
                startActivity(levels);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }


                if (level_status_110) {
                    Intent levelHundredTen = new Intent(getApplicationContext(), Level110.class);
                    startActivity(levelHundredTen);
                } else if (level_status_109) {
                    Intent levelHundredNine = new Intent(getApplicationContext(), Level109.class);
                    startActivity(levelHundredNine);
                } else if (level_status_108) {
                    Intent levelHundredEight = new Intent(getApplicationContext(), Level108.class);
                    startActivity(levelHundredEight);
                } else if (level_status_107) {
                    Intent levelHundredSeven = new Intent(getApplicationContext(), Level107.class);
                    startActivity(levelHundredSeven);
                } else if (level_status_106) {
                    Intent levelHundredSix = new Intent(getApplicationContext(), Level106.class);
                    startActivity(levelHundredSix);
                } else if (level_status_105) {
                    Intent levelHundredFive = new Intent(getApplicationContext(), Level105.class);
                    startActivity(levelHundredFive);
                } else if (level_status_104) {
                    Intent levelHundredFour = new Intent(getApplicationContext(), Level104.class);
                    startActivity(levelHundredFour);
                } else if (level_status_103) {
                    Intent levelHundredThree = new Intent(getApplicationContext(), Level103.class);
                    startActivity(levelHundredThree);
                } else if (level_status_102) {
                    Intent levelHundredTwo = new Intent(getApplicationContext(), Level102.class);
                    startActivity(levelHundredTwo);
                } else if (level_status_101) {
                    Intent levelHundredOne = new Intent(getApplicationContext(), Level101.class);
                    startActivity(levelHundredOne);
                } else if (level_status_100) {
                    Intent levelHundred = new Intent(getApplicationContext(), Level100.class);
                    startActivity(levelHundred);
                } else if (level_status_99) {
                    Intent levelNinetyNine = new Intent(getApplicationContext(), Level99.class);
                    startActivity(levelNinetyNine);
                } else if (level_status_98) {
                    Intent levelNinetyEight = new Intent(getApplicationContext(), Level98.class);
                    startActivity(levelNinetyEight);
                } else if (level_status_97) {
                    Intent levelNinetySeven = new Intent(getApplicationContext(), Level97.class);
                    startActivity(levelNinetySeven);
                } else if (level_status_96) {
                    Intent levelNinetySix = new Intent(getApplicationContext(), Level96.class);
                    startActivity(levelNinetySix);
                } else if (level_status_95) {
                    Intent levelNinetyFive = new Intent(getApplicationContext(), Level95.class);
                    startActivity(levelNinetyFive);
                } else if (level_status_94) {
                    Intent levelNinetyFour = new Intent(getApplicationContext(), Level94.class);
                    startActivity(levelNinetyFour);
                } else if (level_status_93) {
                    Intent levelNinetyThree = new Intent(getApplicationContext(), Level93.class);
                    startActivity(levelNinetyThree);
                } else if (level_status_92) {
                    Intent levelNinetyTwo = new Intent(getApplicationContext(), Level92.class);
                    startActivity(levelNinetyTwo);
                } else if (level_status_91) {
                    Intent levelNinetyOne = new Intent(getApplicationContext(), Level91.class);
                    startActivity(levelNinetyOne);
                } else if (level_status_90) {
                    Intent levelNinety = new Intent(getApplicationContext(), Level90.class);
                    startActivity(levelNinety);
                } else if (level_status_89) {
                    Intent levelEightyNine = new Intent(getApplicationContext(), Level90.class);
                    startActivity(levelEightyNine);
                } else if (level_status_88) {
                    Intent levelEightyEight = new Intent(getApplicationContext(), Level89.class);
                    startActivity(levelEightyEight);
                } else if (level_status_87) {
                    Intent levelEightySeven = new Intent(getApplicationContext(), Level88.class);
                    startActivity(levelEightySeven);
                } else if (level_status_86) {
                    Intent levelEightySix = new Intent(getApplicationContext(), Level87.class);
                    startActivity(levelEightySix);
                } else if (level_status_85) {
                    Intent levelEightyFive = new Intent(getApplicationContext(), Level86.class);
                    startActivity(levelEightyFive);
                } else if (level_status_84) {
                    Intent levelEightyFour = new Intent(getApplicationContext(), Level85.class);
                    startActivity(levelEightyFour);
                } else if (level_status_83) {
                    Intent levelEightyThree = new Intent(getApplicationContext(), Level84.class);
                    startActivity(levelEightyThree);
                } else if (level_status_82) {
                    Intent levelEightyTwo = new Intent(getApplicationContext(), Level83.class);
                    startActivity(levelEightyTwo);
                } else if (level_status_81) {
                    Intent levelEightyOne = new Intent(getApplicationContext(), Level83.class);
                    startActivity(levelEightyOne);
                } else if (level_status_80) {
                    Intent levelEighty = new Intent(getApplicationContext(), Level82.class);
                    startActivity(levelEighty);
                } else if (level_status_79) {
                    Intent levelSeventyNine = new Intent(getApplicationContext(), Level79.class);
                    startActivity(levelSeventyNine);
                } else if (level_status_78) {
                    Intent levelSeventyEight = new Intent(getApplicationContext(), Level78.class);
                    startActivity(levelSeventyEight);
                } else if (level_status_77) {
                    Intent levelSeventySeven= new Intent(getApplicationContext(), Level77.class);
                    startActivity(levelSeventySeven);
                } else if (level_status_76) {
                    Intent levelSeventySix = new Intent(getApplicationContext(), Level76.class);
                    startActivity(levelSeventySix);
                } else if (level_status_75) {
                    Intent levelSeventyFive = new Intent(getApplicationContext(), Level75.class);
                    startActivity(levelSeventyFive);
                } else if (level_status_74) {
                    Intent levelSeventyFour = new Intent(getApplicationContext(), Level74.class);
                    startActivity(levelSeventyFour);
                } else if (level_status_73) {
                    Intent levelSeventyThree = new Intent(getApplicationContext(), Level73.class);
                    startActivity(levelSeventyThree);
                } else if (level_status_72) {
                    Intent levelSeventyTwo = new Intent(getApplicationContext(), Level72.class);
                    startActivity(levelSeventyTwo);
                } else if (level_status_71) {
                    Intent levelSeventyOne = new Intent(getApplicationContext(), Level71.class);
                    startActivity(levelSeventyOne);
                } else if (level_status_70) {
                    Intent levelSeventy = new Intent(getApplicationContext(), Level70.class);
                    startActivity(levelSeventy);
                } else if (level_status_69) {
                    Intent levelSixtyNine = new Intent(getApplicationContext(), Level69.class);
                    startActivity(levelSixtyNine);
                } else if (level_status_68) {
                    Intent levelSixtyEight = new Intent(getApplicationContext(), Level68.class);
                    startActivity(levelSixtyEight);
                } else if (level_status_67) {
                    Intent levelSixtySeven = new Intent(getApplicationContext(), Level67.class);
                    startActivity(levelSixtySeven);
                } else if (level_status_66) {
                    Intent levelSixtySix = new Intent(getApplicationContext(), Level66.class);
                    startActivity(levelSixtySix);
                } else if (level_status_65) {
                    Intent levelSixtyFive = new Intent(getApplicationContext(), Level65.class);
                    startActivity(levelSixtyFive);
                } else if (level_status_64) {
                    Intent levelSixtyFour = new Intent(getApplicationContext(), Level64.class);
                    startActivity(levelSixtyFour);
                } else if (level_status_63) {
                    Intent levelSixtyThree = new Intent(getApplicationContext(), Level63.class);
                    startActivity(levelSixtyThree);
                } else if (level_status_62) {
                    Intent levelSixtyTwo = new Intent(getApplicationContext(), Level62.class);
                    startActivity(levelSixtyTwo);
                } else if (level_status_61) {
                    Intent levelSixtyOne = new Intent(getApplicationContext(), Level61.class);
                    startActivity(levelSixtyOne);
                } else if (level_status_60) {
                    Intent levelSixty = new Intent(getApplicationContext(), Level60.class);
                    startActivity(levelSixty);
                } else if (level_status_59) {
                    Intent levelFiftyNine = new Intent(getApplicationContext(), Level59.class);
                    startActivity(levelFiftyNine);
                } else if (level_status_58) {
                    Intent levelFiftyEight = new Intent(getApplicationContext(), Level58.class);
                    startActivity(levelFiftyEight);
                } else if (level_status_57) {
                    Intent levelFiftySeven = new Intent(getApplicationContext(), Level57.class);
                    startActivity(levelFiftySeven);
                } else if (level_status_56) {
                    Intent levelFiftySix = new Intent(getApplicationContext(), Level56.class);
                    startActivity(levelFiftySix);
                } else if (level_status_55) {
                    Intent levelFiftyFive = new Intent(getApplicationContext(), Level55.class);
                    startActivity(levelFiftyFive);
                } else if (level_status_54) {
                    Intent levelFiftyFour = new Intent(getApplicationContext(), Level54.class);
                    startActivity(levelFiftyFour);
                } else if (level_status_53) {
                    Intent levelFiftyThree = new Intent(getApplicationContext(), Level53.class);
                    startActivity(levelFiftyThree);
                } else if (level_status_52) {
                    Intent levelFiftyTwo = new Intent(getApplicationContext(), Level52.class);
                    startActivity(levelFiftyTwo);
                } else if (level_status_51) {
                    Intent levelFiftyOne = new Intent(getApplicationContext(), Level51.class);
                    startActivity(levelFiftyOne);
                } else if (level_status_50) {
                    Intent levelFifty = new Intent(getApplicationContext(), Level50.class);
                    startActivity(levelFifty);
                } else if (level_status_49) {
                    Intent levelFortyNine = new Intent(getApplicationContext(), Level49.class);
                    startActivity(levelFortyNine);
                } else if (level_status_48) {
                    Intent levelFortyEight = new Intent(getApplicationContext(), Level48.class);
                    startActivity(levelFortyEight);
                } else if (level_status_47) {
                    Intent levelSFortySeven = new Intent(getApplicationContext(), Level47.class);
                    startActivity(levelSFortySeven);
                } else if (level_status_46) {
                    Intent levelFortySix = new Intent(getApplicationContext(), Level46.class);
                    startActivity(levelFortySix);
                } else if (level_status_45) {
                    Intent levelFortFive = new Intent(getApplicationContext(), Level45.class);
                    startActivity(levelFortFive);
                } else if (level_status_44) {
                    Intent levelFortyFour = new Intent(getApplicationContext(), Level44.class);
                    startActivity(levelFortyFour);
                } else if (level_status_43) {
                    Intent levelFortyThree = new Intent(getApplicationContext(), Level43.class);
                    startActivity(levelFortyThree);
                } else if (level_status_42) {
                    Intent levelFortyTwo = new Intent(getApplicationContext(), Level42.class);
                    startActivity(levelFortyTwo);
                } else if (level_status_41) {
                    Intent levelFortyOne = new Intent(getApplicationContext(), Level41.class);
                    startActivity(levelFortyOne);
                } else if (level_status_40) {
                    Intent levelForty = new Intent(getApplicationContext(), Level40.class);
                    startActivity(levelForty);
                } else if (level_status_39) {
                    Intent levelThirtyNine = new Intent(getApplicationContext(), Level39.class);
                    startActivity(levelThirtyNine);
                } else if (level_status_38) {
                    Intent levelThirtyEight = new Intent(getApplicationContext(), Level38.class);
                    startActivity(levelThirtyEight);
                } else if (level_status_37) {
                    Intent levelThirtySeven = new Intent(getApplicationContext(), Level37.class);
                    startActivity(levelThirtySeven);
                } else if (level_status_36) {
                    Intent levelThirtySix = new Intent(getApplicationContext(), Level36.class);
                    startActivity(levelThirtySix);
                } else if (level_status_35) {
                    Intent levelThirtyFive = new Intent(getApplicationContext(), Level35.class);
                    startActivity(levelThirtyFive);
                } else if (level_status_34) {
                    Intent levelThirtyFour = new Intent(getApplicationContext(), Level34.class);
                    startActivity(levelThirtyFour);
                } else if (level_status_33) {
                    Intent levelThirtyThree = new Intent(getApplicationContext(), Level33.class);
                    startActivity(levelThirtyThree);
                } else if (level_status_32) {
                    Intent levelThirtyTwo = new Intent(getApplicationContext(), Level32.class);
                    startActivity(levelThirtyTwo);
                } else if (level_status_31) {
                    Intent levelThirtyOne = new Intent(getApplicationContext(), Level31.class);
                    startActivity(levelThirtyOne);
                } else if (level_status_30) {
                    Intent levelThirty = new Intent(getApplicationContext(), Level30.class);
                    startActivity(levelThirty);
                } else if (level_status_29) {
                    Intent levelTwentyNine = new Intent(getApplicationContext(), Level29.class);
                    startActivity(levelTwentyNine);
                } else if (level_status_28) {
                    Intent levelTwentyEight = new Intent(getApplicationContext(), Level28.class);
                    startActivity(levelTwentyEight);
                } else if (level_status_27) {
                    Intent levelTwentySeven = new Intent(getApplicationContext(), Level27.class);
                    startActivity(levelTwentySeven);
                } else if (level_status_26) {
                    Intent levelTwentySix = new Intent(getApplicationContext(), Level26.class);
                    startActivity(levelTwentySix);
                } else if (level_status_25) {
                    Intent levelTwentyFive = new Intent(getApplicationContext(), Level25.class);
                    startActivity(levelTwentyFive);
                } else if (level_status_24) {
                    Intent levelTwentyFour = new Intent(getApplicationContext(), Level24.class);
                    startActivity(levelTwentyFour);
                } else if (level_status_23) {
                    Intent levelTwentyThree = new Intent(getApplicationContext(), Level23.class);
                    startActivity(levelTwentyThree);
                } else if (level_status_22) {
                    Intent levelTwentyTwo = new Intent(getApplicationContext(), Level22.class);
                    startActivity(levelTwentyTwo);
                } else if (level_status_21) {
                    Intent levelTwentyOne = new Intent(getApplicationContext(), Level21.class);
                    startActivity(levelTwentyOne);
                } else if (level_status_20) {
                    Intent levelTwenty = new Intent(getApplicationContext(), Level20.class);
                    startActivity(levelTwenty);
                } else if (level_status_19) {
                    Intent levelNineteen = new Intent(getApplicationContext(), Level19.class);
                    startActivity(levelNineteen);
                } else if (level_status_18) {
                    Intent levelEighteen = new Intent(getApplicationContext(), Level18.class);
                    startActivity(levelEighteen);
                } else if (level_status_17) {
                    Intent levelSeventeen = new Intent(getApplicationContext(), Level17.class);
                    startActivity(levelSeventeen);
                } else if (level_status_16) {
                    Intent levelSixteen = new Intent(getApplicationContext(), Level16.class);
                    startActivity(levelSixteen);
                } else if (level_status_15) {
                    Intent levelFifteen = new Intent(getApplicationContext(), Level15.class);
                    startActivity(levelFifteen);
                } else if (level_status_14) {
                    Intent levelFourteen = new Intent(getApplicationContext(), Level14.class);
                    startActivity(levelFourteen);
                } else if (level_status_13) {
                    Intent levelThirteen = new Intent(getApplicationContext(), Level13.class);
                    startActivity(levelThirteen);
                } else if (level_status_12) {
                    Intent levelTwelve = new Intent(getApplicationContext(), Level12.class);
                    startActivity(levelTwelve);
                } else if (level_status_11) {
                    Intent levelEleven = new Intent(getApplicationContext(), Level11.class);
                    startActivity(levelEleven);
                } else if (level_status_10) {
                    Intent levelTen = new Intent(getApplicationContext(), Level10.class);
                    startActivity(levelTen);
                } else if (level_status_9) {
                    Intent levelNine = new Intent(getApplicationContext(), Level9.class);
                    startActivity(levelNine);
                } else if (level_status_8) {
                    Intent levelEight = new Intent(getApplicationContext(), Level8.class);
                    startActivity(levelEight);
                } else if (level_status_7) {
                    Intent levelSeven = new Intent(getApplicationContext(), Level7.class);
                    startActivity(levelSeven);
                } else if (level_status_6) {
                    Intent levelSix = new Intent(getApplicationContext(), Level6.class);
                    startActivity(levelSix);
                } else if (level_status_5) {
                    Intent levelFive = new Intent(getApplicationContext(), Level5.class);
                    startActivity(levelFive);
                } else if (level_status_4) {
                    Intent levelFour = new Intent(getApplicationContext(), Level4.class);
                    startActivity(levelFour);
                } else if (level_status_3) {
                    Intent levelThree = new Intent(getApplicationContext(), Level3.class);
                    startActivity(levelThree);
                } else if (level_status_2) {
                    Intent levelTwo = new Intent(getApplicationContext(), Level2.class);
                    startActivity(levelTwo);
                } else {
                    Intent levelOne = new Intent(getApplicationContext(), Level1.class);
                    startActivity(levelOne);
                }
            }
        });

        isAllFabsVisible = false;

        facebookFab.setVisibility(View.GONE);
        instagramFab.setVisibility(View.GONE);
        instagramText.setVisibility(View.GONE);
        facebookText.setVisibility(View.GONE);

        addSocialFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        if (!isAllFabsVisible) {
                            facebookFab.show();
                            instagramFab.show();
                            instagramText.setVisibility(View.VISIBLE);
                            facebookText.setVisibility(View.VISIBLE);
                            isAllFabsVisible = true;
                        } else {
                            facebookFab.hide();
                            instagramFab.hide();
                            instagramText.setVisibility(View.GONE);
                            facebookText.setVisibility(View.GONE);
                            isAllFabsVisible = false;
                        }
                    }
                });

        instagramFab.setOnClickListener(
                new View.OnClickListener() {
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

        facebookFab.setOnClickListener(
                new View.OnClickListener() {
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

        isAllLeftFabsVisible = false;

        shareFab.setVisibility(View.GONE);
        rateFab.setVisibility(View.GONE);
        settingsFab.setVisibility(View.GONE);

        shareText.setVisibility(View.GONE);
        rateUsText.setVisibility(View.GONE);
        settingsText.setVisibility(View.GONE);

        addMoreFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (!isAllLeftFabsVisible) {
                    rateFab.show();
                    settingsFab.show();
                    shareFab.show();
                    rateUsText.setVisibility(View.VISIBLE);
                    settingsText.setVisibility(View.VISIBLE);
                    shareText.setVisibility(View.VISIBLE);
                    isAllLeftFabsVisible = true;
                } else {
                    settingsFab.hide();
                    rateFab.hide();
                    shareFab.hide();

                    settingsText.setVisibility(View.GONE);
                    rateUsText.setVisibility(View.GONE);
                    shareText.setVisibility(View.GONE);
                    isAllLeftFabsVisible = false;
                }
            }
        });
        shareFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                StringBuilder  forShareLink = new StringBuilder();
                forShareLink.append("Download the Math Pie app to Boost your IQ, Memory, Attention, and Logic Skills With 110+ Math Riddles/Reasoning and Puzzles. ");
                forShareLink.append("https://play.google.com/store/apps/details?id=com.vibhunorby.mathpie");

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, (Serializable) forShareLink);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

        settingsFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);


                settingsFab.hide();
                rateFab.hide();
                shareFab.hide();

                settingsText.setVisibility(View.GONE);
                rateUsText.setVisibility(View.GONE);
                shareText.setVisibility(View.GONE);

                isAllLeftFabsVisible = false;

                facebookFab.hide();
                instagramFab.hide();

                instagramText.setVisibility(View.GONE);
                facebookText.setVisibility(View.GONE);

                isAllFabsVisible = false;



//                I have used View to create reference for mReset and mPrivacy below;
                final View mView = getLayoutInflater().inflate(R.layout.settings_dialouge,null);
                final Button mReset = mView.findViewById(R.id.reset);
                final Button mPrivacy = mView.findViewById(R.id.privacy);
                final Button terms = mView.findViewById(R.id.terms);

                mReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this, R.style.MyDialogTheme);
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
//                mBuilder.setCancelable(false);

                mBuilder.setPositiveButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        dialogInterface.cancel();



                    }

                });
                mPrivacy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        Uri uri = Uri.parse("https://math-pie.flycricket.io/privacy.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();
                    }
                });

                terms.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }

                        Uri uri = Uri.parse("https://math-pie.flycricket.io/terms.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();
                    }
                });

                mBuilder.setView(mView);
                mBuilder.show();

            }
        });
        rateFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.vibhunorby.mathpie");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), R.string.redirecting, Toast.LENGTH_SHORT).show();

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this, R.style.MyDialogTheme);
                builder.setTitle(R.string.exit_game);
                builder.setMessage(R.string.are_you_sure_want_to_exit_the_game);
                builder.setIcon(R.drawable.warning);

                builder.setPositiveButton(R.string.exit_no_exclamatory, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (soundButton.isChecked()) {
                            soundPool.play(sound_click, 1, 1, 1, 0, 1);
                        }
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
                alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.background_121212));
                alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.light_gray));
                alert.setCanceledOnTouchOutside(false);
            }
        });
    }

    @SuppressLint("ApplySharedPref")
    @Override
    protected void onStop() {
        super.onStop();

        if (soundButton.isChecked()) {
            toggleStatus = true;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("boolean", true);
            editor.commit();

        } else {
            toggleStatus = false;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.putBoolean("boolean", false);
            editor.commit();
        }
    }

    @SuppressLint("ApplySharedPref")
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (soundButton.isChecked()) {
            toggleStatus = true;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.putBoolean("boolean", true);
            editor.commit();

        } else {
            toggleStatus = false;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("boolean", false);
            editor.commit();
        }
    }

    @SuppressLint("ApplySharedPref")
    @Override
    protected void onPause() {
        super.onPause();

        if (soundButton.isChecked()) {
            toggleStatus = true;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("boolean", true);
            editor.commit();

        } else {
            toggleStatus = false;
            SharedPreferences sharedPreferences = getSharedPreferences("toggleStatus", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("boolean", false);
            editor.commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        settingsFab.hide();
        rateFab.hide();
        shareFab.hide();

        settingsText.setVisibility(View.GONE);
        rateUsText.setVisibility(View.GONE);
        shareText.setVisibility(View.GONE);

        isAllLeftFabsVisible = false;

        facebookFab.hide();
        instagramFab.hide();

        instagramText.setVisibility(View.GONE);
        facebookText.setVisibility(View.GONE);

        isAllFabsVisible = false;

        if (toggleStatus) {
            soundButton.setChecked(true);
        } else {
            soundButton.setChecked(false);
        }

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

    void progress() {



        if (level_status_111) {

            progressPercent = 100;

        }  else if (level_status_110) {
            progressPercent = 99;

        }  else if (level_status_108) {
            progressPercent = 98;

        }  else if (level_status_107) {
            progressPercent = 97;

        }  else if (level_status_106) {
            progressPercent = 96;

        }  else if (level_status_105) {
            progressPercent = 95;

        }  else if (level_status_104) {
            progressPercent = 94;

        }  else if (level_status_103) {
            progressPercent = 93;

        }  else if (level_status_102) {
            progressPercent = 92;

        }  else if (level_status_101) {
            progressPercent = 91;

        }  else if (level_status_100) {
            progressPercent = 90;

        }  else if (level_status_99) {
            progressPercent = 90;

        }  else if (level_status_98) {
            progressPercent = 89;

        }  else if (level_status_97) {
            progressPercent = 88;

        }  else if (level_status_96) {
            progressPercent = 87;

        }  else if (level_status_95) {
            progressPercent = 86;

        }  else if (level_status_94) {
            progressPercent = 85;

        }  else if (level_status_93) {
            progressPercent = 84;

        }  else if (level_status_92) {
            progressPercent = 83;

        }  else if (level_status_91) {
            progressPercent = 82;

        }  else if (level_status_90) {
            progressPercent = 81;

        }  else if (level_status_89) {
            progressPercent = 80;

        }  else if (level_status_88) {
            progressPercent = 80;

        }  else if (level_status_87) {
            progressPercent = 79;

        }  else if (level_status_86) {
            progressPercent = 78;

        }  else if (level_status_85) {
            progressPercent = 77;

        }  else if (level_status_84) {
            progressPercent = 76;

        }  else if (level_status_83) {
            progressPercent = 75;

        }  else if (level_status_82) {
            progressPercent = 74;

        }  else if (level_status_81) {
            progressPercent = 73;

        }  else if (level_status_80) {
            progressPercent = 72;

        }  else if (level_status_79) {
            progressPercent = 71;

        }  else if (level_status_78) {
            progressPercent = 70;

        }  else if (level_status_77) {
            progressPercent = 70;

        }  else if (level_status_76) {
            progressPercent = 69;

        }  else if (level_status_75) {
            progressPercent = 68;

        }  else if (level_status_74) {
            progressPercent = 67;

        }  else if (level_status_73) {
            progressPercent = 66;

        }  else if (level_status_72) {
            progressPercent = 65;

        }  else if (level_status_71) {
            progressPercent = 64;

        }  else if (level_status_70) {
            progressPercent = 63;

        }  else if (level_status_69) {
            progressPercent = 62;

        }  else if (level_status_68) {
            progressPercent = 61;

        }  else if (level_status_67) {
            progressPercent = 60;

        }  else if (level_status_66) {
            progressPercent = 60;

        }  else if (level_status_65) {
            progressPercent = 59;

        }  else if (level_status_64) {
            progressPercent = 58;

        }  else if (level_status_63) {
            progressPercent = 57;

        }  else if (level_status_62) {
            progressPercent = 56;

        }  else if (level_status_61) {
            progressPercent = 55;

        }  else if (level_status_60) {
            progressPercent = 54;

        }  else if (level_status_59) {
            progressPercent = 53;

        }  else if (level_status_58) {
            progressPercent = 52;

        }  else if (level_status_57) {
            progressPercent = 51;

        }  else if (level_status_56) {
            progressPercent = 50;

        }  else if (level_status_55) {
            progressPercent = 50;

        }  else if (level_status_54) {
            progressPercent = 49;

        }  else if (level_status_53) {
            progressPercent = 48;

        }  else if (level_status_52) {
            progressPercent = 47;

        }  else if (level_status_51) {
            progressPercent = 46;

        }  else if (level_status_50) {
            progressPercent = 45;

        }  else if (level_status_49) {
            progressPercent = 44;

        }  else if (level_status_48) {
            progressPercent = 43;

        }  else if (level_status_47) {
            progressPercent = 42;

        }  else if (level_status_46) {
            progressPercent = 41;

        }  else if (level_status_45) {
            progressPercent = 40;

        }  else if (level_status_44) {
            progressPercent = 40;

        }  else if (level_status_43) {
            progressPercent = 39;

        }  else if (level_status_42) {
            progressPercent = 38;

        }  else if (level_status_41) {
            progressPercent = 37;

        }  else if (level_status_40) {
            progressPercent = 36;

        }  else if (level_status_39) {
            progressPercent = 35;

        }  else if (level_status_38) {
            progressPercent = 34;

        }  else if (level_status_37) {
            progressPercent = 33;

        }  else if (level_status_36) {
            progressPercent = 32;

        }  else if (level_status_35) {
            progressPercent = 31;

        }  else if (level_status_34) {
            progressPercent = 30;

        }  else if (level_status_33) {
            progressPercent = 30;

        }  else if (level_status_32) {
            progressPercent = 29;

        }  else if (level_status_31) {
            progressPercent = 28;

        }  else if (level_status_30) {
            progressPercent = 27;

        }  else if (level_status_29) {
            progressPercent = 26;

        }  else if (level_status_28) {
            progressPercent = 25;

        }  else if (level_status_27) {
            progressPercent = 24;

        }  else if (level_status_26) {
            progressPercent = 23;

        }  else if (level_status_25) {
            progressPercent = 22;

        }  else if (level_status_24) {
            progressPercent = 21;

        }  else if (level_status_23) {
            progressPercent = 20;

        }  else if (level_status_22) {
            progressPercent = 20;

        }  else if (level_status_21) {
            progressPercent = 19;

        }  else if (level_status_20) {
            progressPercent = 18;

        }  else if (level_status_19) {
            progressPercent = 17;

        }  else if (level_status_18) {
            progressPercent = 16;

        }  else if (level_status_17) {
            progressPercent = 15;

        }  else if (level_status_16) {
            progressPercent = 14;

        }  else if (level_status_15) {
            progressPercent = 13;

        }  else if (level_status_14) {
            progressPercent = 12;

        }  else if (level_status_13) {
            progressPercent = 11;

        }  else if (level_status_12) {
            progressPercent = 10;

        }  else if (level_status_11) {
            progressPercent = 10;

        }  else if (level_status_10) {
            progressPercent = 9;

        }  else if (level_status_9) {
            progressPercent = 8;

        } else if (level_status_8) {
            progressPercent = 7;

        } else if (level_status_7) {
            progressPercent = 6;

        } else if (level_status_6) {
            progressPercent = 5;

        } else if (level_status_5) {
            progressPercent = 4;

        } else if (level_status_4) {
            progressPercent = 3;

        } else if (level_status_3) {
            progressPercent = 2;
        } else if (level_status_2) {
            progressPercent = 1;

        } else {
            progressPercent = 0;
        }


        Thread timer = new Thread()
        {
            int pStatus;

            public void run() {

                if(progressPercent<50) {

                    for( pStatus = 100; pStatus >= progressPercent; pStatus--){

                        handler.post(new Runnable() {
                            @Override
                            public void run() {

                                progressBar.setProgress(pStatus<0?pStatus++:pStatus);
                                txtProgress.setText(String.format(Locale.ENGLISH, "%d %%",pStatus<0?pStatus++:pStatus));
                            }
                        });

                        try {

                            Thread.sleep(15);

                        } catch (InterruptedException e) {
                            e.printStackTrace();


                        }

                    }

                } else {

                    for( pStatus = 0; pStatus <= progressPercent; pStatus++){

                        handler.post(new Runnable() {
                            @Override
                            public void run() {

                                progressBar.setProgress(pStatus>100?pStatus--:pStatus);
                                txtProgress.setText(String.format(Locale.ENGLISH, "%d %%",pStatus>100?pStatus--:pStatus));
                            }
                        });

                        try {
                            Thread.sleep(15);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }

        };

        if(!timer.isAlive() && (!running) ) {
            timer.start();
            running = true;
        }
    }

    @Override
    public void onBackPressed() {

        settingsFab.hide();
        rateFab.hide();
        shareFab.hide();

        settingsText.setVisibility(View.GONE);
        rateUsText.setVisibility(View.GONE);
        shareText.setVisibility(View.GONE);

        isAllLeftFabsVisible = false;

        facebookFab.hide();
        instagramFab.hide();

        instagramText.setVisibility(View.GONE);
        facebookText.setVisibility(View.GONE);

        isAllFabsVisible = false;


        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this, R.style.MyDialogTheme);
        builder.setTitle(R.string.exit_game);
        builder.setMessage(R.string.are_you_sure_want_to_exit_the_game);
        builder.setIcon(R.drawable.warning);

        builder.setPositiveButton(R.string.exit_no_exclamatory, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (soundButton.isChecked()) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
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
        alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.background_121212));
        alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.light_gray));
        alert.setCanceledOnTouchOutside(false);
    }

}

