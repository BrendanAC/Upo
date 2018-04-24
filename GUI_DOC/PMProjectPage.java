/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_DOC;

import System.Room;
import System.User;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Anak
 */
public class PMProjectPage extends ProjectPageDecorator {
   
    private ProjectPageDecorator view;
    private Model model;
    private Controller controller;
    
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
    /**
     * setup all components for PMProjectPage
     * 
     * @parm decoratedPage this is the commmon page 
     */
    PMProjectPage(ProjectPage decoratedPage){
         view =new View();
         model =new model();
         Controller controller = new Controller(model,view);
    }
    /**
     * initialized components in that is specific to PMProjectPage 
     */
    private void initCoponent(){
        
    }
    /**
     * display text on to TextArea
     */
    private  void displayText(JTextArea textArea, ArrayList text){
        
    }
    /**
     * This will create an annoucement and send an actionType to all users affected.
     */
    private void doAnnoucment(){
        
    }
    /**
     * This will create 
     */
    private void createMember(){
        
    }
    /**
     * This will create a task for a user.
     */
    private void setTask(){
        
    }
    /**
     * This will set a position of a user to a position below current user.
     */
    private void setPosition(){
        
    }
    /**
     * This will set the department of a user to a depart the current user has control over.
     */
    private void setDepartment(){
        
    }
    public static void main(String[] agrs){
        
    }
}
