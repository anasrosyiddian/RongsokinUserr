package com.edicoding.picodiploma.rongsokinuser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_1);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectFrag = null;

                    switch (menuItem.getItemId()) {
                        case R.id.navigation_home:
                            selectFrag = new HomeFragment();
                            break;
                        case R.id.navigation_dashboard:
                                selectFrag = new DashboardFragment();
                                break;
                        case R.id.navigation_notifications:
                                    selectFrag = new NotivicationFragment();
                                    break;
                            }

                            //getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, selectFrag).commit();

                            return true;
                        }
                    };

                }




