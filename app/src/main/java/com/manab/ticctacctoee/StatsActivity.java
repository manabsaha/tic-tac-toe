package com.manab.ticctacctoee;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    TextView player1stat,player2stat;
    Button resetStats;

    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String TEXT1 = "stat1";
    private static final String TEXT2 = "stat2";
    private static int sPlayer1,sPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        player1stat = (TextView) findViewById(R.id.player1stat);
        player2stat = (TextView) findViewById(R.id.player2stat);
        resetStats = (Button) findViewById(R.id.resetStats);

        load_stat();

        resetStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_stat();
            }
        });

    }

    private void load_stat(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        sPlayer1 = sharedPreferences.getInt(TEXT1,0);
        sPlayer2 = sharedPreferences.getInt(TEXT2,0);

        player1stat.setText(""+sPlayer1);
        player2stat.setText(""+sPlayer2);
    }

    private void save_stat(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(TEXT1,0);
        editor.putInt(TEXT2,0);
        editor.apply();
        load_stat();
    }

}
