package com.example.gridviewlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDialog extends AppCompatActivity {

    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);


        Intent intent = getIntent();
        if (intent != null) {
            image = findViewById(R.id.imageView2);
            text = findViewById(R.id.textView);

            image.setImageResource(intent.getIntExtra("countryImage", 0));
            text.setText(intent.getStringExtra("text"));
        }

    }

    public void close(View view) {

        finish();

    }
}