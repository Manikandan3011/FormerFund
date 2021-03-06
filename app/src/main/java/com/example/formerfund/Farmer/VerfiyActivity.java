package com.example.formerfund.Farmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.formerfund.R;

public class VerfiyActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;
    String request = "failure";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfiy);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(request.equals("failure")){
                    Intent mainIntent = new Intent(VerfiyActivity.this,RejectActivity.class);
                    startActivity(mainIntent);
                    finish();
                }
                else{
                    Intent mainIntent = new Intent(VerfiyActivity.this,SuccessActivity.class);
                    startActivity(mainIntent);
                    finish();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}