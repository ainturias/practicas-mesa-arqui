package pregunta32.memento;

import java.util.LinkedList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementos;
    private int index;

    public Caretaker() {
        this.index = -1;
        this.mementos = new LinkedList<Memento>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
        index = mementos.size() - 1;
    }

    public Memento atras() {
        index--;
        try {
            return mementos.get(index);
        } catch (Exception e) {
            return null;
        }
    }

    public Memento adelante() {
        index++;
        try {
            return mementos.get(index);
        } catch (Exception e) {
            return null;
        }
    }

}
