package com.example.weatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeatherRecyclerView extends RecyclerView.Adapter<WeatherRecyclerView.RecyclerViewHolder> {
    List<String> mycity;
    EditText edt;
    public WeatherRecyclerView(List<String>mycity,EditText edt){
        this.mycity = mycity;
        this.edt = edt;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, int position) {
        String name = mycity.get(position);
        holder.txtcity.setText(name);
        holder.txtcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(holder.txtcity.getText());
            }
        });

    }

    @Override
    public int getItemCount() {
        return mycity.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
         TextView txtcity;
         EditText edtcity;
        public RecyclerViewHolder(@NonNull View itemView) {

            super(itemView);
            txtcity = itemView.findViewById(R.id.txtcity);
            edtcity = itemView.findViewById(R.id.edtcity);
        }
    }
}
