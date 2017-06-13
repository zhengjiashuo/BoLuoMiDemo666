package com.example.asus.boluomidemo.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.asus.boluomidemo.R;

public class MainActivity extends Activity {

    private EditText et_user;
    private EditText et_passwork;
    private Button btn_denglus;
    private Button btn_zhuce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        initView();
        initData();
    }

    private void initData() {
        btn_denglus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        btn_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisteredActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        et_user = (EditText) findViewById(R.id.et_user);
        et_passwork = (EditText) findViewById(R.id.et_passwork);
        btn_denglus = (Button) findViewById(R.id.btn_denglus);
        btn_zhuce = (Button) findViewById(R.id.btn_zhuce);
    }


}


