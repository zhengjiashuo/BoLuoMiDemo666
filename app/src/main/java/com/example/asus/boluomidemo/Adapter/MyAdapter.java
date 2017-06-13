package com.example.asus.boluomidemo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ASUS on 2017/6/12.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    String[] strings = new String[]{"HOT热门","BOOKS书城","VIDEO视频","BARRIER结界"};
    public MyAdapter(List<Fragment> list, FragmentManager manager) {
        super(manager);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
