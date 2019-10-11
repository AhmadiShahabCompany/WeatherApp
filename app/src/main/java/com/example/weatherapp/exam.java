package com.example.weatherapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exam {

    double temp;
   String DayName,icon,time;


    public exam(double temp, String DayName ,String icon, String time) {

        String day;
        this.temp = temp;
        this.time = time;
        long unixSeconds3 =Long.parseLong(time);
        Date txt3 = new java.util.Date(unixSeconds3 * 1000L);
        SimpleDateFormat sdf3 = new java.text.SimpleDateFormat("E");
        sdf3.setTimeZone(java.util.TimeZone.getTimeZone("GMT+4:30"));
        day = sdf3.format(txt3);
        this.DayName = day;
        this.icon = icon;

    }
}
