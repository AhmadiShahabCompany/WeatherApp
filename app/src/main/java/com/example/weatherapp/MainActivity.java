package com.example.weatherapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> citylist = new ArrayList<>();
        Button btnsearch = findViewById(R.id.btnsearch);
        TextView txtweather = findViewById(R.id.txtweather);
        final TextView txtcity = findViewById(R.id.txtcity);
        final EditText edtcity = findViewById(R.id.edtcity);
        final TextView txttemp = findViewById(R.id.txttemp);
        ImageView imgc_f =  findViewById(R.id.imgc_f);
        final ImageView imgtemp = findViewById(R.id.imgtemp);
        final TextView txthigh = findViewById(R.id.txthigh);
        final TextView txtlow = findViewById(R.id.txtlow);
        ImageView imgwind = findViewById(R.id.imgwind);
        final TextView txtwind = findViewById(R.id.txtwind);
        ImageView imghumidity = findViewById(R.id.imghumidity);
        final TextView txthumidity = findViewById(R.id.txthumidity);
        final TextView txttoday = findViewById(R.id.txttoday);
        final TextView txt1 = findViewById(R.id.txt1);
        final TextView txt2 = findViewById(R.id.txt2);
        final TextView txt3 = findViewById(R.id.txt3);
        final TextView txt4 = findViewById(R.id.txt4);
        ImageView imgicon1 = findViewById(R.id.imgicon1);
        ImageView imgicon2 = findViewById(R.id.imgicon2);
        ImageView imgicon3 = findViewById(R.id.imgicon3);
        ImageView imgicon4 = findViewById(R.id.imgicon4);
        ImageView imgicon5 = findViewById(R.id.imgicon5);
        ImageView imgd1 = findViewById(R.id.imgd1);
        ImageView imgd2 = findViewById(R.id.imgd2);
        ImageView imgd3 = findViewById(R.id.imgd3);
        ImageView imgd4 = findViewById(R.id.imgd4);
        ImageView imgd5 = findViewById(R.id.imgd5);
        final ArrayList<exam> WeatherList = new ArrayList<>();

       // btnsearch.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
           //     String city = "Tehran";
            //    city = edtcity.getText().toString();
            //    txtcity.setText(city);
                AsyncHttpClient client = new AsyncHttpClient();
                String url = "http://api.openweathermap.org/data/2.5/forecast?q=" + city + "&appid=902e7a86eeda9b601fed684e78c02daf";
                final String finalcity = city;
                client.get(url,new JsonHttpResponseHandler(){
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        super.onSuccess(statusCode, headers, response);
                        Gson gson = new Gson();
                        hava hava = gson.fromJson(response.toString(),hava.class);
                        abhava abhava = gson.fromJson(response.toString(),abhava.class);
                        String

                        if (citylist.contains(finalcity) == false){
                            citylist.add(getfinalcity);
                        }
                        try {
                            RecyclerView recycler = findViewById(R.id.recycler);
                            WeatherRecyclerView adapter = new WeatherRecyclerView(citylist, edtcity);
                            recycler.setAdapter(adapter);
                            recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));

                            String name = "";
                            String day = "", temp, icon1 = "", time = "", finalTemp = "";
                            double tempNorm, time1;
                            JSONObject main = null;
                            JSONObject main2 = null;
                            System.out.println(response.toString());
                            Map<String,Integer> pic = new HashMap<>();
                            pic.put("01d", R.drawable.a01d);
                            pic.put("02d", R.drawable.a02d);
                            pic.put("03d", R.drawable.a03d);
                            pic.put("04d", R.drawable.a04d);
                            pic.put("09d", R.drawable.a09d);
                            pic.put("10d", R.drawable.a10d);
                            pic.put("11d", R.drawable.a11d);
                            pic.put("13d", R.drawable.a13d);
                            pic.put("50d", R.drawable.a50d);
                            pic.put("01n", R.drawable.a01n);
                            pic.put("02n", R.drawable.a02n);
                            pic.put("03n", R.drawable.a03n);
                            pic.put("04n", R.drawable.a04n);
                            pic.put("09n", R.drawable.a09n);
                            pic.put("10n", R.drawable.a10n);
                            pic.put("11n", R.drawable.a11n);
                            pic.put("13n", R.drawable.a13n);
                            pic.put("50n", R.drawable.a50d);



                              //    JSONArray obj = new JSONArray(response.getString("list"));
                        //  //    JSONObject jsonObject = obj.getJSONObject(i);
                            //    time = jsonObject.getString("dt");
                            //    main = new JSONObject(jsonObject.getString("main"));
                            //    temp = main.getString("temp");
                           //     tempNorm = tempNorm - 273;
                           //     tempNorm = Math.round(tempNorm);
                            //    finalTemp = Double.toString(tempNorm);
                           //     JSONArray weatherArray = new JSONArray(jsonObject.getString("weather"));
                            //    JSONObject jsonobjectSec = weatherArray.getJSONObject(0);
                           //     icon1 = jsonobjectSec.getString("icon");//image view .set image resource(pic.get(icon));
                            //    WeatherList.add(new exam(Double.valueOf(finalTemp),day,icon1,time));
//
//
                       //     }
                        ///    ArrayList<exam> dayList = new ArrayList<>();
                       //     WeatherList.get(0).icon.replace("n","d");
                       //     dayList.add(new exam(WeatherList.get(0).temp,WeatherList.get(0).DayName,WeatherList.get(0).icon,WeatherList.get(0).time));
                       //     int m =0;
                        //    for (int i = 1; i < WeatherList.size(); i++, m++){
                        //        if (WeatherList.get(i).DayName.compareTo(dayList.get(dayList.size() - 1).DayName)!= 0){
                        //            dayList.add(new exam(WeatherList.get(i).temp,WeatherList.get(i).DayName,WeatherList.get(i).icon,WeatherList.get(i).time));
                        //            System.out.println(WeatherList.get(i).DayName);
//
                        //        }
//
                        //    }
                        //    txttoday.setText(dayList.get(0).DayName);
                        //    txt1.setText(dayList.get(1).DayName);
                       //     txt2.setText(dayList.get(2).DayName);
                       //     txt3.setText(dayList.get(3).DayName);
                        //    txt4.setText(dayList.get(4).DayName);
////

//
                       //     JSONArray obj11 = new JSONArray(response.getString("list"));
                       //     JSONObject jsonobject = obj11.getJSONObject(0);
                        //    main2 = new JSONObject(jsonobject.getString("main"));
                        //    String t = main2.getString("temp");
                        //    double T = Double.valueOf(t);
                        //    T = T - 273;
                        //    T = Math.round(T);
                        //    String temp2 = Double.toString(T);
                        //    txttemp.setText(temp2);
//
//
                        //    String t1 = main2.getString("temp_min");
                        //    double T2 = Double.valueOf(t1);
                        //    T2 = T2 - 273;
                        //    T2 = Math.round(T2);
                       //     String t2 = Double.toString(T2);
                       //     txtlow.setText(t2);
//
                        //    String temp3 = main2.getString("temp_max");
                        //    double T3 = Double.valueOf(temp3);
                        //    T3 = T3 - 273;
                       //     T3 = Math.round(T3);
                        //    String t3 = Double.toString(T3);
                        //    txthigh.setText(t3);
//
                       //     String temp5 = main2.getString("humidity");
                       //     double humid = Double.valueOf(temp5);
                       //     String t4 = Double.toString(humid);
                        //    txthumidity.setText(t4);
//
                       //     JSONArray obj_1 = new JSONArray(response.getString("list"));
                       //     String name1 = "";
                       //     JSONArray obj_2 = null;
                       //     for (int i = 0; i < obj_1.length(); i++) {
                       //         JSONObject jsonobject1 = obj_1.getJSONObject(i);
                       //         String array1 = jsonobject1.getString("weather");
                       //         obj_2 = new JSONArray(array1);
                       //         break;
                        //    }

//
                        //    JSONArray obj_3 = new JSONArray(response.getString("list"));
                         //   for (int i = 0; i < obj_3.length(); i++) {
                         //       JSONObject jsonobject1 = obj_3.getJSONObject(i);
                        //        name = jsonobject1.getString("wind");
                        //        break;
                        //    }
                        //    JSONObject j = new JSONObject(name);
                       //     name1 = j.getString("speed");

                        //    txtwind.setText(name1);

                        //    JSONObject j2 = new JSONObject(name);
                        //    name1 = j2.getString("deg");
                         //   double degre = Double.valueOf(name1);
                         //   degre = Math.round(degre);
                          //  String t5 = Double.toString(degre);














                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                        super.onFailure(statusCode, headers, throwable, errorResponse);
                    }
                });
            }
        });







    }
}
