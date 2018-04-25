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

public class CommonPagepage implements Page {
        private JFrame frame;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel westPanel;
    private JPanel boxLayoutPanel1;
    
    private JPanel notePanel;
    private JPanel graphPanel;
    private JPanel southCenterPanel;
    
    private JButton profileButton;
    private JButton projectButton;
    
    private JButton newsFeedButton;
    private JButton contactButton;
    private JButton uploadButton;
    private JButton downloadButton;
    private JButton requestButton;
    private JButton deleteRequestButton;
    
    private JProgressBar progressBar;
    
    private JTextArea textArea;
    private JTextArea taskTextArea;
    private ArrayList<Object> buttonsList;
    private ArrayList<Object> textList;
    private JLabel label;
    private JButton logoutButon;
    
    public CommonPagepage(){
        initComponent();
    }
       void initComponent(){
        frame = new JFrame();
        frame.setName("Base");

        frame.setSize(700,750);
        
        frame.setLayout(new BorderLayout());
        
        graphPanel = new JPanel();
        southCenterPanel = new JPanel();
        notePanel = new JPanel();

        logoutButon = new JButton("Log Out");
        newsFeedButton = new JButton("NewsFeed");
        contactButton = new JButton("Contact info");
        uploadButton = new JButton("Upload");
        downloadButton = new JButton("Download");
        requestButton = new JButton("request");
        deleteRequestButton = new JButton("Delete");
        
        newsFeedButton.setMargin(new Insets(20,20,20,20));
        contactButton.setMargin(new Insets(20,20,20,20));
        
        //textarea
        textArea = new JTextArea();
        textArea.setSize(10,20);
        textArea.setText("");
        textArea.setEnabled(false);
        
        taskTextArea = new JTextArea(10,20);
        
        //      progressBar
        progressBar = new JProgressBar();
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        
        
        
        //label
       label = new JLabel("");
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        
       //TextArea
       
        
//        displayText();
        JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);        //notePanel
        JScrollPane scrollPanel1 = new JScrollPane( taskTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        notePanel.add(new JLabel("My Note"), BorderLayout.WEST);
        notePanel.add(scrollPane);
        
        //northPanel
        northPanel = new JPanel(new BorderLayout());
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        northPanel.add(logoutButon,BorderLayout.EAST);
//        northPanel.add(notePanel,BorderLayout.CENTER);
        
        //centerPanel
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //westPanel
        westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //graphPanel
        graphPanel.add(progressBar);
        graphPanel.add(scrollPanel1);
//        graphPanel.add(notePanel);
        
        //southCenterPanel
        southCenterPanel.add(uploadButton);
        southCenterPanel.add(downloadButton);
        southCenterPanel.add(requestButton);
        
       
        
        //add component
        northPanel.add(label,BorderLayout.WEST);
        northPanel.add(notePanel,BorderLayout.CENTER);
        
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(southCenterPanel, BorderLayout.SOUTH);
        westPanel.add(newsFeedButton);
        westPanel.add(contactButton);
        
       
          
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

    public JPanel getCenterPanel() {
        return centerPanel;
    }
    public JFrame getFrame() {
        return frame;
    }

       public static void main(String[] agrs){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                
             new BasePage();
            }
        });       
       }

    
    
}
