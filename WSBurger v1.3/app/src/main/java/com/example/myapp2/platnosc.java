package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class platnosc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platnosc);

        ImageButton karta=findViewById(R.id.karta);
        karta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(platnosc.this,Zamowienie.class);
                startActivity(intent);

            }

        });
        ImageButton gotowka=findViewById(R.id.gotowka);
        gotowka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(platnosc.this,Zamowienie.class);
                startActivity(intent);

            }

        });


    }
}