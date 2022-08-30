package structural_patterns.adapter;

public class ChargeableElectricalApplianceAdapter implements ElectricalAppliances {

	private Chargeable chargeable;

	public ChargeableElectricalApplianceAdapter(Chargeable chargeable) {
		this.chargeable = chargeable;
	}

	@Override
	public int plugAndWork() {
		return chargeable.charge();
	}

}
