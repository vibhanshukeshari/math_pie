package com.norbycreation.mathpie;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public  class SplashScreen extends Activity {

    ImageView splash;


    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splash = findViewById(R.id.splashscreen);


        // It is used to prevent app to intent multiple activity in the stack . It happens after user press home button and then open app again.
        if(!isTaskRoot()) {
            final Intent intent = getIntent();
            if(intent.hasCategory(Intent.CATEGORY_LAUNCHER) && Intent.ACTION_MAIN.equals(intent.getAction())) {
                finish();
                return;
            }
        }



        //It is used for null pointer exception throw;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(Color.parseColor("#1c1c1c"));
        }






        handler=new Handler();
        handler.postDelayed(new Runnable() {



            @Override
            public void run() {


                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        },1600);
                splash.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_animation_splash));



    }

}