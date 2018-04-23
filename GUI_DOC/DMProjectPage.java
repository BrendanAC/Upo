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
public class DMProjectPage {
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
     * @param user of this user name.
     * @param room of this user name according to user's role.
     */
    DMProjectPage(User user, Room room){
        
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
    public static void main(String[] agrs){
        
    }
}
