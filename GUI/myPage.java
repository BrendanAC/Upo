/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.ActionType;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Anak
 */
public class myPage extends JFrame{

    private final User user;
    private final Upo u;
    public myPage (User user){
        this.user = user;
        this.u= Upo.getInstance();
        initComponent();
        loadMyPage();
    }
    void initComponent(){
        
        
        this.setName("NewsFeed Page");
        this.setSize(700,750);
        this.setLayout(new BorderLayout());
        
        //button
        newsFeedButton = new JButton("News Feed");
        logOutButton = new JButton("Logout");
        //textArea
        textArea = new JTextArea();
        
        //label
        label = new JLabel("MyPage");
        label.setFont(new Font("Serif", Font.PLAIN, 50));
        
        //arrayList
        textList = new ArrayList<>();
        
       
        //actionListener
        newsFeedButton.addActionListener((e)-> {
        
            setVisible(false);
            NewsFeed ob = new NewsFeed(user);
            ob.setVisible(true);
        });
 
         logOutButton.addActionListener((e)-> {
           setVisible(false);
           login ob = new login();
           ob.setVisible(true);
            
        });
        
        displayText();
        
        //northPanel
        northPanel = new JPanel(new BorderLayout());
        northPanel.add(logOutButton,BorderLayout.EAST);
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //centerPanel
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //westPanel
        westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //all designs
        newsFeedButton.setMargin(new Insets(20,20,20,20));
        
        //add components
        northPanel.add(label);
        westPanel.add(newsFeedButton);
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
                //myPage myPage = new myPage(u.getUserByUsername("Gerry"));
            }
        });

    }
    private JButton logOutButton;
    private JPanel boxLayoutPanel;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    
    private JButton newsFeedButton;
    
    private JLabel label;
//    private  JTextField textField;
    private JTextArea textArea;
    private static JTextField textField;    
    private ArrayList<String> textList;
     private  void loadMyPage(){
        for(ActionType a : user.getHistory()){
            textList.add(a.toString());
        }
        displayText();
    }
}
  
