package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;

public class pop2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop2);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*1),(int)(height*.8));

        //displays a video file
        VideoView videoView = (VideoView) findViewById(R.id.videoView3);


        //String videoPath = "android.resource://com.example.signum/" + R.raw.intro;
        Intent intent2 = getIntent();
        String video = intent2.getStringExtra("video");
        Uri uri = Uri.parse(video);
        videoView.setVideoURI(uri);
//        videoView.setOnPreparedListener();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();


    }
}
