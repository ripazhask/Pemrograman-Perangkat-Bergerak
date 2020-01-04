package com.ripazhask.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivityforIntent extends AppCompatActivity {
Button BtnTastes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_activityfor_intent);

        BtnTastes = findViewById(R.id.btn_move_activity);
        BtnTastes.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View View) {
    switch (onClick(View View)) {
        case R.id.BtnTest:
            Intent moveActivity = new Intent(MoveActivityforIntent.this, MoveActivity.class);
            startActivity(moveActivity);
            break;
    }
}

}
