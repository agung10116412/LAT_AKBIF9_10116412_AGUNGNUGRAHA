package com.example.lat_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class form4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
        Intent intent = getIntent();

        String message = intent.getStringExtra(form3.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.txt2);

        textView.setText(message);

    }

    public void oke(View view) {
        finish();
        moveTaskToBack(true);
    }
}
