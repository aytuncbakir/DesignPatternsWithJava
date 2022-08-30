package behavioral.chainofresponsibility;

public abstract class Cure implements Treatment {
	protected String description;
	protected Treatment nextService;

	public String getDescription() {
		return description;
	}

	@Override
	public void setNextService(Treatment nextService) {
		this.nextService = nextService;
	}
	
	@Override
	public Treatment getNextService() {
		return nextService;
	}

	@Override
	public void show() {
		
		if(nextService != null) {
			nextService.show();
			
			Treatment nextNextService = nextService.getNextService();
			if(nextNextService != null) {
				nextNextService.show();
				
			}
		}
		System.out.println(description);
	}
}
