package com.example.wood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Register_activity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button1);

        // Set an OnClickListener to navigate to the next activity
       btn1.setOnClickListener(v-> {
                Intent intent = new Intent(Register_activity.this,Login_Activity.class);
                startActivity(intent);
        });
        btn2.setOnClickListener(v-> {
            Intent intent = new Intent(Register_activity.this,Login_Activity.class);
            startActivity(intent);
        });

        ImageView gifImageView=findViewById(R.id.imageView6);
        Glide.with(this)
                .asGif()
                .load(R.drawable.register_image) // Replace with your GIF file name
                .into(gifImageView);




    }
}