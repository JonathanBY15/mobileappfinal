package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button girisYapBtn = (Button) findViewById(R.id.girisYapBtn);
        girisYapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToLoginScreen = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(goToLoginScreen);
            }
        });

        Button kayitOlBtn = (Button) findViewById(R.id.kayitOlBtn);
        kayitOlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSignUpScreen = new Intent(getApplicationContext(), SignUpScreen.class);
                startActivity(goToSignUpScreen);
            }
        });

    }
}