package behavioral.chainofresponsibility;

public class Hospital extends Medical {

	public Hospital(Service before, Service next) {
		super(before, next);
		treatment = new Unurgent();
	}

	@Override
	public Treatment handleRequest(Request context) {
			return treatment;
	}
}
