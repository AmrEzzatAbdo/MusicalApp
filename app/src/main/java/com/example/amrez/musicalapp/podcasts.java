package com.example.amrez.musicalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class podcasts extends Activity {
    private Button btn_pocasts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcasts);
        btn_pocasts = (Button) findViewById(R.id.btn_pocasts);
        btn_pocasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(podcasts.this, NowPlaying.class);
                startActivity(p);
            }
        });
    }
}
