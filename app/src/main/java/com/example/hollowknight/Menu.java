package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    ImageButton btnmapa;
    ImageButton btnhistoria;
    ImageButton btnpoderes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnmapa = (ImageButton) findViewById (R.id.btnmapa);
        btnmapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mapa = new Intent(getApplicationContext(), Mapa.class);
                startActivity(mapa);
            }
        });
        btnhistoria = (ImageButton) findViewById(R.id.btnhistoria);
        btnhistoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent historia = new Intent(getApplicationContext(), historia.class);
                startActivity(historia);
            }
        });
        btnpoderes = (ImageButton) findViewById(R.id.btnpoderes);
        btnpoderes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent poderes = new Intent(getApplicationContext(),poderes.class);
                startActivity(poderes);
            }
        });
    }
}