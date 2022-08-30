package structural_patterns.bridge.device;

import structural_patterns.bridge.screen.Monitor;
import structural_patterns.bridge.video.Video;
import structural_patterns.bridge.videoplayer.YPlayer;

public class Phone extends VideoPlayableDevice{

	 public Phone() {

	        screen = new Monitor();
	        videoPlayer = new YPlayer();
	    }

	    @Override
	    public void playVideo(Video video) {

	        System.out.println("Phone is working");
	        super.playVideo(video);
	    }
}
