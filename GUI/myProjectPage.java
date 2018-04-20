/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
public class myProjectPage extends JFrame{
    public myProjectPage(){

        initComponent();
    }
    void initComponent(){
        this.setName("NewsFeed Page");
        this.setSize(700,750);
        this.setLayout(new BorderLayout());
        
//      panel
        northPanel = new JPanel(new BorderLayout());
        centerPanel = new JPanel(new BorderLayout());
        westPanel = new JPanel();
        notePanel = new JPanel();
        boxLayoutPanel1 = new JPanel();
        graphPanel = new JPanel();
        
//      button
        newsFeedButton = new JButton("News Feed");
        contactButton = new JButton("Contact info");
        uploadButton = new JButton("Upload");
        downloadButton = new JButton("Download");
        requestButton = new JButton("Request Files");

//      text 
        textArea = new JTextArea();
        textArea.setText("fuck");
        textList = new ArrayList<>();   
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);
        
//        label
        label = new JLabel("My Project Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        
//      textList
        textList.add("a");
        textList.add("b");
        textList.add("c");
        textList.add("d");
        
//        JScroolPane
        JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel1 = new JScrollPane( textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel2 = new JScrollPane( taskTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       
//        actionListener
        newsFeedButton.addActionListener((e)-> {
        
            setVisible(false);
            NewsFeed ob = new NewsFeed();
            ob.setVisible(true);
        });

//        All Methods goes here
        //displayText();
        
//        actionListener
        contactButton.addActionListener((e)-> {
            new displayScreenNSubmit(textList);
//            displayDialog();
    
        });
        
        uploadButton.addActionListener((e)-> {
            new displayScreenNSubmit(this,"upload Button");
        });
        
        downloadButton.addActionListener((e)-> {
            new displayScreenNSubmit(this,"Download Button");    
        });
        
        requestButton.addActionListener((e)-> {
            new displayScreenNSubmit(this, "Request Button");    
        });
        
//       all the desgin goes here
        newsFeedButton.setMargin(new Insets(20,20,20,20));
        //      progressBar
        progressBar = new JProgressBar();
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        
//        westPanel
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
//        northPanel
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        boxLayout
        notePanel.add(new JLabel("My Note"));
        notePanel.add(scrollPane);        
        boxLayoutPanel1.add(uploadButton, BorderLayout.EAST);
        boxLayoutPanel1.add(downloadButton, BorderLayout.CENTER);
        boxLayoutPanel1.add(requestButton, BorderLayout.WEST);
        
       
        
        
//        **********************Adding component***************************8   

        //northPanel
        northPanel.add(label, BorderLayout.WEST);
        northPanel.add(boxLayoutPanel1, BorderLayout.CENTER);


          
        //        graphPanel
        graphPanel.add(progressBar);
        graphPanel.add(scrollPanel2, BorderLayout.WEST );
        
        //        westPanel
        westPanel.add(newsFeedButton);
        westPanel.add(contactButton);
        
        //        centerPanel

        centerPanel.add(scrollPanel1);
        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(boxLayoutPanel1, BorderLayout.SOUTH);

        //       JFrame
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(westPanel, BorderLayout.WEST);
       
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    //all textArea must use it
    void displayText(JTextArea textArea, ArrayList text){
        for(String s: textList){
            textArea.append(s + "\n");
        }
    }
    
    void displayDialog(){
        //Custom button text    
    Object[] objectArray = new Object[textList.size()];
    String[] ob = new String[textList.size()];
    
    for(int i =0; i< textList.size(); i++){
        ob[i] = textList.get(i);
    }
    
    for(int i =0; i< textList.size(); i++){
        objectArray[i] = textList.get(i);
    }

    JOptionPane.showInputDialog(
                    this,
                    ob,
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    objectArray,
                    "ham");
    }
    
    public static void main(String[] agrs){
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new myProjectPage();
            }
        });

    }
    private JPanel notePanel;
    private JPanel boxLayoutPanel1;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    private JPanel graphPanel;
    
    private JButton newsFeedButton;
    private JButton contactButton;
    private JButton uploadButton;
    private JButton downloadButton;
    private JButton requestButton;
   
    private JLabel label;
    
    private JTextArea textArea;
    private JTextArea contactInfoArea;
    private JTextArea taskTextArea;
      
    private ArrayList<String> textList;
    private JProgressBar progressBar;
    
}
