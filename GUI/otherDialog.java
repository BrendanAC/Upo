/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anak
 */
public class otherDialog {
    
    void displayDialog(Container c, ArrayList<String> li){
        //Custom button text    
    Object[] objectArray = new Object[li.size()];
    String[] ob = new String[li.size()];
    
    for(int i =0; i< li.size(); i++){
        ob[i] = li.get(i);
    }
    
    for(int i =0; i< li.size(); i++){
        objectArray[i] = li.get(i);
    }

    JOptionPane.showInputDialog(
                    c,
                    ob,
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    objectArray,
                    "ham");
    }
}
