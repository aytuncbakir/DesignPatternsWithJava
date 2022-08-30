package structural_patterns.adapter;

public class MyPhone implements Chargeable {

    private int workingValtage;

    public MyPhone() {
    	workingValtage = 5;
    }

	@Override
	public int charge() {
		System.out.println("Myphone is working.");
        return workingValtage;
	}
}
