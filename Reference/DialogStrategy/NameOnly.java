/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DialogStrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Anak
 */
public class NameOnly extends JOptionPane implements showDialog {

    @Override
    public void executeStrategy(String s) {
        JOptionPane.showInputDialog(s);
    }
    
}
