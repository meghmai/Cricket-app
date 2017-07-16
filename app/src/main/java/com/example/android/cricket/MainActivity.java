package com.example.android.cricket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runsA=0;
    int wicketsA=0;
    int runsB=0;
    int wicketsB=0;
    int ballsA=20;
    int ballsB=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayRunsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRunsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(score));
    }
    public void displayBallsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_balls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayBallsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_balls);
        scoreView.setText(String.valueOf(score));
    }
    public void add1PointA(View a)
    {
        if (wicketsA<10 && ballsA>0){
            runsA = runsA + 1;
            ballsA=ballsA-1;
            displayRunsForTeamA(runsA);
            displayBallsForTeamA(ballsA);
    }}
    public void add4PointsA(View a)
    {
        if (wicketsA<10 && ballsA>0){
            runsA = runsA + 4;
            ballsA=ballsA-1;
            displayRunsForTeamA(runsA);
            displayBallsForTeamA(ballsA);
    }}
    public void add6PointsA(View a)
    {
        if (wicketsA<10 && ballsA>0){
            runsA = runsA + 6;
            ballsA=ballsA-1;
            displayRunsForTeamA(runsA);
            displayBallsForTeamA(ballsA);
    }}
    public void addWicketA(View a)
    {
        if (wicketsA<10 && ballsA>0){
        wicketsA=wicketsA+1;
            ballsA=ballsA-1;
        displayWicketsForTeamA(wicketsA);
            displayBallsForTeamA(ballsA);
    }}
    public void add1PointB(View a)
    {
        if (wicketsB<10 && ballsB>0){
            runsB = runsB + 1;
            ballsB=ballsB-1;
            displayRunsForTeamB(runsB);
            displayBallsForTeamB(ballsB);
    }}
    public void add4PointsB(View a)
    {
        if (wicketsB<10 && ballsB>0){
            runsB = runsB + 4;
            ballsB=ballsB-1;
            displayRunsForTeamB(runsB);
            displayBallsForTeamB(ballsB);
    }}
    public void add6PointsB(View a)
    {
        if (wicketsB<10 && ballsB>0){
            runsB = runsB + 6;
            ballsB=ballsB-1;
            displayRunsForTeamB(runsB);
            displayBallsForTeamB(ballsB);
    }}
    public void addWicketB(View a)
    {
        if (wicketsB<10 && ballsB>0){
        wicketsB=wicketsB+1;
            ballsB=ballsB-1;
        displayWicketsForTeamB(wicketsB);
            displayBallsForTeamB(ballsB);
    }}
    public void reset(View a)
    {
        runsA=0;
        runsB=0;
        wicketsA=0;
        wicketsB=0;
        ballsA=20;
        ballsB=20;
        displayRunsForTeamA(runsA);
        displayWicketsForTeamA(wicketsA);
        displayRunsForTeamB(runsB);
        displayWicketsForTeamB(wicketsB);
        displayBallsForTeamA(ballsA);
        displayBallsForTeamB(ballsB);
    }
}
