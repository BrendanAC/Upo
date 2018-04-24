/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import javax.swing.JFrame;



/**
 *
 * @author Brendan C.
 */
class ProjectPageDecorator implements ProjectPage {
    protected ProjectPage decoratedPage;
    /**
     * This is going to passing common page.
     * @param decoratedPage the common page.
     */
    public ProjectPageDecorator(ProjectPage decoratedPage){
        this.decoratedPage = decoratedPage;
    }
    /**
     * This is going to intialize the common page.
     * =
     */
    @Override
    public void initComponent(JFrame frame) {
        decoratedPage.initComponent(frame);
    }
    
}