package com.example.lat2_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Register = findViewById(R.id.register);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoRegister = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(gotoRegister);
            }
        });


    }
}
