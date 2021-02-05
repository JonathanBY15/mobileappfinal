package com.example.tester;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaMenu extends AppCompatActivity {

    ListView pizzaMenuListView;
    String[] pizzaMenus;
    String[] pizzaPrices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        Resources res = getResources();

        pizzaMenuListView = (ListView) findViewById(R.id.pizzaMenuListView);
        pizzaMenus = res.getStringArray(R.array.pizzaMenus);
        pizzaPrices = res.getStringArray(R.array.pizzaPrices);

        PizzaMenuAdapter pizzaMenuAdapter = new PizzaMenuAdapter(this, pizzaMenus, pizzaPrices);
        pizzaMenuListView.setAdapter(pizzaMenuAdapter);

    }
}