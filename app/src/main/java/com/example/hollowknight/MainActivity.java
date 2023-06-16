package com.example.hollowknight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button btnentrar;
    ImageButton btnbg;

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

        btnbg = (ImageButton) findViewById(R.id.btnbg);
        btnbg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri location= Uri.parse("geo:0,0?q=ETEC+Professor+Basilides+de+Godoy");Intent mapIntent= new Intent(Intent.ACTION_VIEW, location);startActivity(mapIntent);
            }
        });

    }


}