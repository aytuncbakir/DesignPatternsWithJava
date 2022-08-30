package structural_patterns.adapter;

public class Test {
	
	public static void main(String... args) {
		
		WallPlug wallPlug = new WallPlug();
		
		Television television = new Television();
		wallPlug.giveElectric(television);
		System.out.println();
		
		Oven oven = new Oven();
		wallPlug.giveElectric(oven);
		System.out.println();
		
		Kettle kettle = new Kettle();
		wallPlug.giveElectric(kettle);
		System.out.println();
		
		MyPhone myPhone = new MyPhone();
		ChargeableElectricalApplianceAdapter adapter = new ChargeableElectricalApplianceAdapter(myPhone);
		wallPlug.giveElectric(adapter);
		System.out.println();
		
		Laptop laptop = new Laptop();
	    adapter = new ChargeableElectricalApplianceAdapter(laptop);
		wallPlug.giveElectric(adapter);
		System.out.println();
       
		
	}

}
