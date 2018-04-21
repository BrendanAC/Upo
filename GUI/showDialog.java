/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anak
 */
public class showDialog {
    private JFrame frame;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField = new JTextField();
    private JTextField textField1 = new JTextField();
    private JTextArea textArea = new JTextArea();
    private JButton submitButton = new JButton("Submit");
    private JButton closeButton = new JButton("close");
    private JPanel contentPanel = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel boxPanel = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    
    showDialog(){
        frame = new JFrame();
        frame.setSize(200,200);
         frame.setVisible(true);
      
         
    }
    public void contactDialog(){
      
        closeButton.addActionListener((e)-> frame.setVisible(false)); 
       label = new JLabel("contact");
       
        panel.add(closeButton, BorderLayout.EAST);
        
        frame.add(label,BorderLayout.NORTH); 
        frame.add(textArea,BorderLayout.CENTER); 
        frame.add(panel,BorderLayout.SOUTH); 
        
    }
    public void uploadDialog(){

         
        closeButton.addActionListener((e)-> frame.setVisible(false)); 
        submitButton.addActionListener((e)-> frame.setVisible(false)); 
       label = new JLabel("upload");
       panel.add(submitButton,BorderLayout.WEST);
       panel.add(closeButton,BorderLayout.EAST);       
       
        frame.add(label,BorderLayout.NORTH);
        frame.add(textField,BorderLayout.CENTER);
        contentPanel.add(panel,BorderLayout.SOUTH); 
        
        frame.add(contentPanel,BorderLayout.SOUTH); 
    }
    public void downloadDialog(){
                frame.setSize(200,200);
         frame.setVisible(true);
         
        closeButton.addActionListener((e)-> frame.setVisible(false)); 
        submitButton.addActionListener((e)-> frame.setVisible(false)); 
        
       label = new JLabel("download");
       panel.add(submitButton,BorderLayout.WEST);
       panel.add(closeButton,BorderLayout.EAST);       
       
        frame.add(label,BorderLayout.NORTH);
        frame.add(textField,BorderLayout.CENTER);
        contentPanel.add(panel,BorderLayout.SOUTH); 
        
        frame.add(contentPanel,BorderLayout.SOUTH); 
    }
    public void requestDialog(){
                     frame.setSize(200,200);
         frame.setVisible(true);
         
        closeButton.addActionListener((e)-> frame.setVisible(false)); 
        submitButton.addActionListener((e)-> frame.setVisible(false));
        
        label = new JLabel("request");
        label1 = new JLabel("File name");
       label2 = new JLabel("Description name");
       
       boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
       

       boxPanel.add(label1);
       boxPanel.add(textField);
       boxPanel.add(label1);
       boxPanel.add(scrollPane);
       panel.add(submitButton,BorderLayout.WEST);
       panel.add(closeButton,BorderLayout.EAST);       
       
       
        contentPanel.add(panel,BorderLayout.SOUTH); 
        
         frame.add(label,BorderLayout.NORTH);
        frame.add(boxPanel,BorderLayout.CENTER);
        frame.add(contentPanel,BorderLayout.SOUTH);
        frame.pack();
    }
    public void suggestDialog(){
        
    }
   
}
