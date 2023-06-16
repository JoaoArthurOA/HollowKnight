package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class historia extends AppCompatActivity {
    Button btnvoltarhistoria;

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
    }
}