package com.example.day11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class mulai extends AppCompatActivity {
    ImageView ivmulai;
    Button btnmulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        ivmulai = findViewById(R.id.ivmulai);
        btnmulai = findViewById(R.id.btnmulai);

        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout = new Intent(mulai.this, awesome.class);
                startActivity(layout);
            }
        });
    }
}
