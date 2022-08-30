package structural_patterns.bridge.screen;

public class Monitor implements Screen{

	@Override
	public void playVideo(String data) {
		 System.out.println("Monitor is showing -> " + data);
	}

}
