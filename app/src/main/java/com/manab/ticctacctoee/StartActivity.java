package com.manab.ticctacctoee;

import android.content.Intent;
//import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button btnNewGame,btnStats,btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        btnNewGame = (Button) findViewById(R.id.btnNew);
        btnStats = (Button) findViewById(R.id.btnStats);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myGameIntent = new Intent(StartActivity.this,GameActivity.class);
                startActivity(myGameIntent);
            }
        });
        btnStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myStatIntent = new Intent(StartActivity.this,StatsActivity.class);
                startActivity(myStatIntent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
