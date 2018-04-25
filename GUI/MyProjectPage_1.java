/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


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
import System.Room;
import System.User;
/**
 *
 * @author Anak
 */


public class MyProjectPage_1 extends JFrame{


    public final User user;
    public final Room room;
    public final Upo upo;
    
    
    public MyProjectPage_1(User user, Room room){
        this.setJFrameName("myProject Page");
        this.setJFrameSize(700,750);
        
        this.user = user;
        this.room = room;
        this.upo= Upo.getInstance();
        initComponent();
        
    }

    
    void initComponent(){
        this.setName("PMProject Page");
        this.setSize(700,750);


        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


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

        suggestionButton = new JButton("Suggestion");

        logOutButton = new JButton("Log Out");


//      text
        textArea = new JTextArea();

        textList = new ArrayList<>();
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);

//        label
        label = new JLabel("My Project Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));


//        JScroolPane  JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel1 = new JScrollPane( textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel2 = new JScrollPane( taskTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

//        actionListener
        newsFeedButton.addActionListener((e)-> {

            setVisible(false);
            NewsFeed ob = new NewsFeed(user);
            ob.setVisible(true);
        });

//        All Methods goes here
        //displayText();
        
//        actionListener
//        displayText(textArea,textList);

//        actionListener


        contactButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.contactDialog();
        });
        logOutButton.addActionListener((e)-> {
           this.setVisible(false);
           login ob = new login();
           ob.setVisible(true);

        });
        uploadButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.uploadDialog();
        });

        downloadButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.downloadDialog();
        });

        requestButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.requestDialog();
        });



        suggestionButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.suggestDialog();
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


        boxLayoutPanel1.add(downloadButton, BorderLayout.WEST);
        boxLayoutPanel1.add(requestButton, BorderLayout.NORTH);
        boxLayoutPanel1.add(suggestionButton, BorderLayout.SOUTH);



        //northPanel
//        northPanel.add(notePanel,BorderLayout.EAST);
        northPanel.add(label, BorderLayout.WEST);

        northPanel.add(notePanel, BorderLayout.CENTER);

        northPanel.add(logOutButton,BorderLayout.EAST);

        northPanel.add(boxLayoutPanel1, BorderLayout.CENTER);




        //        graphPanel
        graphPanel.add(progressBar);
        graphPanel.add(scrollPanel2, BorderLayout.WEST );

        //        westPanel
        westPanel.add(newsFeedButton);
        westPanel.add(contactButton);

        //        centerPanel

        centerPanel.add(scrollPanel1);
//        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(boxLayoutPanel1, BorderLayout.SOUTH);


        //       JFrame
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(westPanel, BorderLayout.WEST);

       
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    

    




    
    //setName of JFrame
    void setJFrameName(String s){
        this.setName(s);
        //        label
        label = new JLabel(s);
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        System.out.println(s);
    }

    void setJFrameSize(int x, int y){
        this.setSize(x,y);
        System.out.println(x);
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
//                new myProjectPage();
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
   

    private JButton suggestionButton;
    private JButton logOutButton;


    private JLabel label;

    private JTextArea textArea;
    private JTextArea contactInfoArea;
    private JTextArea taskTextArea;

    private ArrayList<String> textList;
    private JProgressBar progressBar;
    
}
