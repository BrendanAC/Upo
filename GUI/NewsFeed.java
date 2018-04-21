/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Room;
import System.User;
<<<<<<< HEAD
=======
import System.Actions;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import System.ActionType;
import System.Upo;
import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Anak
 */
public class NewsFeed extends JFrame{

    private User user;
    private Upo upo;
    public NewsFeed (User user){

        initComponent();
        this.user = user;
        this.upo = Upo.getInstance();
        loadNewsFeed();
    }

    void initComponent(){
        this.setName("DMProject Page");

        this.setSize(700,750);
        
        this.setLayout(new BorderLayout());
        
<<<<<<< HEAD
        
         
        
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        //button
        profileButton = new JButton("My Profile");
        projectButton = new JButton("My Project");
        addButton = new JButton("Add a Project");
<<<<<<< HEAD
        logOutButton = new JButton("Log Out");
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        
        //textarea
        textArea = new JTextArea();
        
        textArea.setText("");
        
       //arrayList
        buttonsList = new ArrayList<>();
        textList = new ArrayList<>();
        
        //buttonList
        buttonsList.add(profileButton);
        buttonsList.add(projectButton);
        buttonsList.add(addButton);
        
<<<<<<< HEAD
        
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        //label
        label = new JLabel("NewsFeed Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        
       
//        //testList
//        textList.add("a");
//        textList.add("b");
//        textList.add("c");
//        textList.add("d");
       
        //actionListener
        profileButton.addActionListener((e)-> {
        
            setVisible(false);
            myPage ob = new myPage(user);
            ob.setVisible(true);
        });
        projectButton.addActionListener((e)-> {
        
            setVisible(false);
            myProjectPage ob = new myProjectPage(user,user.getRooms().get(0));
            ob.setVisible(true);
        });
        
         addButton.addActionListener( (e)-> {
            //System.out.println("FUCK YOU");
            JButton newButton = new JButton("newProject");
            buttonsList.add(buttonsList.size()-2,newButton);
            for(JButton b: buttonsList){
                westPanel.add(b);
            }
        });
<<<<<<< HEAD
         logOutButton.addActionListener((e)-> {
              
            
           setVisible(false);
           login ob = new login();
           ob.setVisible(true);
            
        });
         
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        displayText();
        
        
        //northPanel
        northPanel = new JPanel(new BorderLayout());
<<<<<<< HEAD
        northPanel.add(logOutButton, BorderLayout.EAST);
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //centerPanel
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //westPanel
        westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //projectButton
        projectButton.setMargin(new Insets(20,20,20,20));
        profileButton.setMargin(new Insets(20,20,20,20)); 
        
        //addButton
        addButton.setMargin(new Insets(20,20,20,20));
        
        //add component
        northPanel.add(label);
        westPanel.add(profileButton);
        westPanel.add(projectButton);
        westPanel.add(addButton);
        centerPanel.add(textArea);
        
       
          
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(westPanel, BorderLayout.WEST);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    
    void displayText(){
        for(String s: textList){
            textArea.append(s + "\n");
        }
    }
    
    public static void main(String[] agrs){
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                
             //new NewsFeed(temp);
            }
        });

    }
    private JPanel boxLayoutPanel;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    
    private JButton addButton;
    private JButton profileButton;
    private JButton projectButton;
<<<<<<< HEAD
    private JButton logOutButton;
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
    
    private JLabel label;
//    private  JTextField textField;
    private JTextArea textArea;
    private static JTextField textField;    
    private ArrayList<String> textList;
    private ArrayList<JButton> buttonsList;
<<<<<<< HEAD
   
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

    private void loadNewsFeed() {
        for(Room r : user.getRooms()){
            for(ActionType a : r.getRoomHistory()){
                textList.add(a.toString());
            }
        }
        displayText();
        
    }

    void setUser(String username) {
        user = upo.getUserByUsername(username);
    }
    
}
