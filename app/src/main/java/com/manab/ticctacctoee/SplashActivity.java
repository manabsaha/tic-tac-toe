package com.manab.ticctacctoee;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static long splash_timeout = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Splash screen starts
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent= new Intent(SplashActivity.this,StartActivity.class);
                startActivity(splashIntent);
                finish();
            }
        },splash_timeout);

    }
}
