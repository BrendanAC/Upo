/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anak
 */
public class NameOnly extends JOptionPane implements showDialog {

    NameOnly() {
    }

    @Override
    public ArrayList<String> executeStrategy(String s) {
        JOptionPane.showInputDialog(s);
        return null;
    }

    @Override
    public void executeStrategy1(String s, ArrayList<String> text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
