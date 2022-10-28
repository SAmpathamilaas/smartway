package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    TextView toolBarTitle;
    TextView educationTXTView;
    ImageView educationIMGView;
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        toolBarTitle = findViewById(R.id.toolBarTitle);
        toolBarTitle.setText("CATEGORIES");
        imageButton=findViewById(R.id.actionBtn);

        educationIMGView = findViewById(R.id.educationIMGView);
        educationTXTView = findViewById(R.id.educationTXTView);

        imageButton=findViewById(R.id.actionBtn);
        imageButton.setImageResource(R.drawable.ic_search_icon_foreground);

        educationIMGView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CategoryActivity.this,CategoryItem.class);
                startActivity(intent);
            }
        });

        educationTXTView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CategoryActivity.this,CategoryItem.class);
                startActivity(intent);
            }
        });
    }
}