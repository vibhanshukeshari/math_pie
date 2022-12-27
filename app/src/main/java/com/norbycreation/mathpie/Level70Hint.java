package com.norbycreation.mathpie;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;

import java.util.Objects;

import static com.norbycreation.mathpie.MainActivity.*;
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
import static com.norbycreation.mathpie.MainActivity.level_status_99;

public class Level70Hint extends AppCompatActivity {

    int sound_click;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(htmlTextWhiteMenuBack());
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        setContentView(R.layout.activity_level70_hint);



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



        sound_click = soundPool.load(this,R.raw.sound_click,1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            Intent level70 = new Intent(getApplicationContext(), Level70.class);
            startActivity(level70);
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

            return Html.fromHtml("<font color='#cfcfcf'>Level 70 Solution</font>", Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml("<font color='#cfcfcf'>Level 70 Solution</font>");
        }
    }
}