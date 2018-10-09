package com.example.admin.listvi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    Context context;
    String[] prod_name;
    String[] prod_price;
    int[] images;
    Adapter(Context context,String[] prod_name,String[] prod_price,int[] images)

    {
        this.context=context;
        this.prod_name=prod_name;
        this.prod_price=prod_price;
        this.images=images;
    }
    @Override
    public int getCount() {
        return prod_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View  cview = LayoutInflater.from(context).inflate(R.layout.child, viewGroup, false);
        ImageView imageView=cview.findViewById(R.id.image);
        imageView.setImageResource(images[i]);
        TextView name=cview.findViewById(R.id.childd);
        name.setText(prod_name[i]);
        TextView name1=cview.findViewById(R.id.textView3);
        name1.setText(prod_price[i]);

        view=cview;

        return view;
    }
}
