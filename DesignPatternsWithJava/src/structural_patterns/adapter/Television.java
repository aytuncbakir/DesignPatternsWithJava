package structural_patterns.adapter;

public class Television implements ElectricalAppliances {

    private int volt;

    public Television() {
        this.volt = 220;
    }

	@Override
	public int plugAndWork() {
		System.out.println("Television is working");
		return volt;
	}
   
}
