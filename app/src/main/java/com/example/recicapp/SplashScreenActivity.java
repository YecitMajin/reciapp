package com.example.recicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splashScreenStarter = new Thread(){
            public void  run(){
                try {
                    int delay = 0;
                    while (delay < 2000){
                        sleep(150);
                        delay = delay + 100;
                    }
                    startActivity(new Intent(SplashScreenActivity.this, IniciarSesion.class));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    finish();
                }
            }
        };
        splashScreenStarter.start();

    }
}