package com.example.asus.boluomidemo.Activity;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.example.asus.boluomidemo.Fragment.AFragment;
import com.example.asus.boluomidemo.Fragment.BFragment;
import com.example.asus.boluomidemo.Fragment.CFragment;
import com.example.asus.boluomidemo.Fragment.DFragment;
import com.example.asus.boluomidemo.Fragment.EFragment;
import com.example.asus.boluomidemo.Fragment.FFragment;
import com.example.asus.boluomidemo.R;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private DFragment dFragment;
    private EFragment eFragment;
    private FFragment fFragment;
    private FrameLayout frameLayout;
    private RadioButton btn_shipin;
    private RadioButton btn_home;
    private RadioButton btn_maimai;
    private RadioButton btn_shucheng;
    private RadioButton btn_my;
    private RadioButton jiejie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        initView();
        setDefaultFragment();
    }

    private void initView() {
        btn_shipin = (RadioButton) findViewById(R.id.btn_shipin);
        btn_home = (RadioButton) findViewById(R.id.btn_home);
        btn_maimai = (RadioButton) findViewById(R.id.btn_maimai);
        btn_shucheng = (RadioButton) findViewById(R.id.btn_shucheng);
        btn_my = (RadioButton) findViewById(R.id.btn_my);
        jiejie = (RadioButton) findViewById(R.id.jiejie);
        frameLayout = (FrameLayout) findViewById(R.id.myframe);
        btn_shipin.setOnClickListener(this);
        btn_home.setOnClickListener(this);
        btn_maimai.setOnClickListener(this);
        btn_shucheng.setOnClickListener(this);
        btn_my.setOnClickListener(this);
        jiejie.setOnClickListener(this);
    }
    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        cFragment = new CFragment();
        transaction.add(R.id.myframe, cFragment);
        transaction.commit();

    }
    public void onClick(View v) {
        FragmentManager fm = getSupportFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
        HideFragment(transaction);
        switch (v.getId()) {
            case R.id.btn_home:
                btn_home.setTextColor(Color.WHITE);
                btn_shucheng.setTextColor(Color.BLACK);
                btn_shipin.setTextColor(Color.BLACK);
                jiejie.setTextColor(Color.BLACK);
                btn_maimai.setTextColor(Color.BLACK);
                btn_my.setTextColor(Color.BLACK);
                if (cFragment == null)
                {
                    cFragment = new CFragment();
                    transaction.add(R.id.myframe, cFragment);
                }
                // 使用当前Fragment的布局替代id_content的控件
                transaction.show(cFragment);
                break;
            case R.id.btn_shucheng:
                btn_home.setTextColor(Color.BLACK);
                btn_shucheng.setTextColor(Color.WHITE);
                btn_shipin.setTextColor(Color.BLACK);
                jiejie.setTextColor(Color.BLACK);
                btn_maimai.setTextColor(Color.BLACK);
                btn_my.setTextColor(Color.BLACK);
                if (bFragment == null)
                {
                    bFragment = new BFragment();
                    transaction.add(R.id.myframe, bFragment);
                }
                transaction.show(bFragment);
                break;
            case R.id.btn_shipin:
                btn_home.setTextColor(Color.BLACK);
                btn_shucheng.setTextColor(Color.BLACK);
                btn_shipin.setTextColor(Color.WHITE);
                jiejie.setTextColor(Color.BLACK);
                btn_maimai.setTextColor(Color.BLACK);
                btn_my.setTextColor(Color.BLACK);
                if (aFragment == null)
                {
                    aFragment = new AFragment();
                    transaction.add(R.id.myframe, aFragment);
                }
                transaction.show(aFragment);

                break;
            case R.id.jiejie:
                btn_home.setTextColor(Color.BLACK);
                btn_shucheng.setTextColor(Color.BLACK);
                btn_shipin.setTextColor(Color.BLACK);
                jiejie.setTextColor(Color.WHITE);
                btn_maimai.setTextColor(Color.BLACK);
                btn_my.setTextColor(Color.BLACK);
                if (dFragment == null)
                {
                    dFragment = new DFragment();
                    transaction.add(R.id.myframe, dFragment);
                }
                transaction.show(dFragment);
                break;
            case R.id.btn_maimai:
                btn_home.setTextColor(Color.BLACK);
                btn_shucheng.setTextColor(Color.BLACK);
                btn_shipin.setTextColor(Color.BLACK);
                jiejie.setTextColor(Color.BLACK);
                btn_maimai.setTextColor(Color.WHITE);
                btn_my.setTextColor(Color.BLACK);
                if (eFragment == null)
                {
                    eFragment = new EFragment();
                    transaction.add(R.id.myframe, eFragment);
                }
                transaction.show(eFragment);
                break;
            case R.id.btn_my:
                btn_home.setTextColor(Color.BLACK);
                btn_shucheng.setTextColor(Color.BLACK);
                btn_shipin.setTextColor(Color.BLACK);
                jiejie.setTextColor(Color.BLACK);
                btn_maimai.setTextColor(Color.BLACK);
                btn_my.setTextColor(Color.WHITE);
                if (fFragment == null)
                {
                    fFragment = new FFragment();
                    transaction.add(R.id.myframe, fFragment);
                }
                transaction.show(fFragment);
                break;
        }
        // transaction.addToBackStack();
        // 事务提交
        transaction.commit();
    }

    private void HideFragment(FragmentTransaction transaction) {
        if(aFragment!=null){
            transaction.hide(aFragment);
        }
        if(bFragment!=null){
            transaction.hide(bFragment);
        }
        if(cFragment!=null){
            transaction.hide(cFragment);
        }
        if(dFragment!=null){
            transaction.hide(dFragment);
        }
        if(eFragment!=null){
            transaction.hide(eFragment);
        }
        if(fFragment!=null){
            transaction.hide(fFragment);
        }
    }
}
