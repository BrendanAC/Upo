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
import System.Room;
import System.User;
import java.awt.PopupMenu;
/**
 *
 * @author Anak
 */
public class DMProjectPage_1 extends JFrame{
    private User user;
    private Room room;
    
    private JPanel acceptRequestPanel;
    private JPanel boxPanel1;
    private JPanel subPanel1;
    private JPanel subPanel11;
    private JButton announcementButton;
    private JButton createMemberButton;
    private JButton setTaskButton;
    private JTextArea requestText;
    private JButton acceptRequestButton;
    private JButton  logOutButton ;
    
    public DMProjectPage_1(User user, Room room){
        this.user = user;
        this.room = room;
        initComponent();
    }
    
    void initComponent(){
        this.setName("DMProject Page");
        this.setSize(700,750);
        this.setLayout(new BorderLayout());
        
//      panel
        northPanel = new JPanel(new BorderLayout());
        centerPanel = new JPanel(new BorderLayout());
        westPanel = new JPanel();
        notePanel = new JPanel();
        boxLayoutPanel1 = new JPanel();
        graphPanel = new JPanel();
        PMPanel = new JPanel();
        acceptRequestPanel = new JPanel();
        boxPanel1 = new JPanel();
        subPanel1 = new JPanel();
        subPanel11 = new JPanel();

        
//      button
        newsFeedButton = new JButton("News Feed");
        contactButton = new JButton("Contact info");
        uploadButton = new JButton("Upload");
        downloadButton = new JButton("Download");
        requestButton = new JButton("Request Files");
        logOutButton = new JButton("Log Out");

        announcementButton = new JButton("Announcement Button");
        createMemberButton = new JButton("Create Member");
        setTaskButton = new JButton("Set Task");
        acceptRequestButton = new JButton("Accept Request");

//      text 
        textArea = new JTextArea();
        textArea.setText("fuck");
        textArea.setSize(10,20);
        textList = new ArrayList<>();   
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);
        requestText = new JTextArea(5,10);
        
//        label
        label = new JLabel("DMProject Page");
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
            NewsFeed ob = new NewsFeed(user);
            ob.setVisible(true);
        });
        

//        All Methods goes here
        //displayText();
        
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
        announcementButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.announcementDialog();
        });
        createMemberButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.createMemberDialog();
        });
        setTaskButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.setTaskDialog();
        });
        acceptRequestButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.setTaskDialog();
        });
        
        //acceptRequestPanel
        
        acceptRequestPanel.add(new JLabel("Request List"),BorderLayout.WEST);
        acceptRequestPanel.add(requestText,BorderLayout.CENTER);
        acceptRequestPanel.add(acceptRequestButton,BorderLayout.EAST);
        
        //subPanel
        subPanel1.add(acceptRequestPanel,BorderLayout.CENTER);
//        subPanel1.add(scrollPanel1,BorderLayout.SOUTH);
        
        
        
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
        
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        boxLayout
       
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
        westPanel.add(announcementButton);
        westPanel.add(createMemberButton);
        westPanel.add(setTaskButton);
        
        //        centerPanel

        centerPanel.add(subPanel1);
//        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
//        centerPanel.add(boxPanel1, BorderLayout.EAST);
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
    private JPanel PMPanel;
    
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
