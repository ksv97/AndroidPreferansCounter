package com.example.preferanscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.preferanscounter.classes.Game;
import com.example.preferanscounter.classes.Player;

public class ThreePlayersGameActivity extends AppCompatActivity {

    private Game game;
    private Player p1, p2, p3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_players_game);
        game = new Game(3);
        p1 = game.getPlayer(1);
        p2 = game.getPlayer(2);
        p3 = game.getPlayer(3);
    }


    public void onCalculateBtnClick(View view) {
        fillInGameValues();
        game.calculate();
        TextView result1, result2, result3;

        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        result3 = findViewById(R.id.result3);

        result1.setText(Integer.toString(p1.getResult()));
        result2.setText(Integer.toString(p2.getResult()));
        result3.setText(Integer.toString(p3.getResult()));
    }

    private void fillInGameValues() {
        EditText bullet1, bullet2, bullet3;
        EditText mountain1, mountain2, mountain3;
        EditText whists12, whists13, whists21, whists23, whists31, whists32;

        bullet1 = findViewById(R.id.bullet1);
        bullet2 = findViewById(R.id.bullet2);
        bullet3 = findViewById(R.id.bullet3);

        mountain1 = findViewById(R.id.mountain1);
        mountain2 = findViewById(R.id.mountain2);
        mountain3 = findViewById(R.id.mountain3);

        whists12 = findViewById(R.id.whists12);
        whists13 = findViewById(R.id.whists13);
        whists21 = findViewById(R.id.whists21);
        whists23 = findViewById(R.id.whists23);
        whists31 = findViewById(R.id.whists31);
        whists32 = findViewById(R.id.whists32);

        p1.setBulletPoints(Integer.parseInt(bullet1.getText().toString()));
        p2.setBulletPoints(Integer.parseInt(bullet2.getText().toString()));
        p3.setBulletPoints(Integer.parseInt(bullet3.getText().toString()));

        p1.setMountainPoints(Integer.parseInt(mountain1.getText().toString()));
        p2.setMountainPoints(Integer.parseInt(mountain2.getText().toString()));
        p3.setMountainPoints(Integer.parseInt(mountain3.getText().toString()));

        p1.setWhist(2, Integer.parseInt(whists12.getText().toString()));
        p1.setWhist(3, Integer.parseInt(whists13.getText().toString()));
        p2.setWhist(1, Integer.parseInt(whists21.getText().toString()));
        p2.setWhist(3, Integer.parseInt(whists23.getText().toString()));
        p3.setWhist(1, Integer.parseInt(whists31.getText().toString()));
        p3.setWhist(2, Integer.parseInt(whists32.getText().toString()));


    }
}