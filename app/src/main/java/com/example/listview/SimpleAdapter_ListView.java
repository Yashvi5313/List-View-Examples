package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAdapter_ListView extends AppCompatActivity {

    ListView listView;

    String fruitName[] = {"Banana", "Grape", "Guava", "Mango", "Orange", "Watermelon"};

    int fruitImage[] = {R.drawable.banana, R.drawable.grape, R.drawable.guava, R.drawable.mango, R.drawable.orange, R.drawable.watermelon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_list_view);

        listView = findViewById(R.id.listview);

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        for (int i = 0; i< fruitName.length; i++){
            HashMap<String, Object> map = new HashMap<>();
            map.put("fruitName", fruitName[i]);
            map.put("fruitImage", fruitImage[i]);

            list.add(map);
        }

        String[] from = {"fruitName", "fruitImage"};

        int to[] ={R.id.textView, R.id.imageView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list, R.layout.list_row_item, from, to);

        listView.setAdapter(simpleAdapter);
    }
}