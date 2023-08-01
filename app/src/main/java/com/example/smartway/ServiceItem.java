package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ServiceItem extends AppCompatActivity {

    ImageButton actionBtn;

    TextView toolBarTitle;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_item);


        toolBarTitle = findViewById(R.id.toolBarTitle);
        toolBarTitle.setText("");
        actionBtn=findViewById(R.id.actionBtn);
        actionBtn.setImageResource(R.drawable.ic_share_icon_foreground);


    }



}