/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI_DOC;

import observer.Subject;

/**
 *
 * @author Brendan C.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}


