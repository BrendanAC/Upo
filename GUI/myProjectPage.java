/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Room;
import System.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Anak
 */
public class myProjectPage extends JFrame{

    private final User user;
    private final Room room;
    public myProjectPage(User user, Room room){
        this.user = user;
        this.room = room;
        initComponent();
        loadProjectPage();
    }

    
    void initComponent(){
        this.setName("NewsFeed Page");
        this.setSize(700,750);
        this.setLayout(new BorderLayout());
        
         final JFileChooser fc = new JFileChooser();
        
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
        logOutButton = new JButton("Log Out");

//      text 
        textArea = new JTextArea();
        textList = new ArrayList<>();   
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);
        
//        label
        label = new JLabel("My Project Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));

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
        displayText(textArea,textList);
        
//        actionListener
        contactButton.addActionListener((e)-> {
            new displayScreenNSubmit(textList);
//            displayDialog();
    
        });
        logOutButton.addActionListener((e)-> {
           setVisible(false);
           login ob = new login();
           ob.setVisible(true);
            
        });
        
        uploadButton.addActionListener((e)-> {
                if (fc.showOpenDialog(logOutButton) == JFileChooser.APPROVE_OPTION) {
                    try{
                    File file = fc.getSelectedFile();
                    File outFile = new File("C://Users//anom3//Desktop//txt"+"1"+".txt"); 
                    InputStream is = new FileInputStream(file);
                    OutputStream os = new FileOutputStream(outFile);
                    byte[] buffer = new byte[1024];
                        int length;
                        while ((length = is.read(buffer)) > 0) {
                            os.write(buffer, 0, length);
                        }
                    JOptionPane.showMessageDialog(null, fc.getSelectedFile().getAbsolutePath());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(myProjectPage.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(myProjectPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
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
//                new myProjectPage(user);
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
    private JButton logOutButton;
   
    private JLabel label;
    
    private JTextArea textArea;
    private JTextArea contactInfoArea;
    private JTextArea taskTextArea;
      
    private ArrayList<String> textList;
    private JProgressBar progressBar;
      private  void loadProjectPage(){
          room.getRoomHistory().forEach((a) -> {
              textList.add(a.toString());
        });
        displayText(textArea,textList);
    }
}
