/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_DOC;

import javax.swing.JOptionPane;

/**
 *
 * @author Anak
 */
public class NameOnly extends JOptionPane implements DialogStrategy.showDialog {
    /**
     * create showInputDialog with 1 input box
     * @param s Dialog's name
     */
    @Override
    public void executeStrategy(String s) {
        JOptionPane.showInputDialog(s);
    }
    
}
