package structural_patterns.proxy;

public class ProxyPresident implements President {
	
	private President realPresident;
	
	public ProxyPresident(President realPresident){
		this.realPresident = realPresident;
	}

	@Override
	public void listenCitizen(String questions) {
		System.out.println("Proxy: Listening your questions.");
		boolean isProblemValid = checkProblem(questions);
		if(isProblemValid)
			forwardToPresidentForListening(questions);
	}

	@Override
	public void handleIssue(String issue) {
		System.out.println("Proxy: Tell your issue.");
		boolean isIssueValid = checkIssue(issue);
		if(isIssueValid)
			forwardToPresidentForIssue(issue);
	}
	
	private boolean checkProblem(String questions){
		boolean isProblemValid = true;
		return isProblemValid;
	}
	
	private boolean checkIssue(String issue){
		boolean isProblemValid = true;
		return isProblemValid;
	}
	
	private void forwardToPresidentForListening(String questions){
		realPresident.listenCitizen(questions);
	}
	
	private void forwardToPresidentForIssue(String issue){
		realPresident.handleIssue(issue);
	}
}
