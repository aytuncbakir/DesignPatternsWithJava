package behavioral.chainofresponsibility;

public class Emergency extends Medical {

	public Emergency(Service before, Service next) {
		super(before, next);
		treatment = new Urgent();
	}

	@Override
	public Treatment handleRequest(Request context) {
		if (context == Request.URGENT)
			return treatment;
		else {
			Treatment nextService = next.handleRequest(context);
			nextService.setNextService(treatment);
			return nextService;
		}
	}
}
