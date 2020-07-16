package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreofTeamA = 0;
    int scoreofTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Team A score update methods*/

    public void addfiveforTeamA(View v) {
        scoreofTeamA = scoreofTeamA + 5;
        displayForTeamA(scoreofTeamA);
        displayCommonMessage("Amazing!! Team A,you get 5 point!");
    }

    public void addthreeforTeamA(View v) {
        scoreofTeamA = scoreofTeamA + 3;
        displayForTeamA(scoreofTeamA);
        displayCommonMessage("WoW!! Team A,you get 3 point!");
    }

    public void addtwoforTeamA(View v) {
        scoreofTeamA = scoreofTeamA + 2;
        displayForTeamA(scoreofTeamA);
        displayCommonMessage("Hurry!! Team A,you get 2 Point!");
    }

    public void addfreeforTeamA(View v) {
        scoreofTeamA = scoreofTeamA + 1;
        displayForTeamA(scoreofTeamA);
        displayCommonMessage("Oh no!! Team A you get only 1 Point!");
    }


    /* Team B score update Method */


    public void addfiveforTeamB(View v) {
        scoreofTeamB = scoreofTeamB + 5;
        displayForTeamB(scoreofTeamB);
        displayCommonMessage("Amazing!! Team B you get 5 Point!");
    }

    public void addthreeforTeamB(View v) {
        scoreofTeamB = scoreofTeamB + 3;
        displayForTeamB(scoreofTeamB);
        displayCommonMessage("Wow!! Team B you get 3 Point!");
    }

    public void addtwoforTeamB(View v) {
        scoreofTeamB = scoreofTeamB + 2;
        displayForTeamB(scoreofTeamB);
        displayCommonMessage("Hurry!! Team B you get 2 Point!");
    }

    public void addfreeforTeamB(View v) {
        scoreofTeamB = scoreofTeamB + 1;
        displayForTeamB(scoreofTeamB);
        displayCommonMessage("Oh no!! Team B you get only 1 Point!");
    }

    /**
     * Reset Method
     */

    public void resetScore(View v) {
        scoreofTeamA = 0;
        scoreofTeamB = 0;
        displayForTeamA(scoreofTeamA);
        displayForTeamB(scoreofTeamB);
        displayCommonMessage("Game Is Over !!");
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Message .
     */

    public void displayCommonMessage(String message) {
        TextView messageView = (TextView) findViewById(R.id.messageDisplay);
        messageView.setText(String.valueOf(message));
    }

}


