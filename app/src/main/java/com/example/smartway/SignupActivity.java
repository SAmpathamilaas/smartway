package com.example.smartway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    //viweBinding
    //private ActivitySignUpBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding =ActivitySignUpBinding.inflate{getLayoutInflater()}
        setContentView(R.layout.activity_signup);
    }
}