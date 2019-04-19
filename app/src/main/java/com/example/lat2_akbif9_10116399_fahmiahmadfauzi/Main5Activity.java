package com.example.lat2_akbif9_10116399_fahmiahmadfauzi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class Main5Activity extends AppCompatActivity {
    Toolbar tolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(tolbar1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_, menu);

        return true;
    }
}
