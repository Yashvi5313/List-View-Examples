package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Custom_ArrayAdapter_ListView extends AppCompatActivity {
    //int minter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_arrayadapter_listview);

        final ArrayList<NumbersView> arrayList = new ArrayList<NumbersView>();

        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_1_24, "1", "One", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_2_24, "2", "Two", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_3_24, "3", "Three", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_4_24, "4", "Four", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_5_24, "5", "Five", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_6_24, "6", "Six", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_7_24, "7", "Seven", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_8_24, "8", "Eight", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_baseline_filter_9_24, "9", "Nine", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "10", "Ten", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "11", "Eleven", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "12", "Twelve", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "13", "Thirteen",false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "14", "Fourteen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "15", "Fifteen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "16", "Sixteen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "17", "Seventeen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "18", "Eighteen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "19", "Nineteen", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "20", "Twenty",false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "21", "Twenty-one", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "22", "Twenty-two", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "23", "Twenty-three", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "24", "Twenty-four", false, 0));
        arrayList.add(new NumbersView(R.drawable.ic_launcher_background, "25", "Twenty-five",false, 0));

        NumbersViewAdapter numbersViewAdapter = new NumbersViewAdapter(this, arrayList);
        ListView numberListView = findViewById(R.id.ListView);
        numberListView.setAdapter(numbersViewAdapter);

       numberListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               NumbersView value =numbersViewAdapter.getItem(i);
               Toast.makeText(getApplicationContext(), value.getmNumbersInText(), Toast.LENGTH_SHORT).show();

           }
       });

    }

//    public void increaseInteger(View view){
//        minter = minter + 1;
//        display(minter);
//    }
//
//    public void decreaseInteger(View view){
//        minter = minter - 1;
//        display(minter);
//    }
//
//    public void display(int number) {
//        TextView displayInteger = (TextView) findViewById(R.id.textViewAdd);
//        displayInteger.setText("" + number);
//    }
}