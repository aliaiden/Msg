package com.oneten.alihaider.msg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ali Haider on 7/11/2016.
 */
public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                } catch(InterruptedException e){
                    e.printStackTrace();

                } finally{
                    Intent i=new Intent("android.intent.action.MAIN");
                    startActivity(i);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
