package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String[] titre;
String [] soust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv =findViewById(R.id.RecycleV);
        titre= getResources().getStringArray(R.array.tit);
        soust= getResources().getStringArray(R.array.Stit);
        ListAdapter ad;
        Integer [] image = {R.drawable.download,R.drawable.manel, R.drawable.download,R.drawable.hela
        , R.drawable.chaima,R.drawable.maha};
ad = new ListAdapter(MainActivity.this,titre,soust,image);
rv.setLayoutManager(new LinearLayoutManager(this));
rv.setAdapter(ad);


    }
}