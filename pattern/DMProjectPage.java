/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Anak
 */

//set task 
//create member
//suggest to superior


//*******************8This is not working. Use DMProjectPage_1 for now. *****************************
public class DMProjectPage extends myProjectPage{
    

    public DMProjectPage(int i){
//        setJFrameName("DMProject Page");

        setJFrameName("DMProject Page");
        initComponent();
        
        System.out.println("DMProject Page");
        setJFrameSize(500,550);
    }
    
    public void DMComponent(){
        setTaskButton();
        createMemberButton();
    }
    
    public void setTaskButton(){
        
    }
    public void createMemberButton(){
        
    }
   
    
    public static void main(String[] agrs){
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
//                new DMProjectPage();
            }
        });

    }
    private JButton setTaskButton;
    private JButton createMemberButton;
    
}
