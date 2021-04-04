package com.example.formerfund.Farmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.formerfund.R;

public class UploadProductActivity extends AppCompatActivity {

//    ActivityUploadProductBinding uploadProductBinding;

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_upload_product);

        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UploadLandDetailsActivity.class));
            }
        });
    }
}