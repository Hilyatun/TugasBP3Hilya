package com.hilyatun.aplikasiui_ux;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnlogin1 = findViewById(R.id.btnlogin1);
        ImageView btnback = findViewById(R.id.btnback);

        btnlogin1.setOnClickListener(v -> {
            Intent i =new Intent(this, home.class);
            startActivity(i);
        });
        btnback.setOnClickListener(v -> {
            Intent i =new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }
}