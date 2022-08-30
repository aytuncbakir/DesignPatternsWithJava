package structural_patterns.bridge.device;

import structural_patterns.bridge.screen.Screen;
import structural_patterns.bridge.video.Film;
import structural_patterns.bridge.video.Video;
import structural_patterns.bridge.videoplayer.VideoPlayer;

public abstract class VideoPlayableDevice {

	protected Screen screen;
    protected VideoPlayer videoPlayer;

    public VideoPlayableDevice() {
    }

    public VideoPlayableDevice(Screen screen, VideoPlayer videoPlayer) {
        this.screen = screen;
        this.videoPlayer = videoPlayer;
    }

    public void playVideo(Video video){

        String data = videoPlayer.playVideo(video);
        screen.playVideo(data);
        
    }

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public VideoPlayer getVideoPlayer() {
		return videoPlayer;
	}

	public void setVideoPlayer(VideoPlayer videoPlayer) {
		this.videoPlayer = videoPlayer;
	}
    
    
}
