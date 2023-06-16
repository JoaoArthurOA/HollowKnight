package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class historia extends AppCompatActivity {
    Button btnvoltarhistoria;
    Button btnrei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        btnvoltarhistoria = (Button) findViewById (R.id.btnvoltarhistoria);
        btnvoltarhistoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent menu = new Intent(getApplicationContext(), Menu.class);
                startActivity(menu);
            }
        });

        btnrei = (Button) findViewById (R.id.btnrei);
        btnrei.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String query = "Hollow Knight Rei Pálido";
                intent.putExtra(SearchManager.QUERY, query);
                startActivity(intent);
            }
        });
    }
}