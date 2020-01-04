package com.ripazhask.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btndonasi = findViewById(R.id.btn_register);
        btndonasi.setOnClickListener((View.OnClickListener) this);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_register:
                Intent donasi = new Intent(MainActivity.this,DonationActivity.class);
                startActivity(donasi);
        }

    }
}
