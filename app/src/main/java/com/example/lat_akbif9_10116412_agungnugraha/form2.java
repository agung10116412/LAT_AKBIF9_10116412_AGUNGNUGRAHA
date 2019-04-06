package com.example.lat_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class form2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }

    public void masuk(View view) {
        Intent intent = new Intent(form2.this, form3.class);
        startActivity(intent);
    }

}
