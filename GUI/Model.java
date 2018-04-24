/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Room;
import System.Upo;
import System.User;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Anak
 */
public class Model {
       private ArrayList<JButton> buttonList = new ArrayList<>();
       private JPanel panel;
       

    void setInfo(ArrayList<String> texts) {
//        showDialog temp = new NameNDescription();
//        Context context;
//        context= new Context(temp,"HELLO");
//        context.doExecutionStrategy();
        for(String s: texts){
           System.out.println(s + "\n");
        }
//        System.out.println("This is working");
    }
}
