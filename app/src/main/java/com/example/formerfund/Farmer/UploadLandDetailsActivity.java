package com.example.formerfund.Farmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.formerfund.R;
import com.example.formerfund.databinding.ActivityUploadLandDetailsBinding;

public class UploadLandDetailsActivity extends AppCompatActivity {

    ActivityUploadLandDetailsBinding uploadLandDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uploadLandDetailsBinding = DataBindingUtil.setContentView(this,R.layout.activity_upload_land_details);

        uploadLandDetailsBinding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),VerfiyActivity.class));
            }
        });
    }
}