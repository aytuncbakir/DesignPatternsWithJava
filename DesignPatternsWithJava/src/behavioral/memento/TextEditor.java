package behavioral.memento;
/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class TextEditor {

    private String text;

    public TextEditor() {
        text = "";
    }

    public TextEditor(String text) {
        this.text = text;
    }

    public void add(String newText){
        text = text + newText;
    }

    public TextEditorMemento save(){
        return new TextEditorMemento(text);
    }

    public void undo(TextEditorMemento memento){
        text = memento.getText();
    }

    public void print(){
        System.out.println(text);
    }
}
