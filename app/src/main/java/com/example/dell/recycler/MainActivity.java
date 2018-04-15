package com.example.dell.recycler;

import android.app.TabActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    private List<Square> squareList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("预定").setContent(new Intent().setClass(this,OrderActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("推荐").setContent(new Intent().setClass(this,reclist.class)));

//        Button button=(Button)findViewById(R.id.tuijian);
//        Button button2=(Button)findViewById(R.id.yuding);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,reclist.class);
//                startActivity(intent);
//            }
//        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(MainActivity.this,OrderActivity.class);
//                startActivity(intent);
//            }
//        });

    }}

