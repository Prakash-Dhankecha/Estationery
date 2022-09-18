package com.example.estationery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        bottom_navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.home ) {
                    loadFrag(new HomeFragment(), true);
                } else if (id == R.id.promo) {
                    loadFrag(new PromoFragment(), false);
                } else if (id == R.id.orders) {
                    loadFrag(new OrderFragment(), false);
                } else {
                    loadFrag(new OrderHistoryFragment(), false);
                }
                return true;
            }
        });

        bottom_navigation.setSelectedItemId(R.id.home);
    }

    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag)
            ft.add(R.id.container, fragment);
        else {
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }

}