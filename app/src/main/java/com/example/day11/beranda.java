package com.example.day11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class beranda extends AppCompatActivity {
    ImageView ivberanda;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_beranda);

        ivberanda = findViewById (R.id.ivberanda);
    }
}