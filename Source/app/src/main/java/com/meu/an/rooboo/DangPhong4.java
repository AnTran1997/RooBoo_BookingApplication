package com.meu.an.rooboo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DangPhong4 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_phong4);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding fragments
        viewPagerAdapter.AddFragment(new FragmentBookedRooms(), "PHÒNG ĐÃ ĐẶT");
        viewPagerAdapter.AddFragment(new FragmentMyRooms2(), "PHÒNG CỦA BẠN");

        //Adapter setup
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
