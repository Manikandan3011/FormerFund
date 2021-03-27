package com.example.formerfund.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.formerfund.R;
import com.example.formerfund.fragments.HomeFragment;
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigation;
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem;
import com.tenclouds.fluidbottomnavigation.listener.OnTabSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    FluidBottomNavigation fluidBottomNavigation;
    List<FluidBottomNavigationItem> fluidBottomNavigationItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        fluidBottomNavigation = findViewById(R.id.fluidBottomNavigation);

        fluidBottomNavigation.selectTab(1);


        fluidBottomNavigation.setAccentColor(ContextCompat.getColor(DashboardActivity.this, R.color.white));
        fluidBottomNavigation.setBackColor(ContextCompat.getColor(this, R.color.teal_700));
        fluidBottomNavigation.setIconColor(ContextCompat.getColor(this, R.color.black));
        fluidBottomNavigation.setTextColor(ContextCompat.getColor(DashboardActivity.this, R.color.black));
        fluidBottomNavigation.setIconSelectedColor(ContextCompat.getColor(DashboardActivity.this, R.color.orange));

        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Product",
                ContextCompat.getDrawable(this, R.drawable.ic_calender)));
        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Status",
                ContextCompat.getDrawable(this, R.drawable.ic_baseline_home_24)));
        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Profile",
                ContextCompat.getDrawable(this, R.drawable.circle)));
//        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("news",
//                ContextCompat.getDrawable(this, R.drawable.circle)));

        fluidBottomNavigation.setItems(fluidBottomNavigationItemList);

        fluidBottomNavigation.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(int i) {
                switch (i) {
                    case 0:
                        Fragment first = new HomeFragment();
                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        fragmentTransaction.replace(R.id.container, first);
                        fragmentTransaction.commit();
                        break;
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;
                }


            }
        });

    }
}