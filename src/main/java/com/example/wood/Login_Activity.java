package com.example.wood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Set up the login button click listener
        Button loginButton = findViewById(R.id.button); // Replace with your login button ID
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomepage();
            }
        });
    }

    // Method to navigate to the Homepage_activity
    private void goToHomepage() {
        Intent intent = new Intent(Login_Activity.this, Homepage_activity.class);
        startActivity(intent);
        finish(); // Optional: Close the login activity
    }

    // Existing signup method
    public void signup(View v) {
        Intent intent = new Intent(Login_Activity.this, Signup_Activity.class);
        startActivity(intent);
    }
}
