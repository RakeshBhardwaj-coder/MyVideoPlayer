package rakesh.app.myvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoPlayerJust extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player_just);

        videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.machine;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
MediaController mediaController = new MediaController(this);
mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

    }
}