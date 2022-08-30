package structural_patterns.proxy;

public class PresidentSecretary {
	
	private President president;
	
	public PresidentSecretary(President president){
		this.president = new ProxyPresident(president);
	}

	public President giveMePresedent(){
		System.out.println("I want to President!");
		return president;
	}
}
