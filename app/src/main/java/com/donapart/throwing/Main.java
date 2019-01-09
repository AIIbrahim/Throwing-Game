package com.donapart.throwing;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    TextView tav,tbv;
    Button TA3p,TA2p,TAFT,TB3p,TB2p,TBFT,reset;
    int a3p,a2p,aft,b3p,b2p,bft,av=0,bv=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tav = findViewById(R.id.tav);
        tbv = findViewById(R.id.tbv);
        displayteamA();
        displayteamB();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displayteamA() {
        findViewById(R.id.TA3p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3p= 3;
                av+=3;
                tav.setText(String.valueOf(av));
            }
        });


        findViewById(R.id.TA2p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2p= 2;
                av+=2;
                tav.setText(String.valueOf(av));
            }
        });
        findViewById(R.id.TAFT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aft=1;
                av+=1;
                tav.setText(String.valueOf(av));
            }
        });
        resetall();
    }
    private void displayteamB() {
        findViewById(R.id.TB3p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3p= 3;
                bv+=3;
                tbv.setText(String.valueOf(bv));
            }
        });

        findViewById(R.id.TB2p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2p= 2;
                bv+=2;
                tbv.setText(String.valueOf(bv));
            }
        });
        findViewById(R.id.TBFT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bft=1;
                bv+=1;
                tbv.setText(String.valueOf(bv));
            }
        });
        resetall();
    }

    private void resetall() {
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                av=0;
                bv=0;
                tav.setText(String.valueOf(av));
                tbv.setText(String.valueOf(bv));
            }
        });
    }
}
