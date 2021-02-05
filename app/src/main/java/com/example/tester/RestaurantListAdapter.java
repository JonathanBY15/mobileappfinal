package com.example.tester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class RestaurantListAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] restaurants;
    String[] ratings;

    public RestaurantListAdapter (Context c, String[] res, String[] rat) {
        restaurants = res;
        ratings = rat;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return restaurants.length;
    }

    @Override
    public Object getItem(int position) {
        return restaurants[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.restaurant_list_appearance, null);

        TextView restaurantTextView = (TextView) v.findViewById(R.id.restaurantTextView);
        TextView ratingTextView = (TextView) v.findViewById(R.id.ratingTextView);

        String restaurant = restaurants[position];
        String rating = ratings[position];

        restaurantTextView.setText(restaurant);
        ratingTextView.setText(rating);

        return v;
    }
}
