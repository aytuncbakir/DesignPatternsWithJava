package structural_patterns.bridge.videoplayer;

import structural_patterns.bridge.video.Video;

public class ZPlayer implements VideoPlayer{

	@Override
	public String playVideo(Video video) {
		System.out.println("ZPlayer play "+ video.getName());
		return video.getData();
	}

}
