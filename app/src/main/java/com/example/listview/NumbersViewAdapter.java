package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NumbersViewAdapter extends ArrayAdapter<NumbersView> {

    public NumbersViewAdapter(@NonNull Context context, ArrayList<NumbersView> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View currentItemView = convertView;
        RecordHolder holder = null;

        if(currentItemView == null){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);

            holder = new RecordHolder();
            holder.imageView1 = currentItemView.findViewById(R.id.imageView1);
            holder.textView1 = currentItemView.findViewById(R.id.textView1);
            holder.textView2 = currentItemView.findViewById(R.id.textView2);
            holder.imageView2 = currentItemView.findViewById(R.id.imageView2);
            holder.textViewQuantity = currentItemView.findViewById(R.id.textViewQuantity);
            holder.imageViewMinus = currentItemView.findViewById(R.id.imageViewMinus);
            holder.imageViewPlus = currentItemView.findViewById(R.id.imageViewPlus);

            currentItemView.setTag(holder);

        }else {
            holder = (RecordHolder) currentItemView.getTag();
        }

        NumbersView currentNumberPosition = getItem(position);

        assert currentNumberPosition != null;
        holder.imageView1.setImageResource(currentNumberPosition.getNumbersImageId());
        holder.textView1.setText(currentNumberPosition.getNumberInDigit());
        holder.textView2.setText(currentNumberPosition.getmNumbersInText());
        holder.textViewQuantity.setText("" + currentNumberPosition.getaNumberOfDigit());

        //RecordHolder Holder = holder;
        RecordHolder finalHolder = holder;
        holder.imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumberPosition.addToNumber();
                finalHolder.textViewQuantity.setText("" +currentNumberPosition.getaNumberOfDigit());
                notifyDataSetChanged();
            }
        });

        holder.imageViewMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumberPosition.removeFromNumber();
                finalHolder.textViewQuantity.setText("" +currentNumberPosition.getaNumberOfDigit());
                notifyDataSetChanged();
            }
        });



        if (currentNumberPosition.getivStarImageId()){
            holder.imageView2.setImageResource(R.drawable.ic_baseline_star_24);
        }else{
            holder.imageView2.setImageResource(R.drawable.ic_baseline_star_border_24);
        }

        holder.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!currentNumberPosition.getivStarImageId()){
                    currentNumberPosition.setIvStarImageId(true);
                }else{
                    currentNumberPosition.setIvStarImageId(false);
                }
                notifyDataSetChanged();
            }
        });

        return currentItemView;
    }

    public class RecordHolder {
        ImageView imageView1;
        TextView textView1;
        TextView textView2;
        ImageView imageView2;
        TextView textViewQuantity;
        ImageView imageViewMinus;
        ImageView imageViewPlus;
    }

    void onPlusNumber(int pos, NumbersView numbersView) {
        int Quantity = numbersView.getaNumberOfDigit();

    }
}
