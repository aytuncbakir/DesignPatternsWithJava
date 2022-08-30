package structural_patterns.adapter;

public class Oven  implements ElectricalAppliances {

    private int volt;

    public Oven() {
        this.volt = 220;
    }

	@Override
	public int plugAndWork() {
		System.out.println("Oven is working");
		return volt;
	}

}
