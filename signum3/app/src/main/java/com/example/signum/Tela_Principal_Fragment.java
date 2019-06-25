package com.example.signum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tela_Principal_Fragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tela_principal, container, false);

        VideoView videoView = (VideoView) view.findViewById(R.id.videoView2);


        String video = "https://signum.s3-us-west-2.amazonaws.com/TelaInicio.mp4";
        Uri uri = Uri.parse(video);
        videoView.setVideoURI(uri);
//        videoView.setOnPreparedListener();

        MediaController mediaController = new MediaController(view.getContext());
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

        return view;
    }
}

