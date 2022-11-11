package com.example.estationery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.estationery.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {


    ImageView pens;
    ImageButton accountBtn;

    int[] programImages = {R.drawable.notebook,R.drawable.toy,R.drawable.pen,R.drawable.eraser_sharpner};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        pens = findViewById(R.id.pens);
        accountBtn = findViewById(R.id.accountBtn);

        pens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,PenScreen.class);
                startActivity(i);
            }
        });

        accountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,Account.class);
                startActivity(i);
            }
        });


    }
}