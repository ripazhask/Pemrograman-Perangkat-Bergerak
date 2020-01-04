package com.ripazhask.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveData;
    Button btnDial;
    Button Btn_inet;
    Button btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnDial = findViewById(R.id.BtnDial);
        btnDial.setOnClickListener(this);

        Btn_inet = findViewById(R.id.Btn_inet);
        Btn_inet.setOnClickListener(this);

        btnIntent = findViewById(R.id.BtnTest);
        btnIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent moveDataActivity = new Intent(MainActivity.this,MoveActivityWithData.class);
                moveDataActivity.putExtra(MoveActivityWithData.EXTRA_NAME, "Fahri P");
                moveDataActivity.putExtra(MoveActivityWithData.EXTRA_AGE,"19");
                startActivity(moveDataActivity);
                break;
            case R.id.BtnDial:
                String phoneNumber = "02985552333";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.Btn_inet:
                String linkNet = "https://www.polines.ac.id/id/";
                Intent dialNet = new Intent(Intent.ACTION_VIEW, Uri.parse("url:"+linkNet));
                startActivity(dialNet);
                break;
            case R.id.BtnTest:
                Intent MoveIntent = new Intent(MainActivity.this, MoveActivityforIntent.class);
                startActivity(MoveIntent);
                break;
        }
    }
}
