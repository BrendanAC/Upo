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
 * This class Will be used to create a page that shows all of the information about a specific user. 
 * @author Anak
 */
public class MyPage extends JFrame{

    private final User user;
    private final Upo u;
    private final BasePage myPage;
    private final ArrayList<JButton> buttonsList;
    private final JButton profileButton;
    private final JButton projectButton;
    private final JButton addButton;
    public MyPage (User user){
        this.user = user;
        this.u= Upo.getInstance();
        myPage = new BasePage();
        JLabel l =new JLabel("MyPage");
        myPage.setLabel(l);
        
        textArea =new JTextArea();
        
        //arrayList
        buttonsList = new ArrayList<>();
        textList = new ArrayList<>();
        //Buttons

        profileButton = new JButton("NewsFeed");
        projectButton = new JButton("My Project");
        addButton = new JButton("Add a Project");
        
        
        //projectButton
        projectButton.setMargin(new Insets(20,20,20,20));
        profileButton.setMargin(new Insets(20,20,20,20)); 
        
         //addButton
        addButton.setMargin(new Insets(20,20,20,20));
        
        //buttonList
        buttonsList.add(profileButton);
        buttonsList.add(projectButton);
        buttonsList.add(addButton);
        
       
        profileButton.addActionListener((e)-> {
        
            myPage.setVisible(false);
            NewsFeed ob = new NewsFeed(user);
           
        });
        projectButton.addActionListener((e)-> {
        
            myPage.setVisible(false);
            //MyProjectPage ob = new MyProjectPage(user,user.getRooms().get(0));
            
        });
        
         addButton.addActionListener( (e)-> {

            JButton newButton = new JButton("newProject");
            buttonsList.add(buttonsList.size()-2,newButton);
        
         });
         //AddComponents
        for( JButton b: buttonsList){
            myPage.addToWestPanelFrame(b);
        }
        this.loadMyPage();
    }
    /**
     * This will load all of the required object that are required for the myPage class.
     */
   
    
    /**
     * This is a helper class that must be used by the textArea object.
     */
    void displayText(){
        for(String s: textList){
            textArea.append(s + "\n");
        }
        myPage.addToCenterPanelFrame(textArea);
    }
    
    public static void main(String[] agrs){
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                MyPage myPage = new MyPage(Upo.getInstance().getUserByUsername("Gerry"));
            }
        });

    }
    private JButton logOutButton;

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
  
