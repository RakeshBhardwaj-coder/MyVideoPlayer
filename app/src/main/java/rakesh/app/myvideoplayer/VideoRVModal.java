package rakesh.app.myvideoplayer;

import android.graphics.Bitmap;

public class VideoRVModal {


    private String videoName;
    private String videoPath;
    private Bitmap videoThumbnail;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public Bitmap getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(Bitmap videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    public VideoRVModal(String videoName, String videoPath, Bitmap videoThumbnail) {
        this.videoName = videoName;
        this.videoPath = videoPath;
        this.videoThumbnail = videoThumbnail;
    }



}
