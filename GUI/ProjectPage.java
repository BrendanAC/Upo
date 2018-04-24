/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import javax.swing.JFrame;

/**
 *  This is going to be the subject of our decorator pattern.
 * @author Brendan C.
 */
public interface ProjectPage  {
    /**
     * Create the components for each of the type of projectpage.
     * @param frame Parent Frame.
     */
    void initComponent();
}
