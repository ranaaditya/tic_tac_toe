package com.rana_aditya.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,gameActivity.class);
        startActivity(intent);
        finish();




    }
}

/*

        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width=displayMetrics.heightPixels;
        int height=displayMetrics.widthPixels;

        for (int i=0;i<=8;i++) {
            img[i].getLayoutParams().height = height /4;
            img[i].getLayoutParams().width = width / 8;
        }

*/
