/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import pattern.*;
import GUI.Model;
import System.ActionType;
import System.Room;
import System.Upo;
import System.User;
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
public class MyProjectPage  extends JFrame {
    private CommonPagepage MyProjectPage;
    private User user;
    private Upo upo;
    
    private JButton announceButton;
    private JButton createMemberButton;
    private JButton setTaskButton;
    private JButton setPositionButton;
    private JButton setDepartmentButton;
    private JButton acceptRequestButton;
    private JButton suggestButton;
    
    private JPanel NorthCenterCenterPanel;
    private JPanel CenterCenterPanel;
    private JPanel CenterCenterCenterPanel;
    
    private JTextArea requestTextArea;
    private JTextArea textArea;
    private JLabel pageLabel;
    private JLabel requestLabel;
    
    
        
    public MyProjectPage(){
        suggestButton = new JButton("Suggest");
        
        requestTextArea = new JTextArea();
        textArea = new JTextArea();
        requestTextArea.setSize(10,20);
        textArea.setSize(10,20);
        JScrollPane scrollPanel1 = new JScrollPane( requestTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        MyProjectPage.getCenterPanel().add(scrollPanel1,BorderLayout.CENTER);
        pageLabel = new JLabel("MyProjectPage");
        MyProjectPage.setLabel(pageLabel);
        NorthCenterCenterPanel.add(requestLabel, BorderLayout.WEST);        
        NorthCenterCenterPanel.add(scrollPanel1, BorderLayout.CENTER);        
        NorthCenterCenterPanel.add(acceptRequestButton, BorderLayout.EAST);
        CenterCenterCenterPanel.add(textArea);
        
        CenterCenterPanel.add(NorthCenterCenterPanel, BorderLayout.NORTH);
        CenterCenterPanel.add(CenterCenterCenterPanel, BorderLayout.CENTER);
        
        
        MyProjectPage.getCenterPanel().add(CenterCenterPanel,BorderLayout.CENTER);

        MyProjectPage.addToWestPanelFrame(suggestButton);
        MyProjectPage.getFrame().setVisible(true);
//        MyProjectPage.addToCenterPanelFrame(NorthCenterCenterPanel);
    }
}
