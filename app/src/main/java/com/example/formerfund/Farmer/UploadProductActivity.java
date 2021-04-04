package com.example.formerfund.Farmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.formerfund.R;
import com.example.formerfund.databinding.ActivityUploadProductBinding;

public class UploadProductActivity extends AppCompatActivity {

    ActivityUploadProductBinding uploadProductBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uploadProductBinding = DataBindingUtil.setContentView(this,R.layout.activity_upload_product);

        uploadProductBinding.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UploadLandDetailsActivity.class));
            }
        });
    }
}