package com.norbycreation.mathpie;
//Shape shifter software is used to animate svg tick image exported from adobe xd;
//Sound pool is not good for shortTime
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.norbycreation.mathpie.MainActivity.*;

public class Correct extends AppCompatActivity {

//    int nightModeFlags = getApplicationContext().getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
    Button correct_button;
    ImageView image_view_correct;
    AnimatedVectorDrawable animatedVectorDrawable;
    AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
    private SoundPool soundPool;
    Button  button_level2,button_level3,button_level4,button_level5,button_level6,button_level7,button_level8,button_level9,button_level10;
    Button  button_level11,button_level12,button_level13,button_level14,button_level15,button_level16,button_level17,button_level18,button_level20,button_level21;
    Button  button_level22,button_level23,button_level24,button_level25,button_level26,button_level27,button_level28,button_level29,button_level30,button_level31;
    Button  button_level32,button_level33,button_level34,button_level35,button_level36,button_level37,button_level38,button_level39,button_level40,button_level41;
    Button  button_level42,button_level43,button_level44,button_level45,button_level46,button_level47,button_level48,button_level49,button_level50,button_level51;
    Button  button_level52,button_level53,button_level54,button_level55,button_level56,button_level57,button_level58,button_level59,button_level60,button_level61;
    Button  button_level62,button_level63,button_level64,button_level65,button_level66,button_level67,button_level68,button_level69,button_level70,button_level71;
    Button  button_level72,button_level73,button_level74,button_level75,button_level76,button_level77,button_level78,button_level79,button_level80,button_level81;
    Button  button_level82,button_level83,button_level84,button_level85,button_level86,button_level87,button_level88,button_level89,button_level90,button_level91;
    Button  button_level92,button_level93,button_level94,button_level95,button_level96,button_level97,button_level98,button_level99,button_level100,button_level101;
    Button  button_level102,button_level103,button_level104,button_level105,button_level106,button_level107,button_level108,button_level109,button_level110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);


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






        if(level_status_110) {
            try {
                button_level110.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            } catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        }else if(level_status_109) {
            try {
                button_level109.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            } catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_108) {
            try {
                button_level108.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_107) {
            try {
                button_level107.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_106) {
            try {
                button_level106.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_105) {
            try {
                button_level105.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_104) {
            try {
                button_level104.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_103) {
            try {
                button_level103.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_102) {
            try {
                button_level102.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_101) {
            try {
                button_level101.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_100) {
            try {
                button_level100.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_99) {
            try {
                button_level99.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_98) {
            try {
                button_level98.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_97) {
            try {
                button_level97.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_96) {
            try {
                button_level96.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_95) {
            try {
                button_level95.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_94) {
            try {
                button_level94.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_93) {
            try {
                button_level93.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_92) {
            try {
                button_level92.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_91) {
            try {
                button_level91.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_90) {
            try {
                button_level90.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_89) {
            try {
                button_level89.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_88) {
            try {
                button_level88.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_87) {
            try {
                button_level87.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_86) {
            try {
                button_level86.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_85) {
            try {
                button_level85.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_84) {
            try {
                button_level84.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_83) {
            try {
                button_level83.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_82) {
            try {
                button_level82.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_81) {
            try {
                button_level81.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_80) {
            try {
                button_level80.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_79) {
            try {
                button_level79.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_78) {
            try {
                button_level78.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_77) {
            try {
                button_level77.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_76) {
            try {
                button_level76.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_75) {
            try {
                button_level75.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_74) {
            try {
                button_level74.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_73) {
            try {
                button_level73.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_72) {
            try {
                button_level72.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_71) {
            try {
                button_level71.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_70) {
            try {
                button_level70.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_69) {
            try {
                button_level69.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_68) {
            try {
                button_level68.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_67) {
            try {
                button_level67.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_66) {
            try {
                button_level66.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_65) {
            try {
                button_level65.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_64) {
            try {
                button_level64.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_63) {
            try {
                button_level63.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_62) {
            try {
                button_level62.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_61) {
            try {
                button_level61.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_60) {
            try {
                button_level60.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_59) {
            try {
                button_level59.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_58) {
            try {
                button_level58.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_57) {
            try {
                button_level57.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_56) {
            try {
                button_level56.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_55) {
            try {
                button_level55.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_54) {
            try {
                button_level54.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_53) {
            try {
                button_level53.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_52) {
            try {
                button_level52.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_51) {
            try {
                button_level51.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_50) {
            try {
                button_level50.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_49) {
            try {
                button_level49.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_48) {
            try {
                button_level48.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_47) {
            try {
                button_level47.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_46) {
            try {
                button_level46.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_45) {
            try {
                button_level45.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_44) {
            try {
                button_level44.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_43) {
            try {
                button_level43.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_42) {
            try {
                button_level42.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_41) {
            try {
                button_level41.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_40) {
            try {
                button_level40.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_39) {
            try {
                button_level39.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_38) {
            try {
                button_level38.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_37) {
            try {
                button_level37.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_36) {
            try {
                button_level36.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_35) {
            try {
                button_level35.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_34) {
            try {
                button_level34.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_33) {
            try {
                button_level33.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_32) {
            try {
                button_level32.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_31) {
            try {
                button_level31.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_30) {
            try {
                button_level30.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_29) {
            try {
                button_level29.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_28) {
            try {
                button_level28.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_27) {
            try {
                button_level27.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_26) {
            try {
                button_level26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_25) {
            try {
                button_level25.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_24) {
            try {
                button_level24.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_23) {
            try {
                button_level23.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_22) {
            try {
                button_level22.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_21) {
            try {
                button_level21.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_20) {
            try {
                button_level20.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_19) {
            try {
                button_level29.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_18) {
            try {
                button_level18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_17) {
            try {
                button_level17.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_16) {
            try {
                button_level16.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_15) {
            try {
                button_level15.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_14) {
            try {
                button_level14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_13) {
            try {
                button_level13.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_12) {
            try {
                button_level12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_11) {
            try {
                button_level11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_10) {
            try {
                button_level10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_9) {
            try {
                button_level9.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_8) {
            try {
                button_level8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_7) {
            try {
                button_level7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_6) {
            try {
                button_level6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                The more you learn the more you earn
            }

        } else if(level_status_5) {
            try {
                button_level5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                 I don't care how beautiful you are, If your personality is ugly you are ugly
            }

        } else if (level_status_4) {
            try {
                button_level4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                 Where you stand depend on where you sit
            }

        } else if (level_status_3) {
            try {
                button_level3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//                  Greed is like a sea water, the more you drink the more thirstier you get
            }


        } else if (level_status_2) {
            try {
                button_level2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_visible, 0, 0, 0);
            }
            catch (NullPointerException e) {
//           The more you learn the more you earn
            }

        }



        correct_button = findViewById(R.id.correct_button);
        image_view_correct = findViewById(R.id.image_view_correct);
        Drawable drawable = image_view_correct.getDrawable();

        if(drawable instanceof AnimatedVectorDrawableCompat) {
            animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
            animatedVectorDrawableCompat.start();

        } else if(drawable instanceof AnimatedVectorDrawable) {
            animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.start();
        }

        final int sound_click = soundPool.load(this,R.raw.sound_click,1);

        correct_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleStatus) {
                    soundPool.play(sound_click,1,1,1,0,1);
                }

                if(level_unlock == 1) {
                    Intent levelTwo = new Intent(getApplicationContext(), Level2.class);
                    startActivity(levelTwo);
                     finish();
                } else if (level_unlock == 2) {
                    Intent levelThree = new Intent(getApplicationContext(), Level3.class);
                    startActivity(levelThree);
                    finish();
                } else if (level_unlock == 3) {
                    Intent levelFour = new Intent(getApplicationContext(), Level4.class);
                    startActivity(levelFour);
                    finish();
                } else if (level_unlock == 4) {
                    Intent levelFive = new Intent(getApplicationContext(), Level5.class);
                    startActivity(levelFive);
                    finish();
                } else if (level_unlock == 5) {
                    Intent levelSix = new Intent(getApplicationContext(), Level6.class);
                    startActivity(levelSix);
                    finish();
                } else if(level_unlock == 6) {
                    Intent levelSeven = new Intent(getApplicationContext(), Level7.class);
                    startActivity(levelSeven);
                    finish();
                } else if(level_unlock == 7) {
                    Intent levelEight = new Intent(getApplicationContext(), Level8.class);
                    startActivity(levelEight);
                    finish();
                } else if(level_unlock == 8) {
                    Intent levelNine = new Intent(getApplicationContext(), Level9.class);
                    startActivity(levelNine);
                    finish();
                } else if(level_unlock == 9) {
                    Intent levelTen = new Intent(getApplicationContext(), Level10.class);
                    startActivity(levelTen);
                    finish();
                } else if(level_unlock == 10) {
                    Intent levelEleven = new Intent(getApplicationContext(), Level11.class);
                    startActivity(levelEleven);
                    finish();
                } else if(level_unlock == 11) {
                    Intent levelTwelve = new Intent(getApplicationContext(), Level12.class);
                    startActivity(levelTwelve);
                    finish();
                } else if(level_unlock == 12) {
                    Intent levelThirteen = new Intent(getApplicationContext(), Level13.class);
                    startActivity(levelThirteen);
                    finish();
                } else if(level_unlock == 13) {
                    Intent levelFourteen = new Intent(getApplicationContext(), Level14.class);
                    startActivity(levelFourteen);
                    finish();
                } else if(level_unlock == 14) {
                    Intent levelFifteen = new Intent(getApplicationContext(), Level15.class);
                    startActivity(levelFifteen);
                    finish();
                } else if(level_unlock == 15) {
                    Intent levelSixteen = new Intent(getApplicationContext(), Level16.class);
                    startActivity(levelSixteen);
                    finish();
                } else if(level_unlock == 16) {
                    Intent levelSeventeen = new Intent(getApplicationContext(), Level17.class);
                    startActivity(levelSeventeen);
                    finish();
                } else if(level_unlock == 17) {
                    Intent levelEighteen = new Intent(getApplicationContext(), Level18.class);
                    startActivity(levelEighteen);
                    finish();
                } else if(level_unlock == 18) {
                    Intent levelNineteen = new Intent(getApplicationContext(), Level19.class);
                    startActivity(levelNineteen);
                    finish();
                } else if(level_unlock == 19) {
                    Intent levelTwenty = new Intent(getApplicationContext(), Level20.class);
                    startActivity(levelTwenty);
                    finish();
                } else if(level_unlock == 20) {
                    Intent levelTwentyOne = new Intent(getApplicationContext(), Level21.class);
                    startActivity(levelTwentyOne);
                    finish();
                } else if(level_unlock == 21) {
                    Intent levelTwentyTwo = new Intent(getApplicationContext(), Level22.class);
                    startActivity(levelTwentyTwo);
                    finish();
                } else if(level_unlock == 22) {
                    Intent levelTwentyThree = new Intent(getApplicationContext(), Level23.class);
                    startActivity(levelTwentyThree);
                    finish();
                } else if(level_unlock == 23) {
                    Intent levelTwentyFour = new Intent(getApplicationContext(), Level24.class);
                    startActivity(levelTwentyFour);
                    finish();
                } else if(level_unlock == 24) {
                    Intent levelTwentyFive = new Intent(getApplicationContext(), Level25.class);
                    startActivity(levelTwentyFive);
                    finish();
                } else if(level_unlock == 25) {
                    Intent levelTwentySix = new Intent(getApplicationContext(), Level26.class);
                    startActivity(levelTwentySix);
                    finish();
                } else if(level_unlock == 26) {
                    Intent levelTwentySeven = new Intent(getApplicationContext(), Level27.class);
                    startActivity(levelTwentySeven);
                    finish();
                } else if(level_unlock == 27) {
                    Intent levelTwentyEight = new Intent(getApplicationContext(), Level28.class);
                    startActivity(levelTwentyEight);
                    finish();
                } else if(level_unlock == 28) {
                    Intent levelTwentyNine = new Intent(getApplicationContext(), Level29.class);
                    startActivity(levelTwentyNine);
                    finish();
                } else if(level_unlock == 29) {
                    Intent levelThirty = new Intent(getApplicationContext(), Level30.class);
                    startActivity(levelThirty);
                    finish();
                } else if(level_unlock == 30) {
                    Intent levelThirtyOne = new Intent(getApplicationContext(), Level31.class);
                    startActivity(levelThirtyOne);
                    finish();
                } else if(level_unlock == 31) {
                    Intent levelThirtyTwo = new Intent(getApplicationContext(), Level32.class);
                    startActivity(levelThirtyTwo);
                    finish();
                } else if(level_unlock == 32) {
                    Intent levelThirtyThree = new Intent(getApplicationContext(), Level33.class);
                    startActivity(levelThirtyThree);
                    finish();
                } else if(level_unlock == 33) {
                    Intent levelThirtyFour = new Intent(getApplicationContext(), Level34.class);
                    startActivity(levelThirtyFour);
                    finish();
                } else if(level_unlock == 34) {
                    Intent levelThirtyFive = new Intent(getApplicationContext(), Level35.class);
                    startActivity(levelThirtyFive);
                    finish();
                } else if(level_unlock == 35) {
                    Intent levelThirtySix = new Intent(getApplicationContext(), Level36.class);
                    startActivity(levelThirtySix);
                    finish();
                } else if(level_unlock == 36) {
                    Intent levelThirtySeven = new Intent(getApplicationContext(), Level37.class);
                    startActivity(levelThirtySeven);
                    finish();
                } else if(level_unlock == 37) {
                    Intent levelThirtyEight = new Intent(getApplicationContext(), Level38.class);
                    startActivity(levelThirtyEight);
                    finish();
                } else if(level_unlock == 38) {
                    Intent levelThirtyNine = new Intent(getApplicationContext(), Level39.class);
                    startActivity(levelThirtyNine);
                    finish();
                } else if(level_unlock == 39) {
                    Intent levelForty = new Intent(getApplicationContext(), Level40.class);
                    startActivity(levelForty);
                    finish();
                } else if(level_unlock == 40) {
                    Intent levelFortyOne = new Intent(getApplicationContext(), Level41.class);
                    startActivity(levelFortyOne);
                    finish();
                } else if(level_unlock == 41) {
                    Intent levelFortyTwo = new Intent(getApplicationContext(), Level42.class);
                    startActivity(levelFortyTwo);
                    finish();
                } else if(level_unlock == 42) {
                    Intent levelFortyThree = new Intent(getApplicationContext(), Level43.class);
                    startActivity(levelFortyThree);
                    finish();
                } else if(level_unlock == 43) {
                    Intent levelFortyFour = new Intent(getApplicationContext(), Level44.class);
                    startActivity(levelFortyFour);
                    finish();
                } else if(level_unlock == 44) {
                    Intent levelFortyFive = new Intent(getApplicationContext(), Level45.class);
                    startActivity(levelFortyFive);
                    finish();
                } else if(level_unlock == 45) {
                    Intent levelFortySix = new Intent(getApplicationContext(), Level46.class);
                    startActivity(levelFortySix);
                    finish();
                } else if(level_unlock == 46) {
                    Intent levelFortySeven = new Intent(getApplicationContext(), Level47.class);
                    startActivity(levelFortySeven);
                    finish();
                } else if(level_unlock == 47) {
                    Intent levelFortyEight = new Intent(getApplicationContext(), Level48.class);
                    startActivity(levelFortyEight);
                    finish();
                } else if(level_unlock == 48) {
                    Intent levelFortyNine = new Intent(getApplicationContext(), Level49.class);
                    startActivity(levelFortyNine);
                    finish();
                } else if(level_unlock == 49) {
                    Intent levelFifty = new Intent(getApplicationContext(), Level50.class);
                    startActivity(levelFifty);
                    finish();
                } else if(level_unlock == 50) {
                    Intent levelFiftyOne = new Intent(getApplicationContext(), Level51.class);
                    startActivity(levelFiftyOne);
                    finish();
                } else if(level_unlock == 51) {
                    Intent levelFiftyTwo = new Intent(getApplicationContext(), Level52.class);
                    startActivity(levelFiftyTwo);
                    finish();
                } else if(level_unlock == 52) {
                    Intent levelFiftyThree = new Intent(getApplicationContext(), Level53.class);
                    startActivity(levelFiftyThree);
                    finish();
                } else if(level_unlock == 53) {
                    Intent levelFiftyFour = new Intent(getApplicationContext(), Level54.class);
                    startActivity(levelFiftyFour);
                    finish();
                } else if(level_unlock == 54) {
                    Intent levelFiftyFive = new Intent(getApplicationContext(), Level55.class);
                    startActivity(levelFiftyFive);
                    finish();
                } else if(level_unlock == 55) {
                    Intent levelFiftySix = new Intent(getApplicationContext(), Level56.class);
                    startActivity(levelFiftySix);
                    finish();
                } else if(level_unlock == 56) {
                    Intent levelFiftySeven = new Intent(getApplicationContext(), Level57.class);
                    startActivity(levelFiftySeven);
                    finish();
                } else if(level_unlock == 57) {
                    Intent levelFiftyEight = new Intent(getApplicationContext(), Level58.class);
                    startActivity(levelFiftyEight);
                    finish();
                } else if(level_unlock == 58) {
                    Intent levelFiftyNine = new Intent(getApplicationContext(), Level59.class);
                    startActivity(levelFiftyNine);
                    finish();
                } else if(level_unlock == 59) {
                    Intent levelSixty = new Intent(getApplicationContext(), Level60.class);
                    startActivity(levelSixty);
                    finish();
                } else if(level_unlock == 60) {
                    Intent levelSixtyOne = new Intent(getApplicationContext(), Level61.class);
                    startActivity(levelSixtyOne);
                    finish();
                } else if(level_unlock == 61) {
                    Intent levelSixtyTwo = new Intent(getApplicationContext(), Level62.class);
                    startActivity(levelSixtyTwo);
                    finish();
                } else if(level_unlock == 62) {
                    Intent levelSixtyThree = new Intent(getApplicationContext(), Level63.class);
                    startActivity(levelSixtyThree);
                    finish();
                } else if(level_unlock == 63) {
                    Intent levelSixtyFour = new Intent(getApplicationContext(), Level64.class);
                    startActivity(levelSixtyFour);
                    finish();
                } else if(level_unlock == 64) {
                    Intent levelSixtyFive = new Intent(getApplicationContext(), Level65.class);
                    startActivity(levelSixtyFive);
                    finish();
                } else if(level_unlock == 65) {
                    Intent levelSixtySix = new Intent(getApplicationContext(), Level66.class);
                    startActivity(levelSixtySix);
                    finish();
                } else if(level_unlock == 66) {
                    Intent levelSixtySeven = new Intent(getApplicationContext(), Level67.class);
                    startActivity(levelSixtySeven);
                    finish();
                } else if(level_unlock == 67) {
                    Intent levelSixtyEight = new Intent(getApplicationContext(), Level68.class);
                    startActivity(levelSixtyEight);
                    finish();
                } else if(level_unlock == 68) {
                    Intent levelSixtyNine = new Intent(getApplicationContext(), Level69.class);
                    startActivity(levelSixtyNine);
                    finish();
                } else if(level_unlock == 69) {
                    Intent levelSeventy = new Intent(getApplicationContext(), Level70.class);
                    startActivity(levelSeventy);
                    finish();
                } else if(level_unlock == 70) {
                    Intent levelSeventyOne = new Intent(getApplicationContext(), Level71.class);
                    startActivity(levelSeventyOne);
                    finish();
                } else if(level_unlock == 71) {
                    Intent levelSeventyTwo = new Intent(getApplicationContext(), Level72.class);
                    startActivity(levelSeventyTwo);
                    finish();
                } else if(level_unlock == 72) {
                    Intent levelSeventyThree = new Intent(getApplicationContext(), Level73.class);
                    startActivity(levelSeventyThree);
                    finish();
                } else if(level_unlock == 73) {
                    Intent levelSeventyFour = new Intent(getApplicationContext(), Level74.class);
                    startActivity(levelSeventyFour);
                    finish();
                } else if(level_unlock == 74) {
                    Intent levelSeventyFive = new Intent(getApplicationContext(), Level75.class);
                    startActivity(levelSeventyFive);
                    finish();
                } else if(level_unlock == 75) {
                    Intent levelSeventySix = new Intent(getApplicationContext(), Level76.class);
                    startActivity(levelSeventySix);
                    finish();
                } else if(level_unlock == 76) {
                    Intent levelSeventySeven = new Intent(getApplicationContext(), Level77.class);
                    startActivity(levelSeventySeven);
                    finish();
                } else if(level_unlock == 77) {
                    Intent levelSeventyEight = new Intent(getApplicationContext(), Level78.class);
                    startActivity(levelSeventyEight);
                    finish();
                } else if(level_unlock == 78) {
                    Intent levelSeventyNine = new Intent(getApplicationContext(), Level79.class);
                    startActivity(levelSeventyNine);
                    finish();
                } else if(level_unlock == 79) {
                    Intent levelEighty = new Intent(getApplicationContext(), Level80.class);
                    startActivity(levelEighty);
                    finish();
                } else if(level_unlock == 80) {
                    Intent levelEightyOne = new Intent(getApplicationContext(), Level81.class);
                    startActivity(levelEightyOne);
                    finish();
                } else if(level_unlock == 81) {
                    Intent levelEightyTwo = new Intent(getApplicationContext(), Level82.class);
                    startActivity(levelEightyTwo);
                    finish();
                } else if(level_unlock == 82) {
                    Intent levelEightyThree = new Intent(getApplicationContext(), Level83.class);
                    startActivity(levelEightyThree);
                    finish();
                } else if(level_unlock == 83) {
                    Intent levelEightyFour = new Intent(getApplicationContext(), Level84.class);
                    startActivity(levelEightyFour);
                    finish();
                } else if(level_unlock == 84) {
                    Intent levelEightyFive = new Intent(getApplicationContext(), Level85.class);
                    startActivity(levelEightyFive);
                    finish();
                } else if(level_unlock == 85) {
                    Intent levelEightySix = new Intent(getApplicationContext(), Level86.class);
                    startActivity(levelEightySix);
                    finish();
                } else if(level_unlock == 86) {
                    Intent levelEightySeven = new Intent(getApplicationContext(), Level87.class);
                    startActivity(levelEightySeven);
                    finish();
                } else if(level_unlock == 87) {
                    Intent levelEightyEight = new Intent(getApplicationContext(), Level88.class);
                    startActivity(levelEightyEight);
                    finish();
                } else if(level_unlock == 88) {
                    Intent levelEightyNine = new Intent(getApplicationContext(), Level89.class);
                    startActivity(levelEightyNine);
                    finish();
                } else if(level_unlock == 89) {
                    Intent levelNinety = new Intent(getApplicationContext(), Level90.class);
                    startActivity(levelNinety);
                    finish();
                } else if(level_unlock == 90) {
                    Intent levelNinetyOne = new Intent(getApplicationContext(), Level91.class);
                    startActivity(levelNinetyOne);
                    finish();
                } else if(level_unlock == 91) {
                    Intent levelNinetyTwo = new Intent(getApplicationContext(), Level92.class);
                    startActivity(levelNinetyTwo);
                    finish();
                } else if(level_unlock == 92) {
                    Intent levelNinetyThree = new Intent(getApplicationContext(), Level93.class);
                    startActivity(levelNinetyThree);
                    finish();
                } else if(level_unlock == 93) {
                    Intent levelNinetyFour = new Intent(getApplicationContext(), Level94.class);
                    startActivity(levelNinetyFour);
                    finish();
                } else if(level_unlock == 94) {
                    Intent levelNinetyFive = new Intent(getApplicationContext(), Level95.class);
                    startActivity(levelNinetyFive);
                    finish();
                } else if(level_unlock == 95) {
                    Intent levelNinetySix = new Intent(getApplicationContext(), Level96.class);
                    startActivity(levelNinetySix);
                    finish();
                } else if(level_unlock == 96) {
                    Intent levelNinetySeven = new Intent(getApplicationContext(), Level97.class);
                    startActivity(levelNinetySeven);
                    finish();
                } else if(level_unlock == 97) {
                    Intent levelNinetyEight = new Intent(getApplicationContext(), Level98.class);
                    startActivity(levelNinetyEight);
                    finish();
                } else if(level_unlock == 98) {
                    Intent levelNinetyNine = new Intent(getApplicationContext(), Level99.class);
                    startActivity(levelNinetyNine);
                    finish();
                } else if(level_unlock == 99) {
                    Intent levelHundred = new Intent(getApplicationContext(), Level100.class);
                    startActivity(levelHundred);
                    finish();
                } else if(level_unlock == 100) {
                    Intent levelHundredOne = new Intent(getApplicationContext(), Level101.class);
                    startActivity(levelHundredOne);
                    finish();
                } else if(level_unlock == 101) {
                    Intent levelHundredTwo = new Intent(getApplicationContext(), Level102.class);
                    startActivity(levelHundredTwo);
                    finish();
                } else if(level_unlock == 102) {
                    Intent levelHundredThree = new Intent(getApplicationContext(), Level103.class);
                    startActivity(levelHundredThree);
                    finish();
                } else if(level_unlock == 103) {
                    Intent levelHundredFour = new Intent(getApplicationContext(), Level104.class);
                    startActivity(levelHundredFour);
                    finish();
                } else if(level_unlock == 104) {
                    Intent levelHundredFive = new Intent(getApplicationContext(), Level105.class);
                    startActivity(levelHundredFive);
                    finish();
                } else if(level_unlock == 105) {
                    Intent levelHundredSix = new Intent(getApplicationContext(), Level106.class);
                    startActivity(levelHundredSix);
                    finish();
                } else if(level_unlock == 106) {
                    Intent levelHundredSeven = new Intent(getApplicationContext(), Level107.class);
                    startActivity(levelHundredSeven);
                    finish();
                } else if(level_unlock == 107) {
                    Intent levelHundredEight = new Intent(getApplicationContext(), Level108.class);
                    startActivity(levelHundredEight);
                    finish();
                } else if(level_unlock == 108) {
                    Intent levelHundredNine = new Intent(getApplicationContext(), Level109.class);
                    startActivity(levelHundredNine);
                    finish();
                } else if(level_unlock == 109) {
                    Intent levelHundredTen = new Intent(getApplicationContext(), Level110.class);
                    startActivity(levelHundredTen);
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent levels = new Intent(getApplicationContext(),Levels.class);
        startActivity(levels);
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
}