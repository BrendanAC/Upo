/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.CommonPagepage;
import System.Upo;
import System.User;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Anak
 */
public class DMProjectPage extends JFrame {
    private CommonPagepage DMProjectPage;
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
    
    
        
    public DMProjectPage(){
        suggestButton = new JButton("Suggest");
        createMemberButton = new JButton("create Member");
        setTaskButton = new JButton("set Task");
        setPositionButton = new JButton("set Position");
        setDepartmentButton = new JButton("set Department");
        acceptRequestButton = new JButton("Accept Request");
        requestTextArea = new JTextArea();
        textArea = new JTextArea();
        requestTextArea.setSize(10,20);
        textArea.setSize(10,20);
        JScrollPane scrollPanel1 = new JScrollPane( requestTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        DMProjectPage.getCenterPanel().add(scrollPanel1,BorderLayout.CENTER);
        pageLabel = new JLabel("DMProjectPage");
        DMProjectPage.setLabel(pageLabel);
        NorthCenterCenterPanel.add(requestLabel, BorderLayout.WEST);        
        NorthCenterCenterPanel.add(scrollPanel1, BorderLayout.CENTER);        
        NorthCenterCenterPanel.add(acceptRequestButton, BorderLayout.EAST);
        CenterCenterCenterPanel.add(textArea);
        
        CenterCenterPanel.add(NorthCenterCenterPanel, BorderLayout.NORTH);
        CenterCenterPanel.add(CenterCenterCenterPanel, BorderLayout.CENTER);
        
        
        DMProjectPage.getCenterPanel().add(CenterCenterPanel,BorderLayout.CENTER);
        DMProjectPage.addToWestPanelFrame(announceButton);
        DMProjectPage.addToWestPanelFrame(createMemberButton);
        DMProjectPage.addToWestPanelFrame(setTaskButton);
        DMProjectPage.addToWestPanelFrame(setPositionButton);
        DMProjectPage.addToWestPanelFrame(suggestButton);
        DMProjectPage.getFrame().setVisible(true);
//        DMProjectPage.addToCenterPanelFrame(NorthCenterCenterPanel);
    }
}
