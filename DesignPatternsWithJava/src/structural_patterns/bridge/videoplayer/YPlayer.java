package structural_patterns.bridge.videoplayer;

import structural_patterns.bridge.video.Video;

public class YPlayer implements VideoPlayer{

	@Override
	public String playVideo(Video video ) {
		System.out.println("YPlayer play "+ video.getName());
		return video.getData();
	}

}
