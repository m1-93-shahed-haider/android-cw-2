package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText n = findViewById(R.id.name);
        EditText p = findViewById(R.id.phone);
        EditText a = findViewById(R.id.address);
        EditText e = findViewById(R.id.email);
        Button b = findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                String N = n.getText().toString();
                i.putExtra("Name",N);

                String P = p.getText().toString();
                i.putExtra("Phone",P);

                String A = a.getText().toString();
                i.putExtra("Address",A);

                String E = e.getText().toString();
                i.putExtra("Email",E);



                startActivity(i);
            }
        });

    }
}