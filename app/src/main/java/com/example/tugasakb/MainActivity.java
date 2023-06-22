package com.example.tugasakb;
/**
 * Nim : 10120074
 * Nama : Arif Firdaus
 * Kelas : IF2
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.tugasakb.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.example.tugasakb.MapFragment;
import com.example.tugasakb.ProfileFragment;
import com.example.tugasakb.AboutFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;

    ProfileFragment profileFragment = new ProfileFragment();
    MapFragment mapFragment = new MapFragment();
    AboutFragment aboutFragment = new AboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.Profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;
                    case R.id.Map:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,mapFragment).commit();
                        return true;
                    case R.id.About:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,aboutFragment).commit();
                        return true;

                }

                return false;
            }
        });

    }

}
