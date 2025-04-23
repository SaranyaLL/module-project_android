package com.example.wood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Homepage_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

        // Reference the profile icon
        ImageView profileIcon = findViewById(R.id.imageView5);

        // Set OnClickListener to navigate to AccountSettingsActivity
        profileIcon.setOnClickListener(v -> {
            Intent intent = new Intent(Homepage_activity.this, Accountsettings_activity.class);
            startActivity(intent);
            finish();
        });
    }
}
