package com.example.dell.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    List<String> list=new ArrayList<>();
    int year;
    int month;
    int day;
    int hour;
    int minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_order);
        TextView event=(TextView)findViewById(R.id.event);
        TextView time=(TextView)findViewById(R.id.time);
        TextView data=(TextView)findViewById(R.id.data);
        //Button button=(Button)findViewById(R.id.obutton);
        Spinner spinner=(Spinner)findViewById(R.id.ospinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,list);

        list.add("足球");
        list.add("篮球");
        list.add("羽毛球");
        list.add("游泳");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        DatePicker mDatePicker;
        TimePicker mTimePicker;
        mDatePicker = (DatePicker)findViewById(R.id.datapicker);
        mTimePicker = (TimePicker)findViewById(R.id.timepicker);

        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR);
        month = c.get(Calendar.MONTH);
         mDatePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
               OrderActivity.this.year = year;
                OrderActivity.this.month = monthOfYear;
                OrderActivity.this.day = dayOfMonth;
               // showDateTime(year, month, day, hour, minute);
            }
        });
    }
}
