package com.example.hadastourgeman.talisafrut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

    }
    public void back(View view) {
        finish();
    }

    public void start(View view) {
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
