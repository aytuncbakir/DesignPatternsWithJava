package structural_patterns.bridge.screen;

public class Projector implements Screen {

	@Override
	public void playVideo(String data) {
		System.out.println("Projector is showing -> " + data);
	}

}
