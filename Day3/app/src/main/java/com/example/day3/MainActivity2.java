package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

        String nn = b.getString("Name");
        String pp = b.getString("Phone");
        String aa = b.getString("Address");
        String ee = b.getString("Email");


        TextView ww= findViewById(R.id.w1);
        ww.setText(nn);

        TextView www= findViewById(R.id.w2);
        www.setText(pp);

        

        www.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallIntent = new Intent(Intent.ACTION_DIAL);
                CallIntent.setData(Uri.parse("tel:"+ pp));
                startActivity(CallIntent);
            }
        });


    }
}