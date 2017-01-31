package com.yamenrbdgmail.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
implements View.OnClickListener {
    private String GOOGLE_API_KEY = "AIzaSyDQU_mrKyS1gj6FDRDWQS4k2ZaWyEBsppU";
    private String YOUTUBE_VIDEO_ID = "YpC39gdX97U";
    private String YOUTUBE_PLAYLIST = "PLh2QSchbA3pntIcjZRMsnAb7l_tAUJjeg";
    private Button btnPlayVideo;
    private Button btnPlayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo= (Button)findViewById(R.id.btnPlayVideo);
        btnPlayList = (Button) findViewById(R.id.btnPlayList);

        btnPlayVideo.setOnClickListener(this);
        btnPlayList.setOnClickListener(this);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case R.id.btnPlayVideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlayList:
                intent=YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY,YOUTUBE_PLAYLIST);
                break;
            default:
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
}













