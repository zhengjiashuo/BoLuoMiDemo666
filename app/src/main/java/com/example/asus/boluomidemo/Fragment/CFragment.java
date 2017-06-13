package com.example.asus.boluomidemo.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.asus.boluomidemo.Adapter.MyAdapter;
import com.example.asus.boluomidemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/6/12.
 */

public class CFragment extends Fragment {

    private List<Fragment> list = new ArrayList<>();
    private TabLayout tabLayout;
    private MyAdapter myAdapter;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cfragment,null);
        tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        viewPager = (ViewPager) view.findViewById(R.id.mypager);
        list.add(new C_AFragment());
        list.add(new C_BFragment());
        list.add(new C_CFragment());
        list.add(new C_DFragment());
        FragmentManager manager = getFragmentManager();
        myAdapter = new MyAdapter(list,manager);
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
       return view;
    }
}

