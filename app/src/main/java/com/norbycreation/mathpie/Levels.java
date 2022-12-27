package com.norbycreation.mathpie;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.Objects;
import static com.norbycreation.mathpie.MainActivity.level_status_2;
import static com.norbycreation.mathpie.MainActivity.level_status_3;
import static com.norbycreation.mathpie.MainActivity.level_status_4;
import static com.norbycreation.mathpie.MainActivity.level_status_5;
import static com.norbycreation.mathpie.MainActivity.level_status_6;
import static com.norbycreation.mathpie.MainActivity.level_status_7;
import static com.norbycreation.mathpie.MainActivity.level_status_8;
import static com.norbycreation.mathpie.MainActivity.level_status_9;
import static com.norbycreation.mathpie.MainActivity.level_status_10;
import static com.norbycreation.mathpie.MainActivity.level_status_11;
import static com.norbycreation.mathpie.MainActivity.level_status_12;
import static com.norbycreation.mathpie.MainActivity.level_status_13;
import static com.norbycreation.mathpie.MainActivity.level_status_14;
import static com.norbycreation.mathpie.MainActivity.level_status_15;
import static com.norbycreation.mathpie.MainActivity.level_status_16;
import static com.norbycreation.mathpie.MainActivity.level_status_17;
import static com.norbycreation.mathpie.MainActivity.level_status_18;
import static com.norbycreation.mathpie.MainActivity.level_status_19;
import static com.norbycreation.mathpie.MainActivity.level_status_20;
import static com.norbycreation.mathpie.MainActivity.level_status_21;
import static com.norbycreation.mathpie.MainActivity.level_status_22;
import static com.norbycreation.mathpie.MainActivity.level_status_23;
import static com.norbycreation.mathpie.MainActivity.level_status_24;
import static com.norbycreation.mathpie.MainActivity.level_status_25;
import static com.norbycreation.mathpie.MainActivity.level_status_26;
import static com.norbycreation.mathpie.MainActivity.level_status_27;
import static com.norbycreation.mathpie.MainActivity.level_status_28;
import static com.norbycreation.mathpie.MainActivity.level_status_29;
import static com.norbycreation.mathpie.MainActivity.level_status_30;
import static com.norbycreation.mathpie.MainActivity.level_status_31;
import static com.norbycreation.mathpie.MainActivity.level_status_32;
import static com.norbycreation.mathpie.MainActivity.level_status_33;
import static com.norbycreation.mathpie.MainActivity.level_status_34;
import static com.norbycreation.mathpie.MainActivity.level_status_35;
import static com.norbycreation.mathpie.MainActivity.level_status_36;
import static com.norbycreation.mathpie.MainActivity.level_status_37;
import static com.norbycreation.mathpie.MainActivity.level_status_38;
import static com.norbycreation.mathpie.MainActivity.level_status_39;
import static com.norbycreation.mathpie.MainActivity.level_status_40;
import static com.norbycreation.mathpie.MainActivity.level_status_41;
import static com.norbycreation.mathpie.MainActivity.level_status_42;
import static com.norbycreation.mathpie.MainActivity.level_status_43;
import static com.norbycreation.mathpie.MainActivity.level_status_44;
import static com.norbycreation.mathpie.MainActivity.level_status_45;
import static com.norbycreation.mathpie.MainActivity.level_status_46;
import static com.norbycreation.mathpie.MainActivity.level_status_47;
import static com.norbycreation.mathpie.MainActivity.level_status_48;
import static com.norbycreation.mathpie.MainActivity.level_status_49;
import static com.norbycreation.mathpie.MainActivity.level_status_50;
import static com.norbycreation.mathpie.MainActivity.level_status_51;
import static com.norbycreation.mathpie.MainActivity.level_status_52;
import static com.norbycreation.mathpie.MainActivity.level_status_53;
import static com.norbycreation.mathpie.MainActivity.level_status_54;
import static com.norbycreation.mathpie.MainActivity.level_status_55;
import static com.norbycreation.mathpie.MainActivity.level_status_56;
import static com.norbycreation.mathpie.MainActivity.level_status_57;
import static com.norbycreation.mathpie.MainActivity.level_status_58;
import static com.norbycreation.mathpie.MainActivity.level_status_59;
import static com.norbycreation.mathpie.MainActivity.level_status_60;
import static com.norbycreation.mathpie.MainActivity.level_status_61;
import static com.norbycreation.mathpie.MainActivity.level_status_62;
import static com.norbycreation.mathpie.MainActivity.level_status_63;
import static com.norbycreation.mathpie.MainActivity.level_status_64;
import static com.norbycreation.mathpie.MainActivity.level_status_65;
import static com.norbycreation.mathpie.MainActivity.level_status_66;
import static com.norbycreation.mathpie.MainActivity.level_status_67;
import static com.norbycreation.mathpie.MainActivity.level_status_68;
import static com.norbycreation.mathpie.MainActivity.level_status_69;
import static com.norbycreation.mathpie.MainActivity.level_status_70;
import static com.norbycreation.mathpie.MainActivity.level_status_71;
import static com.norbycreation.mathpie.MainActivity.level_status_72;
import static com.norbycreation.mathpie.MainActivity.level_status_73;
import static com.norbycreation.mathpie.MainActivity.level_status_74;
import static com.norbycreation.mathpie.MainActivity.level_status_75;
import static com.norbycreation.mathpie.MainActivity.level_status_76;
import static com.norbycreation.mathpie.MainActivity.level_status_77;
import static com.norbycreation.mathpie.MainActivity.level_status_78;
import static com.norbycreation.mathpie.MainActivity.level_status_79;
import static com.norbycreation.mathpie.MainActivity.level_status_80;
import static com.norbycreation.mathpie.MainActivity.level_status_81;
import static com.norbycreation.mathpie.MainActivity.level_status_82;
import static com.norbycreation.mathpie.MainActivity.level_status_83;
import static com.norbycreation.mathpie.MainActivity.level_status_84;
import static com.norbycreation.mathpie.MainActivity.level_status_85;
import static com.norbycreation.mathpie.MainActivity.level_status_86;
import static com.norbycreation.mathpie.MainActivity.level_status_87;
import static com.norbycreation.mathpie.MainActivity.level_status_88;
import static com.norbycreation.mathpie.MainActivity.level_status_89;
import static com.norbycreation.mathpie.MainActivity.level_status_90;
import static com.norbycreation.mathpie.MainActivity.level_status_91;
import static com.norbycreation.mathpie.MainActivity.level_status_92;
import static com.norbycreation.mathpie.MainActivity.level_status_93;
import static com.norbycreation.mathpie.MainActivity.level_status_94;
import static com.norbycreation.mathpie.MainActivity.level_status_95;
import static com.norbycreation.mathpie.MainActivity.level_status_96;
import static com.norbycreation.mathpie.MainActivity.level_status_97;
import static com.norbycreation.mathpie.MainActivity.level_status_98;
import static com.norbycreation.mathpie.MainActivity.level_status_99;
import static com.norbycreation.mathpie.MainActivity.level_status_100;
import static com.norbycreation.mathpie.MainActivity.level_status_101;
import static com.norbycreation.mathpie.MainActivity.level_status_102;
import static com.norbycreation.mathpie.MainActivity.level_status_103;
import static com.norbycreation.mathpie.MainActivity.level_status_104;
import static com.norbycreation.mathpie.MainActivity.level_status_105;
import static com.norbycreation.mathpie.MainActivity.level_status_106;
import static com.norbycreation.mathpie.MainActivity.level_status_107;
import static com.norbycreation.mathpie.MainActivity.level_status_108;
import static com.norbycreation.mathpie.MainActivity.level_status_109;
import static com.norbycreation.mathpie.MainActivity.level_status_110;
import static com.norbycreation.mathpie.MainActivity.level_status_111;

