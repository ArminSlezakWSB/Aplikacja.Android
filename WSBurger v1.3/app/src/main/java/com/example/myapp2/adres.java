package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class adres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adres);

        ImageButton miejsce=findViewById(R.id.na_miejscu);
        miejsce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adres.this,platnosc.class);
                startActivity(intent);

            }

        });
        ImageButton wynos=findViewById(R.id.na_wynos);
        wynos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adres.this,platnosc.class);
                startActivity(intent);

            }

        });


    }
}