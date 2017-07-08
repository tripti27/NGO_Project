package com.cfg.reachinghands;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 750;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app register activity for a new user
                Bundle notification_extras = null;
                if (getIntent().getExtras() != null) {
                    notification_extras = getIntent().getExtras();
                }
                Intent toLoginScreen = new Intent(SplashScreen.this,LoginActivity.class);
                if(notification_extras != null)
                    toLoginScreen.putExtras(notification_extras);
                startActivity(toLoginScreen);
                //Close this activity
                finish();
            }
        } , SPLASH_TIME_OUT);

    }
}
