package structural_patterns.bridge.screen;

public class Television implements Screen{
	@Override
	public void playVideo(String data) {
		 System.out.println("Television is showing -> " + data);
	}
}
