package com.example.amrez.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {
    private Button btn_nowPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        btn_nowPlaying = (Button) findViewById(R.id.btn_nowPlaying);
        btn_nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(NowPlaying.this, DetailScreen.class);
                startActivity(p);
            }
        });
    }
}
