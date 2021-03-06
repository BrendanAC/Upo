/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
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
import System.Room;
import System.User;
import java.awt.PopupMenu;
/**
 *
 * @author Anak
 */

public class MyProjectPage extends JFrame {
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
    private JButton deleteButton;
    
    private JPanel NorthCenterCenterPanel;
    private JPanel CenterCenterPanel;
    private JPanel CenterCenterCenterPanel;
    
    private JTextArea requestTextArea;
    private JTextArea textArea;
    private JLabel pageLabel;
    private JLabel requestLabel;
    
    
        
    public MyProjectPage(){
        
        MyProjectPage = new CommonPagepage();
        
        NorthCenterCenterPanel = new JPanel();
        CenterCenterCenterPanel = new JPanel();
        CenterCenterPanel = new JPanel();
        
        suggestButton = new JButton("Suggest Button");
        
        requestTextArea = new JTextArea(10,20);
        textArea = new JTextArea(30,50);
//        requestTextArea.setSize(10,20);
//        textArea.setSize(10,20);
        
       
        requestLabel = new JLabel("Request List");
        
        
        
        JScrollPane scrollPanel1 = new JScrollPane( requestTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        JScrollPane scrollPanel1 = new JScrollPane( new JTextArea(10,20),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       MyProjectPage.getCenterPanel().add(scrollPanel1,BorderLayout.CENTER);
        pageLabel = new JLabel("MyProjectPage");
        MyProjectPage.setLabel(pageLabel);
//        NorthCenterCenterPanel.add(requestLabel, BorderLayout.WEST);        
//        NorthCenterCenterPanel.add(scrollPanel1, BorderLayout.CENTER);        
//        NorthCenterCenterPanel.add(acceptRequestButton, BorderLayout.EAST);
//        CenterCenterCenterPanel.add(textArea);
        
        CenterCenterPanel.add(NorthCenterCenterPanel, BorderLayout.NORTH);
        CenterCenterPanel.add(CenterCenterCenterPanel, BorderLayout.CENTER);
        MyProjectPage.getCenterPanel().add(CenterCenterPanel,BorderLayout.CENTER);

        MyProjectPage.addToWestPanelFrame(suggestButton);
        MyProjectPage.getFrame().setVisible(true);
//        MyProjectPage.addToCenterPanelFrame(NorthCenterCenterPanel);
    }
}

