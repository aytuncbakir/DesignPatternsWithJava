package structural_patterns.proxy;

public class Test {

	public static void main(String[] args) {
		
		
		President president = new RealPresident();
		PresidentSecretary secretary = new PresidentSecretary(president);
		
		Citizen bob = new Citizen(secretary);
		
		bob.talkToPresedent();
		bob.tellYourIssue();

	}
}