import static com.norbycreation.mathpie.MainActivity.level_unlock;
import static com.norbycreation.mathpie.MainActivity.toggleStatus;
public class Levels extends AppCompatActivity {

    private SoundPool soundPool;

    int sound_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setTitle(htmlTextWhiteMenuBack());
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        setContentView(R.layout.activity_levels);


        Button button_level1 = findViewById(R.id.button_level1);
        Button button_level2 = findViewById(R.id.button_level2);
        Button button_level3 = findViewById(R.id.button_level3);
        Button button_level4 = findViewById(R.id.button_level4);
        Button button_level5 = findViewById(R.id.button_level5);
        Button button_level6 = findViewById(R.id.button_level6);
        Button button_level7 = findViewById(R.id.button_level7);
        Button button_level8 = findViewById(R.id.button_level8);
        Button button_level9 = findViewById(R.id.button_level9);
        Button button_level10 = findViewById(R.id.button_level10);
        Button button_level11 = findViewById(R.id.button_level11);
        Button button_level12 = findViewById(R.id.button_level12);
        Button button_level13 = findViewById(R.id.button_level13);
        Button button_level14 = findViewById(R.id.button_level14);
        Button button_level15 = findViewById(R.id.button_level15);
        Button button_level16 = findViewById(R.id.button_level16);
        Button button_level17 = findViewById(R.id.button_level17);
        Button button_level18 = findViewById(R.id.button_level18);
        Button button_level19 = findViewById(R.id.button_level19);
        Button button_level20 = findViewById(R.id.button_level20);
        Button button_level21 = findViewById(R.id.button_level21);
        Button button_level22 = findViewById(R.id.button_level22);
        Button button_level23 = findViewById(R.id.button_level23);
        Button button_level24 = findViewById(R.id.button_level24);
        Button button_level25 = findViewById(R.id.button_level25);
        Button button_level26 = findViewById(R.id.button_level26);
        Button button_level27 = findViewById(R.id.button_level27);
        Button button_level28 = findViewById(R.id.button_level28);
        Button button_level29 = findViewById(R.id.button_level29);
        Button button_level30 = findViewById(R.id.button_level30);
        Button button_level31 = findViewById(R.id.button_level31);
        Button button_level32 = findViewById(R.id.button_level32);
        Button button_level33 = findViewById(R.id.button_level33);
        Button button_level34 = findViewById(R.id.button_level34);
        Button button_level35 = findViewById(R.id.button_level35);
        Button button_level36 = findViewById(R.id.button_level36);
        Button button_level37 = findViewById(R.id.button_level37);
        Button button_level38 = findViewById(R.id.button_level38);
        Button button_level39 = findViewById(R.id.button_level39);
        Button button_level40 = findViewById(R.id.button_level40);
        Button button_level41 = findViewById(R.id.button_level41);
        Button button_level42 = findViewById(R.id.button_level42);
        Button button_level43 = findViewById(R.id.button_level43);
        Button button_level44 = findViewById(R.id.button_level44);
        Button button_level45 = findViewById(R.id.button_level45);
        Button button_level46 = findViewById(R.id.button_level46);
        Button button_level47 = findViewById(R.id.button_level47);
        Button button_level48 = findViewById(R.id.button_level48);
        Button button_level49 = findViewById(R.id.button_level49);
        Button button_level50 = findViewById(R.id.button_level50);
        Button button_level51 = findViewById(R.id.button_level51);
        Button button_level52 = findViewById(R.id.button_level52);
        Button button_level53 = findViewById(R.id.button_level53);
        Button button_level54 = findViewById(R.id.button_level54);
        Button button_level55 = findViewById(R.id.button_level55);
        Button button_level56 = findViewById(R.id.button_level56);
        Button button_level57 = findViewById(R.id.button_level57);
        Button button_level58 = findViewById(R.id.button_level58);
        Button button_level59 = findViewById(R.id.button_level59);
        Button button_level60 = findViewById(R.id.button_level60);
        Button button_level61 = findViewById(R.id.button_level61);
        Button button_level62 = findViewById(R.id.button_level62);
        Button button_level63 = findViewById(R.id.button_level63);
        Button button_level64 = findViewById(R.id.button_level64);
        Button button_level65 = findViewById(R.id.button_level65);
        Button button_level66 = findViewById(R.id.button_level66);
        Button button_level67 = findViewById(R.id.button_level67);
        Button button_level68 = findViewById(R.id.button_level68);
        Button button_level69 = findViewById(R.id.button_level69);
        Button button_level70 = findViewById(R.id.button_level70);
        Button button_level71 = findViewById(R.id.button_level71);
        Button button_level72 = findViewById(R.id.button_level72);
        Button button_level73 = findViewById(R.id.button_level73);
        Button button_level74 = findViewById(R.id.button_level74);
        Button button_level75 = findViewById(R.id.button_level75);
        Button button_level76 = findViewById(R.id.button_level76);
        Button button_level77 = findViewById(R.id.button_level77);
        Button button_level78 = findViewById(R.id.button_level78);
        Button button_level79 = findViewById(R.id.button_level79);
        Button button_level80 = findViewById(R.id.button_level80);
        Button button_level81 = findViewById(R.id.button_level81);
        Button button_level82 = findViewById(R.id.button_level82);
        Button button_level83 = findViewById(R.id.button_level83);
        Button button_level84 = findViewById(R.id.button_level84);
        Button button_level85 = findViewById(R.id.button_level85);
        Button button_level86 = findViewById(R.id.button_level86);
        Button button_level87 = findViewById(R.id.button_level87);
        Button button_level88 = findViewById(R.id.button_level88);
        Button button_level89 = findViewById(R.id.button_level89);
        Button button_level90 = findViewById(R.id.button_level90);
        Button button_level91 = findViewById(R.id.button_level91);
        Button button_level92 = findViewById(R.id.button_level92);
        Button button_level93 = findViewById(R.id.button_level93);
        Button button_level94 = findViewById(R.id.button_level94);
        Button button_level95 = findViewById(R.id.button_level95);
        Button button_level96 = findViewById(R.id.button_level96);
        Button button_level97 = findViewById(R.id.button_level97);
        Button button_level98 = findViewById(R.id.button_level98);
        Button button_level99 = findViewById(R.id.button_level99);
        Button button_level100 = findViewById(R.id.button_level100);
        Button button_level101 = findViewById(R.id.button_level101);
        Button button_level102 = findViewById(R.id.button_level102);
        Button button_level103 = findViewById(R.id.button_level103);
        Button button_level104 = findViewById(R.id.button_level104);
        Button button_level105 = findViewById(R.id.button_level105);
        Button button_level106 = findViewById(R.id.button_level106);
        Button button_level107 = findViewById(R.id.button_level107);
        Button button_level108 = findViewById(R.id.button_level108);
        Button button_level109 = findViewById(R.id.button_level109);
        Button button_level110 = findViewById(R.id.button_level110);


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

