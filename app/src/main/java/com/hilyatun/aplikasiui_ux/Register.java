package com.hilyatun.aplikasiui_ux;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnregister = findViewById(R.id.btnregister);
        ImageView btnback = findViewById(R.id.btnback);

        btnregister.setOnClickListener(v -> {
            Intent i =new Intent(this, MainActivity.class);
            startActivity(i);
        });
        btnback.setOnClickListener(v -> {
            Intent i =new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }
}