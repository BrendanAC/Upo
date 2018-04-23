/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import pattern.*;
import GUI.Model;
import System.ActionType;
import System.Room;
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


/**
 *
 * @author Anak
 */
public class myProjectPage extends ShowScreen{


    
    private User user;
    private Room room;
    private Model model;

    public myProjectPage(User user, Room room){
        model = new Model();
        model.setUser(user);
        model.setRoom(user.getRooms().get(0));
        System.out.println("in myProjectPage");        
        model.setUser(user);
        model.setRoom(room);
//        initComponent();
        
    }
    
    void initComponent(){
        System.out.println("in myProjectPage.initComponent");
    }
    
    public void setUp(){
        System.out.println("in setUp");
        model.setFrame(new JFrame());
        model.getFrame().setVisible(true);
        model.getFrame().setSize(700,750);
    }

    public static void main(String[] agrs){

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
//                new myProjectPage(user);
            }
        });

    }
}
