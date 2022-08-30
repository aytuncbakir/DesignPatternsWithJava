package structural_patterns.bridge.device;

import structural_patterns.bridge.screen.Monitor;
import structural_patterns.bridge.video.Video;
import structural_patterns.bridge.videoplayer.XPlayer;

public class Computer extends VideoPlayableDevice{

	 public Computer() {

	        screen = new Monitor();
	        videoPlayer = new XPlayer();
	    }

	    @Override
	    public void playVideo(Video video) {

	        System.out.println("Computer is working");
	        super.playVideo(video);
	    }
}
