package com.test.group4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;



public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    public void sendGame(View view){
        //Intent intent = new Intent(this, DisplayGame.class);
        setContentView(R.layout.game_select);
    }
    public void sendCustom(View view){

    }
    public void sendOption(View view){

    }
    public void sendScore(View view){

    }

    public void sendRacing(View view){
        setContentView(new GamePanel(this));
    }
    public void sendMarathon(View view){

    }
    public void sendAsteroids(View view){

    }
}

