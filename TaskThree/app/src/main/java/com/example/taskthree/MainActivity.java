package com.example.taskthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClick;
    ImageView imageView1, imageView2, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        btnClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClick:
                imageView1.setImageResource(R.drawable.bird);
                imageView1.setVisibility(View.VISIBLE);
                break;
        }

    }
}
