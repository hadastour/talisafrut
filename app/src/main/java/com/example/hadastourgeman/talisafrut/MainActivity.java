package com.example.hadastourgeman.talisafrut;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    AlertDialog.Builder aaa;
    int a;
    EditText ed;
    String S1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.b);
        ed=(EditText)findViewById(R.id.ed);

        aaa=new AlertDialog.Builder(this);

        aaa.setTitle("שלום");
        aaa.setMessage("בואו נתחיל!");
        aaa.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialoginterface, int i) {
                goTost(a);

            }
        });


        AlertDialog ad=aaa.create();
        ad.show();

    }
    public void P(View view) {
        S1=ed.getText().toString();
        if (S1.equals("")||S1.equals(".")) {
            Toast.makeText(this, "לא הכנסת את פרטיך", Toast.LENGTH_SHORT).show();}
        else{
                Intent t = new Intent(this, song.class);
                t.putExtra("s1",S1);
                startActivity(t);
            }

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
    private void goTost(int a){
        Toast.makeText(this,"Excellent let's get started", Toast.LENGTH_SHORT).show();
    }
}
