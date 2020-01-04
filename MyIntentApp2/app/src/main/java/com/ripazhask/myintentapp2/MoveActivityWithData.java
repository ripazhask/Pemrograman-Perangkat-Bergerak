package com.ripazhask.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveActivityWithData extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvDataReceived = findViewById(R.id.tvDataReceived);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        Integer umur = getIntent().getIntExtra(EXTRA_AGE,0);

        String text = "Nama : "+nama+ ",\n Umur : "+umur;
        tvDataReceived.setText(text);


    }
}
