package com.example.hadastourgeman.talisafrut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class q extends AppCompatActivity {
    String s = new String();
    TextView sh;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);
        sh = (TextView) findViewById(R.id.sh);

        int identifier = getResources().getIdentifier("ques", "string", this.getPackageName());
        s = getResources().getString(identifier);
        sh.setText(s);
        Intent g = getIntent();
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

    public void back(View view) {
        Intent t = new Intent(this, motivelist.class);
        startActivity(t);
    }
}
