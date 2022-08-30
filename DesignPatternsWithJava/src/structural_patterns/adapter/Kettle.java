package structural_patterns.adapter;

public class Kettle implements ElectricalAppliances {

    private int volt;

    public Kettle() {
        this.volt = 220;
    }

	@Override
	public int plugAndWork() {
		System.out.println("Kettle is working");
		return volt;
	}
}
