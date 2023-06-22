package com.example.tugasakb;
/**
 * Nim : 10120074
 * Nama : Arif Firdaus
 * Kelas : IF2
 */
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugasakb.R;
import com.example.tugasakb.MainActivity;

import com.example.tugasakb.InfoAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment =  inflater.inflate(R.layout.fragment_about, container, false);
        viewPager = myFragment.findViewById(R.id.view_pager);
        tabLayout = myFragment.findViewById(R.id.tab_layout);
        return myFragment;
    }

    private void setUpViewPager(ViewPager viewPager) {
        InfoAdapter adapter = new InfoAdapter(getChildFragmentManager());
        adapter.addFragment(new AboutFragment1(), "Page 1");
        adapter.addFragment(new AboutFragment2(), "Page 2");
        viewPager.setAdapter(adapter);
    }
}