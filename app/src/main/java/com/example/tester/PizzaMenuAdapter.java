package com.example.tester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PizzaMenuAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] pizzaMenus;
    String[] pizzaPrices;

    public PizzaMenuAdapter (Context c, String[] menu, String[] price) {
        pizzaMenus = menu;
        pizzaPrices = price;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzaMenus.length;
    }

    @Override
    public Object getItem(int position) {
        return pizzaMenus[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.restaurant_list_appearance, null);
        TextView menuNameTextView = (TextView) v.findViewById(R.id.menuNameTextView);
        TextView menuPriceTextView = (TextView) v.findViewById(R.id.menuPriceTextView);

        String menuName = pizzaMenus[position];
        String menuPrice = pizzaPrices[position];

        menuNameTextView.setText(menuName);
        menuPriceTextView.setText(menuPrice);

        return v;
    }
}
