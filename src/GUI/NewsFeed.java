/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Room;
import System.User;
import System.Actions;
import System.ActionType;
import System.Upo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
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
public class NewsFeed extends JFrame{
    private BasePage newsFeed;
    private User user;
    private Upo upo;


    




    
    private JButton addButton;
    private JButton profileButton;
    private JButton projectButton;
    private JButton setDept;
    
    private JLabel label;
//    private  JTextField textField;
    private JTextArea textArea;
    private static JTextField textField;    
    private ArrayList<String> textList;
    private ArrayList<JButton> buttonsList;
//    public Model model;
    public NewsFeed (User user){
//      showScreen = new ShowScreen();
//      model = new Model();
        this.user = user;
        this.upo = Upo.getInstance();
        newsFeed = new BasePage();
        JLabel l =new JLabel("NewsFeed");
        newsFeed.setLabel(l);
        Model model= new Model();
        Controller cont= new Controller(model,this);
        
        
        textArea =new JTextArea();
        
        //arrayList
        buttonsList = new ArrayList<>();
        textList = new ArrayList<>();
        //Buttons

        profileButton = new JButton("My Profile");
        projectButton = new JButton("My Project");
        addButton = new JButton("Add a Project");
        setDept = new JButton("Set Department");
        
        
        //projectButton
        projectButton.setMargin(new Insets(20,20,20,20));
        profileButton.setMargin(new Insets(20,20,20,20)); 
        
         //addButton
        addButton.setMargin(new Insets(20,20,20,20));
        
        //buttonList
        buttonsList.add(profileButton);
        buttonsList.add(projectButton);
        buttonsList.add(addButton);
        buttonsList.add(setDept);        
       
        profileButton.addActionListener((e)-> {
        
            newsFeed.setVisible(false);
            MyPage ob = new MyPage(user);
            
        });
        projectButton.addActionListener((e)-> {
        
            newsFeed.setVisible(false);
//            PMProjectPage ob = new PMProjectPage();
//            DMProjectPage ob = new DMProjectPage();
            MyProjectPage ob = new MyProjectPage();
           //MyPage ob = new MyPage();
           
        });
        setDept.addActionListener( (e)-> {
//          Controller cont = new Controller(model,newsFeed);
         
//          cont.setNameNDetail();//DONE
//          cont.setNameNCombo();//DONE
//          cont.setNameOnly();//DONE
//          cont.setNameNComboNDetail();//DONE
          
          
            
        
        
         });
        
         addButton.addActionListener( (e)-> {

            JButton newButton = new JButton("newProject");
            buttonsList.add(buttonsList.size()-2,newButton);
        
         });
         
         
         //AddComponents
        for( JButton b: buttonsList){
            newsFeed.addToWestPanelFrame(b);
        }
        this.loadNewsFeed();
    }
//    void viewTextOnly(Controller.setTextOnlyInformation setInformation){
//         setDept.addActionListener(setInformation);
//    }
    void veiwNameNComboNDetail(Controller.setNameNComboNDetailInformation setInformation) {
        setDept.addActionListener(setInformation);
    }
//    void viewNameDetail(ActionListener actionListener){
//        setDept.addActionListener(actionListener);
//    }
    void viewNameOnly(Controller.setNameOnlyInformation setInformation){
        setDept.addActionListener(setInformation);
    }
    void viewNameNCombo(Controller.setNameNComboInformation setInformation) {
        setDept.addActionListener(setInformation);
    } 
    void viewNameNDetail(Controller.setNameNDetailInformation setInformation) {
        setDept.addActionListener(setInformation);
    }    
    
    void displayText(){
        for(String s: textList){
            textArea.append(s + "\n");
        }
        newsFeed.addToCenterPanelFrame(textArea);
    }
    
    public static void main(String[] agrs){
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                
             new NewsFeed(Upo.getInstance().getUserByUsername("Gerry"));
            }
        });

    }
    private void loadNewsFeed() {
        user.getRooms().forEach((r) -> {
            r.getRoomHistory().forEach((a) -> {
                textList.add(a.toString());
            });
        });
        displayText();
        
    }


//    private void loadNewsFeed() {
//        for(Room r : user.getRooms()){
//            for(ActionType a : r.getRoomHistory()){
//                textList.add(a.toString());
//            }
//        }
//        displayText();
//        
//    }

    void setUser(String username) {
        user = upo.getUserByUsername(username);
    }

    


    
}
