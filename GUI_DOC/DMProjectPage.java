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
public class DMProjectPage extends ProjectDecorator{
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
    /**
     * setup all components for DMProjectPage
     * 
     * @param decoratedPage this is going to be the common page.
     */
    DMProjectPage(ProjectPage decoratedPage){
        
    }
    /**
     * initialized components in that is specific to DMProjectPage 
     */
    void initCoponent(){
        
    }
    /**
     * display text on to TextArea
     */
    void displayText(JTextArea textArea, ArrayList text){
        
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
     * This will send a suggestion to the current user superior.
     */
    private void sendSuggest(){
        
    }
    public static void main(String[] agrs){
        
    }
}
