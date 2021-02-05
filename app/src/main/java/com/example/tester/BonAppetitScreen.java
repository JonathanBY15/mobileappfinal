package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BonAppetitScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bon_appetit_screen);

        Button anaSayfaBtn = (Button) findViewById(R.id.anaSayfaBtn);
        anaSayfaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToStartScreen = new Intent(getApplicationContext(), StartScreen.class);
                startActivity(goToStartScreen);
            }
        });

    }
}