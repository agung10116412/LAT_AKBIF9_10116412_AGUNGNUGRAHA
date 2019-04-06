package com.example.lat_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void mulai (View view) {
        Intent intent = new Intent(MainActivity.this,form2.class);
        startActivity(intent);


    }
}
