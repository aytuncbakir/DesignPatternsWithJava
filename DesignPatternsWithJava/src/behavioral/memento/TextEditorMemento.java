package behavioral.memento;
/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class TextEditorMemento {

    private String text;

    public TextEditorMemento() {
    	text = "";
    }

    public TextEditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
