package com.example.lat_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class form3 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "app.com.lat_akb_if9_10116412_agungnugraha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }

    public void selanjutnya(View view) {
        Intent intent = new Intent(this, form4.class);

        EditText editnama = (EditText) findViewById(R.id.edit2);
        EditText editumur = (EditText) findViewById(R.id.edit3);

        String message = editnama.getText().toString();


        intent.putExtra(EXTRA_MESSAGE, message);



        startActivity(intent);
    }
}