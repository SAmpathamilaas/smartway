package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
   Button imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View imageView3 = findViewById(R.id.imageView3); // Xmal layout and java code athara reference aka k hada gnanva

        imageView3.setOnClickListener(new View.OnClickListener() {  // the thing what happen after the image click
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Home.class);

                startActivity(intent); }


        });
    }
}