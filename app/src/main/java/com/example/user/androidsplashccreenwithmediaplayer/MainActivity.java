package com.example.user.androidsplashccreenwithmediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Mediaplayer define
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mediaplayer create
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    public void playAudio(View view) {
        mediaPlayer.start();
    }

    public void stopAudio(View view) {
        mediaPlayer.stop();
    }
}
