package structural_patterns.proxy;

public class Citizen {
	private President president;
	
	public Citizen(PresidentSecretary secretary){
		president = secretary.giveMePresedent();
	}

	public String talkToPresedent(){
		president.listenCitizen("I have some questions");
		return "Thank you!!!";
	}
	
	public String tellYourIssue(){
		president.handleIssue("I need a job!");
		return "Thank you!!!";
	}
}
