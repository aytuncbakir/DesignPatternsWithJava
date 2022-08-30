package structural_patterns.proxy;

public class RealPresident implements President {

	@Override
	public void listenCitizen(String questions) {
		System.out.println("President: I am listening to you.");
	}

	@Override
	public void handleIssue(String issue) {
		System.out.println("President: I am listenin to your issue.");
	}
}
