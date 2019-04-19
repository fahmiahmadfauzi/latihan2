package com.example.lat2_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnVerify = findViewById(R.id.btnverify);

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goverif = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(goverif);
            }
        });
    }
}
