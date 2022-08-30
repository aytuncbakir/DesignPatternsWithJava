package behavioral.chainofresponsibility;

public class Polyclinic extends Medical  {

	public Polyclinic(Service before, Service next) {
		super(before, next);
		treatment = new Normal();
	}

	@Override
	public Treatment handleRequest(Request context) {
		if(context == Request.NORMAL)
			return treatment;
		else {
			Treatment nextService = next.handleRequest(context);
			nextService.setNextService(nextService);
			return nextService;
		}
	}
}
