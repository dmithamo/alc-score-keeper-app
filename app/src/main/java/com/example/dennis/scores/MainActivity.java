package com.example.dennis.scores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int chelseaScore = 0;
    int unitedScore = 0;

    int chelseaReds = 0;
    int unitedReds = 0;

    int chelseaYellows = 0;
    int unitedYellows = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetGame(null);
    }

    //    To reset the game, returning scores to zero
    public void resetGame(View view) {
        chelseaScore = 0;
        unitedScore = 0;
        chelseaReds = 0;
        unitedReds = 0;
        chelseaYellows = 0;
        unitedYellows = 0;

        displayChelseaScore(chelseaScore);
        displayUnitedScore(unitedScore);

        displayChelseaReds(chelseaReds);
        displayUnitedReds(unitedReds);

        displayChelseaYellows(chelseaYellows);
        displayUnitedYellows(unitedYellows);
    }

    //    When chelsea scores, add goal
    public void addChelseaGoals(View view) {
        chelseaScore += 1;
        displayChelseaScore(chelseaScore);
    }

    //    When United scores, add goal
    public void addUnitedGoals(View view) {
        unitedScore += 1;
        displayUnitedScore(unitedScore);
    }

    //    When chelsea reds, add red
    public void addChelseaReds(View view) {
        if(chelseaReds < 5){
            chelseaReds += 1;
        }
        displayChelseaReds(chelseaReds);
    }

    //    When united reds, add red
    public void addUnitedReds(View view) {
        if(unitedReds < 5){
            unitedReds += 1;
        }
        displayUnitedReds(unitedReds);
    }


    //    When chelsea Yellows, add yellow
    public void addChelseaYellows(View view) {
        chelseaYellows += 1;
        displayChelseaYellows(chelseaYellows);
    }

    //    When United Yellows, add yellow
    public void addUnitedYellows(View view) {
        unitedYellows += 1;
        displayUnitedYellows(unitedYellows);
    }


    //    Display Chelsea's score
    public void displayChelseaScore(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.chelsea_score);
        goalsView.setText(String.valueOf(goals));

    }

    //    Display United's score
    public void displayUnitedScore(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.united_score);
        goalsView.setText(String.valueOf(goals));
    }


    //  Display chelsea red cards
    public void displayChelseaReds(int reds) {
        TextView redsView = (TextView) findViewById(R.id.chelsea_reds);
        redsView.setText(String.valueOf(reds));
    }


    //  Display United red cards
    public void displayUnitedReds(int reds) {
        TextView redsView = (TextView) findViewById(R.id.united_reds);
        redsView.setText(String.valueOf(reds));
    }

    //  Display chelsea yellow cards
    public void displayChelseaYellows(int yellows) {
        TextView redsView = (TextView) findViewById(R.id.chelsea_yellows);
        redsView.setText(String.valueOf(yellows));
    }

    //  Display United yellow cards
    public void displayUnitedYellows(int yellows) {
        TextView redsView = (TextView) findViewById(R.id.united_yellowss);
        redsView.setText(String.valueOf(yellows));
    }
}


