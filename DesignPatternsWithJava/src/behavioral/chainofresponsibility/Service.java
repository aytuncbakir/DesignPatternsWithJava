package behavioral.chainofresponsibility;

public interface Service {
	
	public Treatment handleRequest(Request context);
}
