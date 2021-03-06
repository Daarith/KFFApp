package com.example.chandarith.kffapp.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Chan Darith on 10/13/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {


    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();


    public void addFragment(Fragment fragments,String titles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(titles);
    }
    public ViewPagerAdapter(FragmentManager fm)
    {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabTitles.get(position);
    }
}
