package com.fju.water3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView feeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        Float fee = intent.getFloatExtra("FEE",0);
        Log.d("ResultActivity",fee+"");

        int n =(int)(fee+0.5f);
        feeText = findViewById(R.id.fee);
        feeText.setText(n +"");

    }
}
