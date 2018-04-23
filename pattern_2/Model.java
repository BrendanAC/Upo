/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_2;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anak
 */
public class Model {
    private ArrayList<JButton> buttonsList = new ArrayList<>();
    private JPanel panel;
    
    public void addNewButton(JPanel panel1, JFrame frame){
        JButton button = new JButton("new Button");
        buttonsList.add(button);
        panel1.add(button);
        panel1.revalidate();
        panel1.repaint();
//        frame.add(panel);
        System.out.println("add new Button");
    }
}
