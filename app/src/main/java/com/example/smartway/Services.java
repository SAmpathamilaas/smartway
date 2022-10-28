package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Services extends AppCompatActivity {

    ImageButton actionBtn;
    TextView toolBarTitle;
    ImageView unitedServiceIMG;
    LinearLayout unitedServiceTXT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        toolBarTitle = findViewById(R.id.toolBarTitle);
        toolBarTitle.setText("EDUCATION");
        actionBtn=findViewById(R.id.actionBtn);
        actionBtn.setImageResource(R.drawable.ic_search_icon_foreground);

        unitedServiceIMG = findViewById(R.id.unitedServiceIMG);
        unitedServiceTXT = findViewById(R.id.unitedServiceTXT);

        unitedServiceIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Services.this,ServiceItem.class);
                startActivity(intent);
            }
        });

        unitedServiceTXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Services.this,ServiceItem.class);
                startActivity(intent);
            }
        });
    }
}