/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_2;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anak
 */
public class View extends JFrame{
    private JPanel panel;
    private JButton addButton;
    
    View(){
        panel = new JPanel();
        addButton = new JButton("addButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        panel.add(addButton);
        this.add(panel);
    }
    public JPanel getPanel(){
       return this.panel; 
    }
    public JFrame getFrame(){
       return this; 
    }
    public void addButtonsActionListener(ActionListener listenForAddButton){
        addButton.addActionListener(listenForAddButton);
    }
}
