/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

/**
 *
 * @author Francois
 */
public class Memento<T> {

    protected T state;

    public Memento(T stateToSave) {

        state = stateToSave;
    }

    public T getSavedState() {
        return state;
    }

    public Memento saveInMemento() {
        return new Memento(state);
    }
}
