package structural_patterns.bridge.test;


import structural_patterns.bridge.device.Computer;
import structural_patterns.bridge.device.Phone;
import structural_patterns.bridge.screen.Projector;
import structural_patterns.bridge.screen.Television;
import structural_patterns.bridge.video.Documentary;
import structural_patterns.bridge.video.Film;
import structural_patterns.bridge.video.Series;
import structural_patterns.bridge.video.Video;
import structural_patterns.bridge.videoplayer.XPlayer;
import structural_patterns.bridge.videoplayer.ZPlayer;

public class Test {

	public static void main(String[] args) {
		
		Video film = new Film("Darknight", "DarknightData Stream");
		Video documentary = new Documentary("Caribbean", "CaribbeanData Stream");
		Video series = new Series("How i met your mother", "How i met your mother Data Stream");
		
		Computer computer = new Computer();
		computer.playVideo(film);


        System.out.println();  

        Phone phone = new Phone();
        phone.playVideo(series);

        System.out.println();  
        
        computer.setScreen(new Television());
        computer.setVideoPlayer(new ZPlayer());
        computer.playVideo(documentary);
        
        System.out.println();  
        
        computer.setScreen(new Projector());
        computer.setVideoPlayer(new XPlayer());
        computer.playVideo(film);

        
	}

}
