/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

<<<<<<< HEAD
=======
import System.ActionType;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import System.Room;
import System.User;
import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
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
=======
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
<<<<<<< HEAD
=======
import javax.swing.JTextField;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import javax.swing.SwingUtilities;

/**
 *
 * @author Anak
 */
public class myProjectPage extends JFrame{
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public myProjectPage(){
        this.setJFrameName("myProject Page");
        this.setJFrameSize(700,750);
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

    private final User user;
    private final Room room;
    public myProjectPage(User user, Room room){
        this.user = user;
        this.room = room;
<<<<<<< HEAD
        initComponent();
        loadProjectPage();
    }

    
    void initComponent(){
        this.setName("NewsFeed Page");
        this.setSize(700,750);
        this.setLayout(new BorderLayout());
        
         final JFileChooser fc = new JFileChooser();
=======
>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
        initComponent();
        loadProjectPage();
    }
<<<<<<< HEAD
=======

>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
    
    void initComponent(){
        
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        
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
<<<<<<< HEAD
        logOutButton = new JButton("Log Out");
=======
<<<<<<< HEAD
        suggestionButton = new JButton("Suggestion");
=======
        logOutButton = new JButton("Log Out");
>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

//      text 
        textArea = new JTextArea();
        textList = new ArrayList<>();   
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);
        
<<<<<<< HEAD
=======
<<<<<<< HEAD
//      textList
        textList.add("a");
        textList.add("b");
        textList.add("c");
        textList.add("d");
        
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
//        label
        label = new JLabel("My Project Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));

<<<<<<< HEAD
=======
>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
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
<<<<<<< HEAD
        contactButton.addActionListener((e)-> {
            new displayScreenNSubmit(textList);
//            displayDialog();
    
=======
        
       
        contactButton.addActionListener((e)-> { 
            showDialog showdialog = new showDialog();
            showdialog.contactDialog();
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        });
        logOutButton.addActionListener((e)-> {
           setVisible(false);
           login ob = new login();
           ob.setVisible(true);
            
        });
<<<<<<< HEAD
        
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
=======
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
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        });
        
//       all the desgin goes here
        newsFeedButton.setMargin(new Insets(20,20,20,20));
        //      progressBar
        progressBar = new JProgressBar();
        progressBar = new JProgressBar();
        progressBar.setValue(0);
<<<<<<< HEAD
        progressBar.setStringPainted(true);
=======
        progressBar.setStringPainted(true); 
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        
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
<<<<<<< HEAD
        boxLayoutPanel1.add(downloadButton, BorderLayout.CENTER);
        boxLayoutPanel1.add(requestButton, BorderLayout.WEST);
=======
        boxLayoutPanel1.add(downloadButton, BorderLayout.WEST);
        boxLayoutPanel1.add(requestButton, BorderLayout.NORTH);
        boxLayoutPanel1.add(suggestionButton, BorderLayout.SOUTH);
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        
       
        
        
//        **********************Adding component***************************8   

        //northPanel
        northPanel.add(label, BorderLayout.WEST);
<<<<<<< HEAD
        northPanel.add(logOutButton,BorderLayout.EAST);
        northPanel.add(boxLayoutPanel1, BorderLayout.CENTER);
=======
<<<<<<< HEAD
        northPanel.add(notePanel, BorderLayout.CENTER);
=======
        northPanel.add(logOutButton,BorderLayout.EAST);
        northPanel.add(boxLayoutPanel1, BorderLayout.CENTER);
>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631


          
        //        graphPanel
        graphPanel.add(progressBar);
        graphPanel.add(scrollPanel2, BorderLayout.WEST );
        
        //        westPanel
        westPanel.add(newsFeedButton);
        westPanel.add(contactButton);
        
        //        centerPanel

        centerPanel.add(scrollPanel1);
<<<<<<< HEAD
        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(boxLayoutPanel1, BorderLayout.SOUTH);
=======
//        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(boxLayoutPanel1, BorderLayout.SOUTH);
        
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

        //       JFrame
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(westPanel, BorderLayout.WEST);
<<<<<<< HEAD
       
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
=======
        
        
        
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
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
    
    //all textArea must use it
    void displayText(JTextArea textArea, ArrayList text){
        for(String s: textList){
            textArea.append(s + "\n");
        }
    }
    
<<<<<<< HEAD
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
=======

>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
    
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
<<<<<<< HEAD
    private JButton logOutButton;
=======
<<<<<<< HEAD
    private JButton suggestionButton;
=======
    private JButton logOutButton;
>>>>>>> 20183ceefd8c74b0069b6b6e801be020fd0c036e
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
   
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
