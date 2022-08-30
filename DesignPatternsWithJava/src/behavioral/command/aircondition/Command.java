package behavioral.command.aircondition;

public interface Command {
	
	public void execute(Temperature temperature);
	
	public void undo();
	
	public void redo();
}
