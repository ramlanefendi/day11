package com.example.day11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivawal;
    Button btnberikutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivawal = findViewById(R.id.ivawal);
        btnberikutnya = findViewById(R.id.btnberikutnya);

        btnberikutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout = new Intent(MainActivity.this,mulai.class);
                startActivity(layout);
            }
        });
    }
}
