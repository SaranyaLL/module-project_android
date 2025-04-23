package com.example.wood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Accountsettings_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_accountsettings);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Add OnClickListener for "Edit Profile"
        findViewById(R.id.textView23).setOnClickListener(v -> {
            Intent intent = new Intent(Accountsettings_activity.this, Editprofile_activity.class);
            startActivity(intent);
        });

        // Add OnClickListener for "My Orders"
        findViewById(R.id.textView24).setOnClickListener(v -> {
            Intent intent = new Intent(Accountsettings_activity.this, Myorder_Activity.class);
            startActivity(intent);
        });

        // Add OnClickListener for "Wishlist"
        findViewById(R.id.textView25).setOnClickListener(v -> {
            Intent intent = new Intent(Accountsettings_activity.this, Wishlist_Activity.class);
            startActivity(intent);
        });

        findViewById(R.id.textView26).setOnClickListener(v -> {
            Intent intent = new Intent(Accountsettings_activity.this, Addproduct_Activity.class);
            startActivity(intent);
        });
    }
}
