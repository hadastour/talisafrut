package com.example.hadastourgeman.talisafrut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class motivelist extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    TextView tv;
    String s1;
    String [] xx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivelist);
        lv=(ListView) findViewById(R.id.lv);
        tv=(TextView)findViewById(R.id.tv);
        Intent g = getIntent();
        s1=g.getStringExtra("s1");
        tv.setText("שלום"+s1+"לפניך חומר על השיר ");
        int ma = getResources().getIdentifier("motive", "array", this.getPackageName());
        xx=getResources().getStringArray(ma);

        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,xx);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String[] a;
        int ma = getResources().getIdentifier("motive", "array", this.getPackageName());
        a=getResources().getStringArray(ma);
        tv.setText(""+a[i]);

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

    public void Q(View view) {
        Intent qu = new Intent(this, q.class);
        startActivity(qu);
    }

    public void S(View view) {
        Intent t = new Intent(this, song.class);
        startActivity(t);
    }
}


