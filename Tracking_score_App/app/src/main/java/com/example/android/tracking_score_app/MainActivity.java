package com.example.android.tracking_score_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Initialize all scores to 0.*/

    int goal = 0;
    int corner = 0;
    int faul = 0;
    int goal2 = 0;
    int corner2 = 0;
    int faul2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Functions which adds points for certain button for tem A and tem B*/

    public void addonegoalforteamA(View v){
        goal = goal + 1;
        displayForTeamAgoals(goal);
    }

    public void addonecornerforteamA(View v){
        corner = corner + 1;
        displayForTeamAcorners(corner);
    }

    public void addonefoulforteamA(View v){
        faul = faul + 1;
        displayForTeamAfauls(faul);
    }

    public void addonegoalforteamB(View v) {
        goal2 = goal2 + 1;
        displayForTeamBgoals(goal2);
    }

    public void addonecornerforteamB(View v){
        corner2 = corner2 + 1;
        displayForTeamBcorners(corner2);
    }

    public void addonefoulforteamB(View v){
        faul2 = faul2 + 1;
        displayForTeamBfauls(faul2);
    }

    /* Reset scores for both teams.
     *
     * */

    public void resetscores(View v){
        int goal = 0;
        int corner = 0;
        int faul = 0;
        int goal2 = 0;
        int corner2 = 0;
        int faul2 = 0;
        displayForTeamAgoals(goal);
        displayForTeamAcorners(corner);
        displayForTeamAfauls(faul);
        displayForTeamBgoals(goal2);
        displayForTeamBcorners(corner2);
        displayForTeamBfauls(faul2);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamAgoals(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.goals_a_team);
        goalsView.setText(String.valueOf(goals));
    }

    public void displayForTeamAcorners(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.corners_a_team);
        cornersView.setText(String.valueOf(corners));
    }

    public void displayForTeamAfauls(int fauls) {
        TextView faulsView = (TextView) findViewById(R.id.fauls_a_team);
        faulsView.setText(String.valueOf(fauls));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamBgoals(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.goals_b_team);
        goalsView.setText(String.valueOf(goals));
    }

    public void displayForTeamBcorners(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.corners_b_team);
        cornersView.setText(String.valueOf(corners));
    }

    public void displayForTeamBfauls(int fauls) {
        TextView faulsView = (TextView) findViewById(R.id.fauls_b_team);
        faulsView.setText(String.valueOf(fauls));
    }
}
