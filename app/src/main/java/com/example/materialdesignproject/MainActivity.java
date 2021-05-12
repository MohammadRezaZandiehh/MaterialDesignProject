package com.example.materialdesignproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_main);
        bottomNavigationView.setSelectedItemId(R.id.menuItemHome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menuItemHome:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_main_fragmentContainer, new MainFragment());
                        transaction.commit();
                        break;

                    case R.id.menuItemNearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frame_main_fragmentContainer, new NearbyFragment());
                        transaction2.commit();
                        break;

                    case R.id.menuItemRecents:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frame_main_fragmentContainer, new RecentsFragment());
                        transaction3.commit();
                        break;

                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.menuItemHome);

    }
}