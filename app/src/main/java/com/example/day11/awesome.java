package com.example.day11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class awesome extends AppCompatActivity {
    ImageView ivawesome;
    Button btnawesome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awesome);

        ivawesome = findViewById(R.id.ivawesome);
        btnawesome = findViewById(R.id.btnawesome);

        btnawesome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout = new Intent(awesome.this,beranda.class);
                startActivity(layout);
            }
        });
    }
}
