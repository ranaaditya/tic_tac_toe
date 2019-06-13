package com.rana_aditya.tic_tac_toe;

import android.os.Build;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Chronometer;

public class functions {
    public functions(){

    }

    public void start_timer(Chronometer chronometer){
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
    }
    public void stop_timer(Chronometer chronometer){
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
    }
    public int  get_time(Chronometer chronometer){
        return (Integer.parseInt(chronometer.getText().toString()));
    }
    public int get_min_time(int a,int b){
        return (( a<b )? a : b);
    }
    public void vib(Vibrator vibrator){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(250, VibrationEffect.DEFAULT_AMPLITUDE));
        }
        else{
            vibrator.vibrate(250);
        }
    }
    public int get_position(int x, int y){
        if (x==0){
            if (y==0)return 0;
            if (y==1)return 1;
            if (y==2)return 2;
        }
        if (x==1){
            if (y==0)return 3;
            if (y==1)return 4;
            if (y==2)return 5;
        }
        if (x==2){
            if (y==0)return 6;
            if (y==1)return 7;
            if (y==2)return 8;
        }
        return 0;
    }
}
