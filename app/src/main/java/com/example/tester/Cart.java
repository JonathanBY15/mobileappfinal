package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button onaylaBtn = (Button) findViewById(R.id.onaylaBtn);
        onaylaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToBonAppetit = new Intent(getApplicationContext(), BonAppetitScreen.class);
                startActivity(goToBonAppetit);
            }
        });

        Button restoranListBtn = (Button) findViewById(R.id.restoranListBtn);
        restoranListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToRestaurantList = new Intent(getApplicationContext(), RestaurantList.class);
                startActivity(goToRestaurantList);
            }
        });

    }


}