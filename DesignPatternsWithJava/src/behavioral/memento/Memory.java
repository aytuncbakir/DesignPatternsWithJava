package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Memory {

    private List<TextEditorMemento> list;

    public Memory() {
        list = new ArrayList<>();
    }

    public void addMemento(TextEditorMemento memento){
        list.add(memento);
    }

    public TextEditorMemento getLastVersion(){

        if (!list.isEmpty()){
            TextEditorMemento lastVersion = list.get(list.size() - 2); // last element has typing error so drop it.
            list.remove(list.size() - 1);
            return lastVersion;
            
        } else {
            throw new ArrayIndexOutOfBoundsException("No version found!");
        }
    }
}
