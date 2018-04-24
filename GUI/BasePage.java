/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Brendan C.
 */

public class BasePage implements Page{
    private JFrame frame;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel westPanel;
    private JPanel boxLayoutPanel1;
    private JButton profileButton;
    private JButton projectButton;
    private JButton addButton;
    private JTextArea textArea;
    private ArrayList<Object> buttonsList;
    private ArrayList<Object> textList;
    private JLabel label;
    private JButton logoutButon;
    public BasePage(){
        initComponent();
    }
       void initComponent(){
        frame = new JFrame();
        frame.setName("Base");

        frame.setSize(700,750);
        
        frame.setLayout(new BorderLayout());
        
       
        logoutButon = new JButton("Log Out");
        
        //textarea
        textArea = new JTextArea();
        
        textArea.setText("");
        textArea.setEnabled(false);
        
       
        
        
        //label
       label = new JLabel("");
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        
       
//        //testList
//        textList.add("a");
//        textList.add("b");
//        textList.add("c");
//        textList.add("d");
       
        //actionListener
        
//        displayText();
        
        
        //northPanel
        northPanel = new JPanel(new BorderLayout());
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        northPanel.add(logoutButon,BorderLayout.EAST);
        
        //centerPanel
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //westPanel
        westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        
        
       
        
        //add component
        northPanel.add(label);
        centerPanel.add(textArea);
        
        
       
          
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(westPanel, BorderLayout.WEST);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        
       }
       void setLabel(JLabel l){
           frame.setVisible(false);
           l.setFont(new Font("Serif", Font.PLAIN, 50));
           northPanel.add(l);
           frame.setVisible(true);
           
       }
       public void addToWestPanelFrame(Component c){
           frame.setVisible(false);
           frame.remove(westPanel);
           westPanel.add(c);
           frame.add(westPanel,BorderLayout.WEST);
           frame.setVisible(true);
       }
       public void addToCenterPanelFrame(Component c){
           frame.setVisible(false);
           centerPanel.removeAll();

           centerPanel.add(c);
           frame.add(centerPanel,BorderLayout.CENTER);

           frame.setVisible(true);
       }
       public void addToNorthPanelFrame(Component c){
           
           frame.setVisible(false);
           frame.remove(northPanel);
           northPanel.add(c);
           frame.add(northPanel,BorderLayout.NORTH);
           frame.setVisible(true);
       }
       void setVisible(boolean b) {
           frame.setVisible(b);
    }
       public static void main(String[] agrs){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                
             new BasePage();
            }
        });       }

    
    
}
