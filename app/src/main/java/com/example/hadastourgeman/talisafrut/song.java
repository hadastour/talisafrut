package com.example.hadastourgeman.talisafrut;

import android.content.Intent;
import android.os.FileUriExposedException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class song extends AppCompatActivity {

    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Intent g = getIntent();
        s1=g.getStringExtra("s1");
    }

    public void next(View view) {
        Intent t = new Intent(this, motivelist.class);
        t.putExtra("s1",s1);
        startActivity(t);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.CC) {
            Intent g = new Intent(this, credit.class);
            startActivity(g);
        }
        return true;
    }
}