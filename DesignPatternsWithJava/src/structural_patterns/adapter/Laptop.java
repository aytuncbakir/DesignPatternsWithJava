package structural_patterns.adapter;

public class Laptop implements Chargeable {

    private int workingValtage;

    public Laptop() {
    	workingValtage = 22;
    }

	@Override
	public int charge() {
		System.out.println("Laptop is working");
        return workingValtage;
	}
}
