package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapa extends AppCompatActivity {

    Button btnvoltarmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        btnvoltarmapa = (Button) findViewById (R.id.btnvoltarmapa);
        btnvoltarmapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent menu = new Intent(getApplicationContext(), Menu.class);
                startActivity(menu);
            }
        });
    }
}