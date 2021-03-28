package com.example.formerfund.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.formerfund.R;
import com.example.formerfund.fragments.ProductFragment;
import com.example.formerfund.fragments.ProfileFragment;
import com.example.formerfund.fragments.StatusFragment;
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigation;
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem;
import com.tenclouds.fluidbottomnavigation.listener.OnTabSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class InvestorDashboardActivity extends AppCompatActivity {

    FluidBottomNavigation fluidBottomNavigation;
    List<FluidBottomNavigationItem> fluidBottomNavigationItemList = new ArrayList<>();
    Fragment fragment;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor_dashboard);

        fluidBottomNavigation = findViewById(R.id.fluidBottomNavigation);

        fluidBottomNavigation.selectTab(1);


        fluidBottomNavigation.setAccentColor(ContextCompat.getColor(InvestorDashboardActivity.this, R.color.white));
        fluidBottomNavigation.setBackColor(ContextCompat.getColor(this, R.color.teal_700));
        fluidBottomNavigation.setIconColor(ContextCompat.getColor(this, R.color.black));
        fluidBottomNavigation.setTextColor(ContextCompat.getColor(InvestorDashboardActivity.this, R.color.black));
        fluidBottomNavigation.setIconSelectedColor(ContextCompat.getColor(InvestorDashboardActivity.this, R.color.orange));

        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Feed",
                ContextCompat.getDrawable(this, R.drawable.ic_baseline_add_shopping_cart)));
        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Home",
                ContextCompat.getDrawable(this, R.drawable.ic_baseline_catching)));
        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("Profile",
                ContextCompat.getDrawable(this, R.drawable.ic_baseline_person)));
//        fluidBottomNavigationItemList.add(new FluidBottomNavigationItem("news",
//                ContextCompat.getDrawable(this, R.drawable.circle)));

        fluidBottomNavigation.setItems(fluidBottomNavigationItemList);

        fluidBottomNavigation.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(int i) {
                switch (i) {
                    case 0:
                        fragment = new ProductFragment();
                        fm = getSupportFragmentManager();
                        fragmentTransaction = fm.beginTransaction();
                        fragmentTransaction.replace(R.id.container, fragment);
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        fragment = new StatusFragment();
                        fm = getSupportFragmentManager();
                        fragmentTransaction = fm.beginTransaction();
                        fragmentTransaction.replace(R.id.container, fragment);
                        fragmentTransaction.commit();
                        break;
                    case 2:
                        fragment = new ProfileFragment();
                        fm = getSupportFragmentManager();
                        fragmentTransaction = fm.beginTransaction();
                        fragmentTransaction.replace(R.id.container, fragment);
                        fragmentTransaction.commit();
                        break;
                }
            }
        });

    }
}