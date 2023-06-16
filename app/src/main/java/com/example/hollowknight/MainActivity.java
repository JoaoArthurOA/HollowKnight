package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnentrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnentrar = (Button) findViewById (R.id.btnentrar);
        btnentrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent menu = new Intent(getApplicationContext(), Menu.class);
                startActivity(menu);
            }
        });
    }


}