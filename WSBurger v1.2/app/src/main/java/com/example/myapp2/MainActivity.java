package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int ilosc_coli =0;
    int ilosc_frytow =0;
    int ilosc_burgerow =0;
    int cena =0;

    int cena_coli = 4;
    int cena_frytkow = 7;
    int cena_burgera = 11;

    String txt, cena_txt;

    //Context context = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.zamow_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Zamowienie.class);
                startActivity(intent);
            }

        });

        ImageButton cola_btn = findViewById(R.id.cola_btn);
        ImageButton frytki_btn = findViewById(R.id.frytki_btn);
        ImageButton burger_btn = findViewById(R.id.burger_btn);

//        Button zamow_btn = findViewById(R.id.zamow_btn);

        TextView cola_ilosc_tv = findViewById(R.id.cola_ilosc_tv);
        TextView frytki_ilosc_tv = findViewById(R.id.frytki_ilosc_tv);
        TextView burger_ilosc_tv = findViewById(R.id.burger_ilosc_tv);

        TextView cena_tv = findViewById(R.id.cena_tv);

        cola_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ilosc_coli++;
                cena +=cena_coli;
                txt = ilosc_coli +"";
                cena_txt = cena +"";

                cola_ilosc_tv.setText(txt);
                cena_tv.setText(cena_txt);

            }
        });

        frytki_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilosc_frytow++;
                cena +=cena_frytkow;
                txt = ilosc_frytow +"";
                cena_txt = cena +"";

                frytki_ilosc_tv.setText(txt);
                cena_tv.setText(cena_txt);
            }
        });

        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilosc_burgerow++;
                cena += cena_burgera;
                txt = ilosc_burgerow +"";
                cena_txt = cena +"";

                burger_ilosc_tv.setText(txt);
                cena_tv.setText(cena_txt);
            }
        });

//        zamow_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                    Intent intent = new Intent(MainActivity.this, Zamowienie.class);
//                    intent.putExtra("cena", cena_txt);
//                    startActivity(intent);

//            }
//        });

    }
}