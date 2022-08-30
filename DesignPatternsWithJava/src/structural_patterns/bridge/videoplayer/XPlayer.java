package structural_patterns.bridge.videoplayer;

import structural_patterns.bridge.video.Video;

public class XPlayer implements VideoPlayer{

	@Override
	public String playVideo(Video video) {
		System.out.println("XPlayer play "+ video.getName());
		return video.getData();
	}

	
}
