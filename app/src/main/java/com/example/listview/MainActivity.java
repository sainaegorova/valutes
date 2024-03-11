package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.rusSTOL));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR, R.string.afrSTOL));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD, R.string.sinSTOL));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.turSTOL));

        list.add(new DataFlags(R.drawable.kz, R.string.Kazakhstan, R.string.KazakhstanTEN, R.string.KazSTOL));
        list.add(new DataFlags(R.drawable.cn, R.string.China, R.string.ChinaYAN, R.string.ChSTOL));
        list.add(new DataFlags(R.drawable.jp, R.string.Japan, R.string.JapanIEN, R.string.JapSTOL));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);

    }
}