/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Anak
 */
public class NewClass extends JFrame {
    
    NewClass(){
        
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.getContentPane().add(contentPanel);
        
        
        this.setSize(700,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] agrs){
         SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new NewClass();
            }
        });
    }
    private JPanel boxLayoutPanel;
    private JButton addButton;
    private JButton profileButton;
    private JButton projectButton;
    private JLabel label;
//    private  JTextField textField;
    private JTextArea textArea;
    private static JTextField textField;    
    private ArrayList<String> textList;
}
