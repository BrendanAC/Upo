/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Anak
 */
public class displayScreenNSubmit extends JFrame{
    displayScreenNSubmit(ArrayList<String> l){
        
        
        this.setSize(300,350);
        
        
        JButton submitButton = new JButton("Submit");
        JButton closeButton = new JButton("Close");
        JTextArea textArea = new JTextArea();
//        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));
        
        for(String s: l){
            textArea.append(s);
        }
        
        closeButton.addActionListener((e)-> this.setVisible(false));
        submitButton.addActionListener((e)-> this.setVisible(false));
        
        panel1.add(submitButton);
        panel1.add(closeButton);
        
        this.add(textArea, BorderLayout.CENTER);
        this.add(panel1, BorderLayout.SOUTH);
        
        
        this.setVisible(true);
    }

    public displayScreenNSubmit(Container c,String s){
        //should use inputDialog for username and password. then use custom for 
        if(s != "Request Button"){
            JOptionPane.showMessageDialog(c,s);
        }else{
        Object[] possibilities = {"ham", "spam", "yam"};
        JOptionPane.showInputDialog(
                            c,
                            "Complete the sentence:\n"
                            + "\"Green eggs and...\"",
                            "Customized Dialog",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            possibilities,
                            "ham");
        }
            
    }


    
    
}

