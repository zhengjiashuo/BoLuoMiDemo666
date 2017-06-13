package com.example.asus.boluomidemo.Fragment;


import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asus.boluomidemo.Adapter.MyRexyclerAdapter;
import com.example.asus.boluomidemo.Adapter.SpaceItemDecoration;
import com.example.asus.boluomidemo.Bean.Fiction;
import com.example.asus.boluomidemo.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/6/12.
 */

public class C_AFragment extends Fragment {

    private RollPagerView mRollViewPager;
    private RecyclerView recyclerView;
    private MyRexyclerAdapter myRecycler;
    private List<Fiction> list = new ArrayList<>();
    private String[] titles = new String[]
            { "我的未婚妻非人类", "我的未婚妻非人类", "我的未婚妻非人类", "我的未婚妻非人类", "我的未婚妻非人类", "我的未婚妻非人类"};
    private String[] titlestwo = new String[]
            { "为什么要伤害我的眼睛", "为什么要伤害我的眼睛", "为什么要伤害我的眼睛", "为什么要伤害我的眼睛", "为什么要伤害我的眼睛", "为什么要伤害我的眼睛"};
    //图片ID数组
    private int[] images = new int[]{
            R.drawable.w, R.drawable.e, R.drawable.w,
            R.drawable.e, R.drawable.w, R.drawable.e,
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.c_afragment,null);
        mRollViewPager = (RollPagerView) view.findViewById(R.id.roll_view_pager);
        recyclerView = (RecyclerView) view.findViewById(R.id.myrecycler);
        mRollViewPager.setPlayDelay(1000);
        mRollViewPager.setAnimationDurtion(500);
        mRollViewPager.setAdapter(new TestNormalAdapter());
        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW,Color.WHITE));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        for (int i = 0; i <images.length;i++){
            Fiction fiction = new Fiction();
            fiction.setImages(images[i]);
            fiction.setTitles(titles[i]);
            fiction.setTitlestwo(titlestwo[i]);
            list.add(fiction);
        }
        recyclerView.addItemDecoration(new SpaceItemDecoration(10));
        myRecycler=new MyRexyclerAdapter(getActivity(),list);
        recyclerView.setAdapter(myRecycler);
        return view;
    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.q,
                R.drawable.r,
                R.drawable.t,
                R.drawable.y,
        };
        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }
        @Override
        public int getCount() {
            return imgs.length;
        }
    }

}
