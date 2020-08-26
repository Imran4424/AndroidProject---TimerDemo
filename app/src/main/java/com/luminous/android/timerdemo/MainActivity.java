package com.luminous.android.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();

        new CountDownTimer(10000, 1000) {
            public void onTick(long milisecondUntilDone) {
                Log.d("seconds left", String.valueOf(milisecondUntilDone/ 1000));
            }

            @Override
            public void onFinish() {
                Log.d("Finished", "We are done");
            }
        }.start();

//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                Log.d("warrior", "A Second passed");
//
//                handler.postDelayed(this, 1000);
//            }
//        };
//
//        handler.post(run);
    }






    
}