package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        Button signUpKayitBtn = (Button) findViewById(R.id.signUpKayitBtn);
        signUpKayitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kayitOlundu = new Intent(getApplicationContext(), StartScreen.class);
                startActivity(kayitOlundu);
            }
        });
    }

}