package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public abstract class Observable {

    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
