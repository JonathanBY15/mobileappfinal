package com.example.tester;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class RestaurantList extends AppCompatActivity {

    ListView restaurantsListView;
    String[] restaurants;
    String[] ratings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        Resources res = getResources();

        restaurantsListView = (ListView) findViewById(R.id.restaurantsListView);
        restaurants = res.getStringArray(R.array.restaurants);
        ratings = res.getStringArray(R.array.ratings);

        RestaurantListAdapter restaurantListAdapter = new RestaurantListAdapter(this, restaurants, ratings);
        restaurantsListView.setAdapter(restaurantListAdapter);

        restaurantsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent showMenu = new Intent(view.getContext(), PizzaMenu.class);
                startActivity(showMenu);

            }
        });

    }
}