package behavioral.command.television;

public interface Command {
	
	public void execute(TelevisionFeature feature);
	public void undo();
	public void redo();
}
