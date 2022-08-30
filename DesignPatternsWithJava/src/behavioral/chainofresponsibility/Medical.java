package behavioral.chainofresponsibility;

public abstract class Medical implements Service {
	protected Service before;
	protected Service next;
	protected Treatment treatment;
	
	public Medical(Service before, Service next) {
		this.before = before;
		this.next = next;
	}
}