        sound_click = soundPool.load(this, R.raw.sound_click, 1);



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



        button_level1.setCompoundDrawablePadding(-5);
        button_level1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);


        if (level_status_2) {
            button_level2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level1.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_3) {
            button_level3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_4) {
            button_level4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);

        }

        if (level_status_5) {
            button_level5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);

        }
        if (level_status_6) {
            button_level6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level5.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);

        }

        if (level_status_7) {
            button_level7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level6.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_8) {
            button_level8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level7.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_9) {
            button_level9.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level8.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
              button_level9.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_10) {
            button_level10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level9.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_11) {
            button_level11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level10.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_12) {
            button_level12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level11.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_13) {
            button_level13.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level12.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level13.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_14) {
            button_level14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level13.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_15) {
            button_level15.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level14.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level15.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_16) {
            button_level16.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level15.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level16.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_17) {
            button_level17.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level16.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level17.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_18) {
            button_level18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level17.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_18) {
            button_level18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level17.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_19) {
            button_level19.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level18.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level19.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_20) {
            button_level20.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level19.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level20.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_21) {
            button_level21.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level20.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level21.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_22) {
            button_level22.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level21.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level22.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_23) {
            button_level23.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level22.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level23.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_24) {
            button_level24.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level23.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level24.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_25) {
            button_level25.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level24.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level25.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_26) {
            button_level26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level25.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_27) {
            button_level27.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level26.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level27.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_28) {
            button_level28.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level27.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level28.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_29) {
            button_level29.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level28.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level29.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_30) {
            button_level30.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level29.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level30.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_31) {
            button_level31.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level30.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level31.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_32) {
            button_level32.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level31.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level32.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_33) {
            button_level33.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level32.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level33.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_34) {
            button_level34.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level33.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level34.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_35) {
            button_level35.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level34.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level35.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_36) {
            button_level36.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level35.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level36.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_37) {
            button_level37.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level36.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level37.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_38) {
            button_level38.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level37.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level38.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_39) {
            button_level39.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level38.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level39.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_40) {
            button_level40.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level39.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level40.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_41) {
            button_level41.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level40.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level41.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_42) {
            button_level42.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level41.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level42.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_43) {
            button_level43.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level42.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level43.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_44) {
            button_level44.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level43.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level44.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_45) {
            button_level45.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level44.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level45.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_46) {
            button_level46.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level45.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level46.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_47) {
            button_level47.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level46.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level47.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_48) {
            button_level48.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level47.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level48.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_49) {
            button_level49.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level48.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level49.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_50) {
            button_level50.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level49.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level50.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_51) {
            button_level51.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level50.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level51.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_52) {
            button_level52.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level51.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level52.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_53) {
            button_level53.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level52.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level53.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_54) {
            button_level54.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level53.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level54.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_55) {
            button_level55.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level54.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level55.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_56) {
            button_level56.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level55.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level56.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_57) {
            button_level57.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level56.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level57.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_58) {
            button_level58.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level57.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level58.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_59) {
            button_level59.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level58.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level59.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_60) {
            button_level60.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level59.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level60.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_61) {
            button_level61.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level60.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level61.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_62) {
            button_level62.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level61.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level62.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_63) {
            button_level63.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level62.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level63.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_64) {
            button_level64.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level63.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level64.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_65) {
            button_level65.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level64.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level65.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_66) {
            button_level66.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level65.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level66.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_67) {
            button_level67.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level66.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level67.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_68) {
            button_level68.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level67.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level68.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_69) {
            button_level69.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level68.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level69.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_70) {
            button_level70.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level69.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level70.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_71) {
            button_level71.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level70.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level71.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_72) {
            button_level72.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level71.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level72.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_73) {
            button_level73.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level72.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level73.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_74) {
            button_level74.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level73.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level74.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_75) {
            button_level75.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level74.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level75.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_76) {
            button_level76.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level75.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level76.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_77) {
            button_level77.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level76.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level77.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_78) {
            button_level78.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level77.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level78.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_79) {
            button_level79.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level78.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level79.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_80) {
            button_level80.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level79.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level80.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_81) {
            button_level81.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level80.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level81.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_82) {
            button_level82.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level81.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level82.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_83) {
            button_level83.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level82.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level83.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_84) {
            button_level84.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level83.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level84.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_85) {
            button_level85.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level84.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level85.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }


        if (level_status_86) {
            button_level86.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level85.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level86.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_87) {
            button_level87.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level86.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level87.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_88) {
            button_level88.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level87.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level88.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_89) {
            button_level89.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level88.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level89.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_90) {
            button_level90.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level89.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level90.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_91) {
            button_level91.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level90.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level91.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_92) {
            button_level92.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level91.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level92.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_93) {
            button_level93.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level92.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level93.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_94) {
            button_level94.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level93.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level94.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_95) {
            button_level95.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level94.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level95.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_96) {
            button_level96.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level95.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level96.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_97) {
            button_level97.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level96.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level97.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_98) {
            button_level98.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level97.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level98.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_99) {
            button_level99.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level98.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level99.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_100) {
            button_level100.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level99.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level100.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_101) {
            button_level101.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level100.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level101.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_102) {
            button_level102.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level101.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level102.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_103) {
            button_level103.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level102.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level103.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_104) {
            button_level104.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level103.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level104.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_105) {
            button_level105.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level104.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level105.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_106) {
            button_level106.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level105.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level106.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_107) {
            button_level107.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level106.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level107.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_108) {
            button_level108.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level107.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level108.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_109) {
            button_level109.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level108.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level109.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if (level_status_110) {
            button_level110.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            button_level109.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));

        } else {
            button_level110.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visibility_off, 0, 0, 0);
        }

        if(level_status_111) {
            button_level110.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#121212")));
        }

        button_level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                Intent levelOne = new Intent(getApplicationContext(), Level1.class);
                startActivity(levelOne);
                finish();
            }
        });
        button_level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_2) {
                    Intent levelTwo = new Intent(getApplicationContext(), Level2.class);
                    startActivity(levelTwo);
                    finish();
                }
            }
        });
        button_level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }
                if (level_status_3) {
                    Intent levelThree = new Intent(getApplicationContext(), Level3.class);
                    startActivity(levelThree);
                    finish();
                }
            }
        });

        button_level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_4) {
                    Intent levelFour = new Intent(getApplicationContext(), Level4.class);
                    startActivity(levelFour);
                    finish();
                }
            }
        });

        button_level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_5) {
                    Intent levelFive = new Intent(getApplicationContext(), Level5.class);
                    startActivity(levelFive);
                    finish();

                }
            }
        });

        button_level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_6) {
                    Intent levelSix = new Intent(getApplicationContext(), Level6.class);
                    startActivity(levelSix);
                    finish();
                }
            }
        });

        button_level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_7) {
                    Intent levelSeven = new Intent(getApplicationContext(), Level7.class);
                    startActivity(levelSeven);
                    finish();
                }
            }
        });

        button_level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_8) {
                    Intent levelEight = new Intent(getApplicationContext(), Level8.class);
                    startActivity(levelEight);
                    finish();
                }
            }
        });

        button_level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_9) {
                    Intent levelNine = new Intent(getApplicationContext(), Level9.class);
                    startActivity(levelNine);
                    finish();
                }
            }
        });

        button_level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_10) {
                    Intent levelTen = new Intent(getApplicationContext(), Level10.class);
                    startActivity(levelTen);
                    finish();
                }
            }
        });

        button_level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_11) {
                    Intent levelEleven = new Intent(getApplicationContext(), Level11.class);
                    startActivity(levelEleven);
                    finish();
                }
            }
        });

        button_level12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_12) {
                    Intent levelTwelve = new Intent(getApplicationContext(), Level12.class);
                    startActivity(levelTwelve);
                    finish();
                }
            }
        });

        button_level13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_13) {
                    Intent levelThirteen = new Intent(getApplicationContext(), Level13.class);
                    startActivity(levelThirteen);
                    finish();
                }
            }
        });

        button_level14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_14) {
                    Intent levelFourteen = new Intent(getApplicationContext(), Level14.class);
                    startActivity(levelFourteen);
                    finish();
                }
            }
        });

        button_level15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_15) {
                    Intent levelFifteen = new Intent(getApplicationContext(), Level15.class);
                    startActivity(levelFifteen);
                    finish();
                }
            }
        });

        button_level16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_16) {
                    Intent levelSixteen = new Intent(getApplicationContext(), Level16.class);
                    startActivity(levelSixteen);
                    finish();
                }
            }
        });

        button_level17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_17) {
                    Intent levelSeventeen = new Intent(getApplicationContext(), Level17.class);
                    startActivity(levelSeventeen);
                    finish();
                }
            }
        });

        button_level18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_18) {
                    Intent levelEighteen = new Intent(getApplicationContext(), Level18.class);
                    startActivity(levelEighteen);
                    finish();
                }
            }
        });

        button_level19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_19) {
                    Intent levelNineteen = new Intent(getApplicationContext(), Level19.class);
                    startActivity(levelNineteen);
                    finish();
                }
            }
        });

        button_level20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_20) {
                    Intent levelTwenty = new Intent(getApplicationContext(), Level20.class);
                    startActivity(levelTwenty);
                    finish();
                }
            }
        });

        button_level21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_21) {
                    Intent levelTwentyOne = new Intent(getApplicationContext(), Level21.class);
                    startActivity(levelTwentyOne);
                    finish();
                }
            }
        });

        button_level22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_22) {
                    Intent levelTwentyTwo = new Intent(getApplicationContext(), Level22.class);
                    startActivity(levelTwentyTwo);
                    finish();
                }
            }
        });

        button_level23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_23) {
                    Intent levelTwentyThree = new Intent(getApplicationContext(), Level23.class);
                    startActivity(levelTwentyThree);
                    finish();
                }
            }
        });

        button_level24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_24) {
                    Intent levelTwentyFour = new Intent(getApplicationContext(), Level24.class);
                    startActivity(levelTwentyFour);
                    finish();
                }
            }
        });

        button_level25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_25) {
                    Intent levelTwentyFive = new Intent(getApplicationContext(), Level25.class);
                    startActivity(levelTwentyFive);
                    finish();
                }
            }
        });

        button_level26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_26) {
                    Intent levelTwentySix = new Intent(getApplicationContext(), Level26.class);
                    startActivity(levelTwentySix);
                    finish();
                }
            }
        });

        button_level27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_27) {
                    Intent levelTwentySeven = new Intent(getApplicationContext(), Level27.class);
                    startActivity(levelTwentySeven);
                    finish();
                }
            }
        });

        button_level28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_28) {
                    Intent levelTwentyEight = new Intent(getApplicationContext(), Level28.class);
                    startActivity(levelTwentyEight);
                    finish();
                }
            }
        });


        button_level29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_29) {
                    Intent levelTwentyNine = new Intent(getApplicationContext(), Level29.class);
                    startActivity(levelTwentyNine);
                    finish();
                }
            }
        });

        button_level30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_30) {
                    Intent levelThirty = new Intent(getApplicationContext(), Level30.class);
                    startActivity(levelThirty);
                    finish();
                }
            }
        });

        button_level31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_31) {
                    Intent levelThirtyOne = new Intent(getApplicationContext(), Level31.class);
                    startActivity(levelThirtyOne);
                    finish();
                }
            }
        });

        button_level32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_32) {
                    Intent levelThirtyTwo = new Intent(getApplicationContext(), Level32.class);
                    startActivity(levelThirtyTwo);
                    finish();
                }
            }
        });

        button_level33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_33) {
                    Intent levelThirtyThree = new Intent(getApplicationContext(), Level33.class);
                    startActivity(levelThirtyThree);
                    finish();
                }
            }
        });

        button_level34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_34) {
                    Intent levelThirtyFour = new Intent(getApplicationContext(), Level34.class);
                    startActivity(levelThirtyFour);
                    finish();
                }
            }
        });

        button_level35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_35) {
                    Intent levelThirtyFive = new Intent(getApplicationContext(), Level35.class);
                    startActivity(levelThirtyFive);
                    finish();
                }
            }
        });

        button_level36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_36) {
                    Intent levelThirtySix = new Intent(getApplicationContext(), Level36.class);
                    startActivity(levelThirtySix);
                    finish();
                }
            }
        });

        button_level37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_37) {
                    Intent levelThirtySeven = new Intent(getApplicationContext(), Level37.class);
                    startActivity(levelThirtySeven);
                    finish();
                }
            }
        });

        button_level38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_38) {
                    Intent levelThirtyEight = new Intent(getApplicationContext(), Level38.class);
                    startActivity(levelThirtyEight);
                    finish();
                }
            }
        });

        button_level39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_39) {
                    Intent levelThirtyNine = new Intent(getApplicationContext(), Level39.class);
                    startActivity(levelThirtyNine);
                    finish();
                }
            }
        });

        button_level40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_40) {
                    Intent levelForty = new Intent(getApplicationContext(), Level40.class);
                    startActivity(levelForty);
                    finish();
                }
            }
        });

        button_level41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_41) {
                    Intent levelFortyOne = new Intent(getApplicationContext(), Level41.class);
                    startActivity(levelFortyOne);
                    finish();
                }
            }
        });

        button_level42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_42) {
                    Intent levelFortyTwo = new Intent(getApplicationContext(), Level42.class);
                    startActivity(levelFortyTwo);
                    finish();
                }
            }
        });

        button_level43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_43) {
                    Intent levelFortyThree = new Intent(getApplicationContext(), Level43.class);
                    startActivity(levelFortyThree);
                    finish();
                }
            }
        });

        button_level44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_44) {
                    Intent levelFortyFour = new Intent(getApplicationContext(), Level44.class);
                    startActivity(levelFortyFour);
                    finish();
                }
            }
        });

        button_level45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_45) {
                    Intent levelFortyFive = new Intent(getApplicationContext(), Level45.class);
                    startActivity(levelFortyFive);
                    finish();
                }
            }
        });

        button_level46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_46) {
                    Intent levelFortySix = new Intent(getApplicationContext(), Level46.class);
                    startActivity(levelFortySix);
                    finish();
                }
            }
        });

        button_level47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_47) {
                    Intent levelFortySeven = new Intent(getApplicationContext(), Level47.class);
                    startActivity(levelFortySeven);
                    finish();
                }
            }
        });

        button_level48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_48) {
                    Intent levelFortyEight = new Intent(getApplicationContext(), Level48.class);
                    startActivity(levelFortyEight);
                    finish();
                }
            }
        });

        button_level49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_49) {
                    Intent levelFortyNine = new Intent(getApplicationContext(), Level49.class);
                    startActivity(levelFortyNine);
                    finish();
                }
            }
        });

        button_level50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_50) {
                    Intent levelFifty = new Intent(getApplicationContext(), Level50.class);
                    startActivity(levelFifty);
                    finish();
                }
            }
        });

        button_level51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_51) {
                    Intent levelFiftyOne = new Intent(getApplicationContext(), Level51.class);
                    startActivity(levelFiftyOne);
                    finish();
                }
            }
        });

        button_level52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_52) {
                    Intent levelFiftyTwo = new Intent(getApplicationContext(), Level52.class);
                    startActivity(levelFiftyTwo);
                    finish();
                }
            }
        });

        button_level53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_53) {
                    Intent levelFiftyThree = new Intent(getApplicationContext(), Level53.class);
                    startActivity(levelFiftyThree);
                    finish();
                }
            }
        });

        button_level54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_54) {
                    Intent levelFiftyFour = new Intent(getApplicationContext(), Level54.class);
                    startActivity(levelFiftyFour);
                    finish();
                }
            }
        });

        button_level55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_55) {
                    Intent levelFiftyFive = new Intent(getApplicationContext(), Level55.class);
                    startActivity(levelFiftyFive);
                    finish();
                }
            }
        });

        button_level56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_56) {
                    Intent levelFiftySix = new Intent(getApplicationContext(), Level56.class);
                    startActivity(levelFiftySix);
                    finish();
                }
            }
        });

        button_level57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_57) {
                    Intent levelFiftySeven = new Intent(getApplicationContext(), Level57.class);
                    startActivity(levelFiftySeven);
                    finish();
                }
            }
        });

        button_level58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_58) {
                    Intent levelFiftyEight = new Intent(getApplicationContext(), Level58.class);
                    startActivity(levelFiftyEight);
                    finish();
                }
            }
        });

        button_level59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_59) {
                    Intent levelFiftyNine = new Intent(getApplicationContext(), Level59.class);
                    startActivity(levelFiftyNine);
                    finish();
                }
            }
        });

        button_level60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_60) {
                    Intent levelSixty = new Intent(getApplicationContext(), Level60.class);
                    startActivity(levelSixty);
                    finish();
                }
            }
        });

        button_level61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_61) {
                    Intent levelSixtyOne = new Intent(getApplicationContext(), Level61.class);
                    startActivity(levelSixtyOne);
                    finish();
                }
            }
        });

        button_level62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_62) {
                    Intent levelSixtyTwo = new Intent(getApplicationContext(), Level62.class);
                    startActivity(levelSixtyTwo);
                    finish();
                }
            }
        });

        button_level63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_63) {
                    Intent levelSixtyThree = new Intent(getApplicationContext(), Level63.class);
                    startActivity(levelSixtyThree);
                    finish();
                }
            }
        });

        button_level64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_64) {
                    Intent levelSixtyFour = new Intent(getApplicationContext(), Level64.class);
                    startActivity(levelSixtyFour);
                    finish();
                }
            }
        });

        button_level65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_65) {
                    Intent levelSixtyFive = new Intent(getApplicationContext(), Level65.class);
                    startActivity(levelSixtyFive);
                    finish();
                }
            }
        });

        button_level66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_66) {
                    Intent levelSixtySix = new Intent(getApplicationContext(), Level66.class);
                    startActivity(levelSixtySix);
                    finish();
                }
            }
        });

        button_level67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_67) {
                    Intent levelSixtySeven = new Intent(getApplicationContext(), Level67.class);
                    startActivity(levelSixtySeven);
                    finish();
                }
            }
        });

        button_level68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_68) {
                    Intent levelSixtyEight = new Intent(getApplicationContext(), Level68.class);
                    startActivity(levelSixtyEight);
                    finish();
                }
            }
        });

        button_level69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_69) {
                    Intent levelSixtyNine = new Intent(getApplicationContext(), Level69.class);
                    startActivity(levelSixtyNine);
                    finish();
                }
            }
        });

        button_level70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_70) {
                    Intent levelSeventy = new Intent(getApplicationContext(), Level70.class);
                    startActivity(levelSeventy);
                    finish();
                }
            }
        });

        button_level71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_71) {
                    Intent levelSeventyOne = new Intent(getApplicationContext(), Level71.class);
                    startActivity(levelSeventyOne);
                    finish();
                }
            }
        });

        button_level72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_72) {
                    Intent levelSeventyTwo = new Intent(getApplicationContext(), Level72.class);
                    startActivity(levelSeventyTwo);
                    finish();
                }
            }
        });

        button_level73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_73) {
                    Intent levelSeventyThree = new Intent(getApplicationContext(), Level73.class);
                    startActivity(levelSeventyThree);
                    finish();
                }
            }
        });

        button_level74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_74) {
                    Intent levelSeventyFour = new Intent(getApplicationContext(), Level74.class);
                    startActivity(levelSeventyFour);
                    finish();
                }
            }
        });

        button_level75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_75) {
                    Intent levelSeventyFive= new Intent(getApplicationContext(), Level75.class);
                    startActivity(levelSeventyFive);
                    finish();
                }
            }
        });

        button_level76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_76) {
                    Intent levelSeventySix = new Intent(getApplicationContext(), Level76.class);
                    startActivity(levelSeventySix);
                    finish();
                }
            }
        });

        button_level77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_77) {
                    Intent levelSeventySeven = new Intent(getApplicationContext(), Level77.class);
                    startActivity(levelSeventySeven);
                    finish();
                }
            }
        });

        button_level78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_78) {
                    Intent levelSventyEight = new Intent(getApplicationContext(), Level78.class);
                    startActivity(levelSventyEight);
                    finish();
                }
            }
        });

        button_level79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_79) {
                    Intent levelSevntyNine = new Intent(getApplicationContext(), Level79.class);
                    startActivity(levelSevntyNine);
                    finish();
                }
            }
        });

        button_level80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_80) {
                    Intent levelEighty = new Intent(getApplicationContext(), Level80.class);
                    startActivity(levelEighty);
                    finish();
                }
            }
        });

        button_level81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_81) {
                    Intent levelEightyOne = new Intent(getApplicationContext(), Level81.class);
                    startActivity(levelEightyOne);
                    finish();
                }
            }
        });

        button_level82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_82) {
                    Intent levelEightyTwo = new Intent(getApplicationContext(), Level82.class);
                    startActivity(levelEightyTwo);
                    finish();
                }
            }
        });

        button_level83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_83) {
                    Intent levelEightyThree = new Intent(getApplicationContext(), Level83.class);
                    startActivity(levelEightyThree);
                    finish();
                }
            }
        });

        button_level84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_84) {
                    Intent levelEightyFour = new Intent(getApplicationContext(), Level84.class);
                    startActivity(levelEightyFour);
                    finish();
                }
            }
        });

        button_level85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_85) {
                    Intent levelEightyFive = new Intent(getApplicationContext(), Level85.class);
                    startActivity(levelEightyFive);
                    finish();
                }
            }
        });

        button_level86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_86) {
                    Intent levelEightySix = new Intent(getApplicationContext(), Level86.class);
                    startActivity(levelEightySix);
                    finish();
                }
            }
        });

        button_level87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_87) {
                    Intent levelEightySeven = new Intent(getApplicationContext(), Level87.class);
                    startActivity(levelEightySeven);
                    finish();
                }
            }
        });

        button_level88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_88) {
                    Intent levelEightyEight = new Intent(getApplicationContext(), Level88.class);
                    startActivity(levelEightyEight);
                    finish();
                }
            }
        });

        button_level89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_89) {
                    Intent levelEightyNine = new Intent(getApplicationContext(), Level89.class);
                    startActivity(levelEightyNine);
                    finish();
                }
            }
        });

        button_level90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_90) {
                    Intent levelNinety = new Intent(getApplicationContext(), Level90.class);
                    startActivity(levelNinety);
                    finish();
                }
            }
        });

        button_level91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_91) {
                    Intent levelNinetyOne = new Intent(getApplicationContext(), Level91.class);
                    startActivity(levelNinetyOne);
                    finish();
                }
            }
        });

        button_level92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_92) {
                    Intent levelNinetyTwo = new Intent(getApplicationContext(), Level92.class);
                    startActivity(levelNinetyTwo);
                    finish();
                }
            }
        });

        button_level93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_93) {
                    Intent levelNinetyThree = new Intent(getApplicationContext(), Level93.class);
                    startActivity(levelNinetyThree);
                    finish();
                }
            }
        });

        button_level94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_94) {
                    Intent levelNinetyFour = new Intent(getApplicationContext(), Level94.class);
                    startActivity(levelNinetyFour);
                    finish();
                }
            }
        });

        button_level95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_95) {
                    Intent levelNinetyFive = new Intent(getApplicationContext(), Level95.class);
                    startActivity(levelNinetyFive);
                    finish();
                }
            }
        });

        button_level96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_96) {
                    Intent levelNinetySix = new Intent(getApplicationContext(), Level96.class);
                    startActivity(levelNinetySix);
                    finish();
                }
            }
        });

        button_level97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_97) {
                    Intent levelNinetySeven = new Intent(getApplicationContext(), Level97.class);
                    startActivity(levelNinetySeven);
                    finish();
                }
            }
        });

        button_level98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_98) {
                    Intent levelNinetyEight = new Intent(getApplicationContext(), Level98.class);
                    startActivity(levelNinetyEight);
                    finish();
                }
            }
        });

        button_level99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_99) {
                    Intent levelNinetyNine = new Intent(getApplicationContext(), Level99.class);
                    startActivity(levelNinetyNine);
                    finish();
                }
            }
        });

        button_level100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_100) {
                    Intent levelHundred = new Intent(getApplicationContext(), Level100.class);
                    startActivity(levelHundred);
                    finish();
                }
            }
        });

        button_level101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_101) {
                    Intent levelHundredOne = new Intent(getApplicationContext(), Level101.class);
                    startActivity(levelHundredOne);
                    finish();
                }
            }
        });

        button_level102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_102) {
                    Intent levelHundredTwo = new Intent(getApplicationContext(), Level102.class);
                    startActivity(levelHundredTwo);
                    finish();
                }
            }
        });

        button_level103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_103) {
                    Intent levelHundredThree = new Intent(getApplicationContext(), Level103.class);
                    startActivity(levelHundredThree);
                    finish();
                }
            }
        });

        button_level104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_104) {
                    Intent levelHundredFour = new Intent(getApplicationContext(), Level104.class);
                    startActivity(levelHundredFour);
                    finish();
                }
            }
        });
        button_level105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_105) {
                    Intent levelHundredFive = new Intent(getApplicationContext(), Level105.class);
                    startActivity(levelHundredFive);
                    finish();
                }
            }
        });

        button_level106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_106) {
                    Intent levelHundredSix = new Intent(getApplicationContext(), Level106.class);
                    startActivity(levelHundredSix);
                    finish();
                }
            }
        });

        button_level107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_107) {
                    Intent levelHundredSeven = new Intent(getApplicationContext(), Level107.class);
                    startActivity(levelHundredSeven);
                    finish();
                }
            }
        });

        button_level108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_108) {
                    Intent levelHundredEight = new Intent(getApplicationContext(), Level108.class);
                    startActivity(levelHundredEight);
                    finish();
                }
            }
        });

        button_level109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_109) {
                    Intent levelHundredNine = new Intent(getApplicationContext(), Level109.class);
                    startActivity(levelHundredNine);
                    finish();
                }
            }
        });

        button_level110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click, 1, 1, 1, 0, 1);
                }

                if (level_status_110) {
                    Intent levelHundredTen = new Intent(getApplicationContext(), Level110.class);
                    startActivity(levelHundredTen);
                    finish();
                }
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (toggleStatus) {
                soundPool.play(sound_click, 1, 1, 1, 0, 1);
            }

        }
        return super.onOptionsItemSelected(item);
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
    Spanned htmlTextWhiteMenuBack() {
        if (Build.VERSION.SDK_INT >= 24) {

            return Html.fromHtml("<font color='#cfcfcf'>Levels</font>", Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml("<font color='#cfcfcf'>Levels</font>");
        }
    }

//    I have called it to behave back button as up button because back button goes back in resume(); but up button goes back in onCreate();
    @Override
    public void onBackPressed() {
        super.onBackPressed();
         onSupportNavigateUp();
    }

}