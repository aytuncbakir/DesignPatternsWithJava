package behavioral.memento;
/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        Memory memory = new Memory();

        TextEditor textEditor = new TextEditor();
        textEditor.add("I ");
        textEditor.add("went ");
        textEditor.add("to ");
        textEditor.add("school ");
        saveVersion(memory, textEditor);
        textEditor.add("tommmorrow "); // mistake , you have to undo
        saveVersion(memory, textEditor);
        undo(memory, textEditor);  
        textEditor.add("tomorrow ");
        saveVersion(memory, textEditor);
        textEditor.add("witth my friend. ");
        saveVersion(memory, textEditor);
        undo(memory, textEditor);  
        textEditor.add("with my friend. ");
        saveVersion(memory, textEditor);
       
    }

    private static void undo(Memory memory, TextEditor textEditor) {
    	textEditor.undo(memory.getLastVersion());
    	System.out.println("Undo :");
    	textEditor.print();  
    }

    private static void saveVersion(Memory memory, TextEditor textEditor) {
        TextEditorMemento memento = textEditor.save();
        memory.addMemento(memento);
        System.out.println("Save Version :");
        textEditor.print();

    }
}
