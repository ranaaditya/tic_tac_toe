package com.rana_aditya.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView timer_reading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);





    }

    public void restart(View view) {
        Intent intent=new Intent(result.this,gameActivity.class);
        startActivity(intent);
        result.this.finish();
    }
}
