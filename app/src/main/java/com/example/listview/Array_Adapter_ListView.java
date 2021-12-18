package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Array_Adapter_ListView extends AppCompatActivity {

    ListView listview;
    String Language[] = {"Java","Python","C++","C#","Rubby",".Net","Hadoop","Ajax","Php","Rails","Sap","Perl","Android"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_listview);
        listview = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,Language);
        listview.setAdapter(arr);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=arr.getItem(i);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


