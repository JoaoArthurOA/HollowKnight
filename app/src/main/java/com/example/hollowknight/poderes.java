package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class poderes extends AppCompatActivity {
    Button btnvoltapoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poderes);

        btnvoltapoder = (Button) findViewById (R.id.btnvoltapoder);
        btnvoltapoder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent menu = new Intent(getApplicationContext(), Menu.class);
                startActivity(menu);
            }
        });
    }
}