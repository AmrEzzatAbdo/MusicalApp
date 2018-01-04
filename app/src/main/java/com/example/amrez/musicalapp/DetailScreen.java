package com.example.amrez.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailScreen extends AppCompatActivity {

    private Button btn_detailScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);


        btn_detailScreen = (Button) findViewById(R.id.btn_detailScreen);
        btn_detailScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DetailScreen.this, payment.class);
                startActivity(p);
            }
        });
    }
}
