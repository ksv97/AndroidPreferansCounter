package com.example.preferanscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.preferanscounter.classes.Game;

public class ThreePlayersGameActivity extends AppCompatActivity {

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_players_game);
        game = new Game(3);
    }


}