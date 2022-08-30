package behavioral.chainofresponsibility;

public interface Treatment {
	
	void show();
	void setNextService(Treatment otherHelp);
	Treatment getNextService();
}
