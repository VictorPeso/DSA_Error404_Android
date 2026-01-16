package edu.upc.dsa.dsa_error404_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ExtrasActivity extends AppCompatActivity {

    Button EventosButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        EventosButton = findViewById(R.id.EventosButton);

        EventosButton.setOnClickListener(v -> {
            startActivity(new Intent(ExtrasActivity.this, EventosActivity.class));
        });
    }
}
