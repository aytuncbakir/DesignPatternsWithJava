package behavioral.template;

public class Test {

	public static void main(String[] args) {
		
		Travel  myTravel = new MyTravel("My travel to Helsinki");
		System.out.println("--------------------------------------------------");
		System.out.println(myTravel.getName());
		System.out.println("--------------------------------------------------");
		myTravel.takeAVacation();
		
		
		Travel  yourTravel = new YourTravel("Your travel to Helsinki");
		System.out.println("--------------------------------------------------");
		System.out.println(yourTravel.getName());
		System.out.println("--------------------------------------------------");
		yourTravel.takeAVacation();
		
		
		Travel  herTravel = new HerTravel("Her travel to Helsinki");
		System.out.println("--------------------------------------------------");
		System.out.println(herTravel.getName());
		System.out.println("--------------------------------------------------");
		herTravel.takeAVacation();
		
		Travel  hisTravel = new HisTravel("His travel to Helsinki");
		System.out.println("--------------------------------------------------");
		System.out.println(hisTravel.getName());
		System.out.println("--------------------------------------------------");
		hisTravel.takeAVacation();
		
		
	}

}
