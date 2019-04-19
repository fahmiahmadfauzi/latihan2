package com.example.lat2_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnSend = findViewById(R.id.btnsend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosend = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(gotosend);
            }
        });
    }
}
