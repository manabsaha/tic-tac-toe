package com.manab.ticctacctoee;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String TEXT1 = "stat1";
    private static final String TEXT2 = "stat2";

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private TextView tvResult,tvStats;

    private int turnFlag= 1;
    private char gameOverFlag = 'n';
    private int player1,player2;
    private static int sPlayer1,sPlayer2;
    private int count = 0;

    boolean buttonPass1 = true;
    boolean buttonPass2 = true;
    boolean buttonPass3 = true;
    boolean buttonPass4 = true;
    boolean buttonPass5 = true;
    boolean buttonPass6 = true;
    boolean buttonPass7 = true;
    boolean buttonPass8 = true;
    boolean buttonPass9 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        link_var_to_xml();

        load_stat();
        update_stat();
        tvStats.setText("Turn: Player 1");

        listen_to_button();
    }

    private void game_result(String player){
        count++;
    if
    (  (b1.getText().toString().equals(player)&&b2.getText().toString().equals(player)&&b3.getText().toString().equals(player))
    || (b1.getText().toString().equals(player)&&b4.getText().toString().equals(player)&&b7.getText().toString().equals(player))
    || (b3.getText().toString().equals(player)&&b6.getText().toString().equals(player)&&b9.getText().toString().equals(player))
    || (b7.getText().toString().equals(player)&&b8.getText().toString().equals(player)&&b9.getText().toString().equals(player))
    || (b1.getText().toString().equals(player)&&b5.getText().toString().equals(player)&&b9.getText().toString().equals(player))
    || (b3.getText().toString().equals(player)&&b5.getText().toString().equals(player)&&b7.getText().toString().equals(player))
    || (b4.getText().toString().equals(player)&&b5.getText().toString().equals(player)&&b6.getText().toString().equals(player))
    || (b2.getText().toString().equals(player)&&b5.getText().toString().equals(player)&&b8.getText().toString().equals(player))) {
        if (player == "X") {
            tvResult.setText("Player 1 wins!");
            tvStats.setText("Game Over");
            gameOverFlag = 'y';
            ++player1;
            save_stat();
            load_stat();
            update_stat();
        } else {
            tvResult.setText("Player 2 wins!");
            tvStats.setText("Game Over");
            gameOverFlag = 'y';
            ++player2;
            save_stat();
            load_stat();
            update_stat();
        }
    }
    else{
        if(count == 9) {
            tvResult.setText("Its a tie game!");
            tvStats.setText("Game Over");
            gameOverFlag = 'y';
        }
    }
    }

    private String tic_tac_toe() {
            if (turnFlag == 1) {
                tvStats.setText("Turn: Player 2");
                turnFlag = 2;
                return ("X");
            } else {
                tvStats.setText("Turn: Player 1");
                turnFlag = 1;
                return ("O");
            }

    }

    private void listen_to_button() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass1 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b1.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass1 = false;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass2 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b2.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass2 = false;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass3 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b3.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass3 = false;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass4 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b4.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass4 = false;
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass5 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b5.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass5 = false;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass6 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b6.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass6 = false;
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass7 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b7.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass7 = false;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass8 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b8.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass8 = false;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPass9 == true && gameOverFlag == 'n') {
                    String crossZero = tic_tac_toe();
                    b9.setText("" + crossZero);
                    game_result(crossZero);
                    buttonPass9 = false;
                }
            }
        });

    }

    private void link_var_to_xml() {
        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button3);
        b3 = (Button) findViewById(R.id.button4);
        b4 = (Button) findViewById(R.id.button5);
        b5 = (Button) findViewById(R.id.button6);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button8);
        b8 = (Button) findViewById(R.id.button9);
        b9 = (Button) findViewById(R.id.button10);
        tvResult = (TextView) findViewById(R.id.winResult);
        tvStats = (TextView) findViewById(R.id.tvStat);
    }

    private void save_stat(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(TEXT1,player1);
        editor.putInt(TEXT2,player2);
        editor.apply();
    }
    private void load_stat(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        sPlayer1 = sharedPreferences.getInt(TEXT1,0);
        sPlayer2 = sharedPreferences.getInt(TEXT2,0);
    }
    private void update_stat(){
        player1=sPlayer1;
        player2=sPlayer2;
    }
}
