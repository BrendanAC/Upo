/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_DOC;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anak
 */
public class NewsFeedView extends JFrame{
   
    private JPanel panel;
    private JButton addButton;
    
    /**set up view for DMView
     * 
     */
    NewsFeedView(){
    }
    /**return object panel of DMView
     * 
     * @return JPanel being used by DMView
     */
    public JPanel getPanel(){
        return null;
    }
    /**return object frame of DMView
     * 
     * @return JFrame being used by DMView
     */
    public JFrame getFrame(){
        return null;                
    }
    /**add ActionListener to addButton with listenForAddButton as a parameter
     * 
     * @param listenForAddButton: 
     */
    public void addButtonsActionListener(ActionListener listenForAddButton){
        
    }
}
