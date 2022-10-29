package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smartway.databinding.ActivityToolBarBinding;

import java.time.Instant;

public class Home extends AppCompatActivity {
    ImageButton imageButton;

    TextView toolBarTitle;
    TextView elecTXTView;
    ImageView elecIMGView;
    TextView viewAllCategories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolBarTitle = findViewById(R.id.toolBarTitle);
        toolBarTitle.setText("HOME");

        imageButton=findViewById(R.id.actionBtn);
        viewAllCategories = findViewById(R.id.viewAllCategories);
        elecTXTView = findViewById(R.id.elecTXTView);
        elecIMGView = findViewById(R.id.elecIMGView);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        elecTXTView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Services.class);
                startActivity(intent);
            }
        });
        elecIMGView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Services.class);
                startActivity(intent);
            }
        });

        viewAllCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,CategoryActivity.class);
                startActivity(intent);
            }
        });



    }
}