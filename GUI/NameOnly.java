/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anak
 */
public class NameOnly extends JOptionPane implements showDialog {

    NameOnly() {
    }

    @Override
    public ArrayList<String> executeStrategy(String s) {
//        JOptionPane.showInputDialog(s);
        ArrayList<String> selection=new ArrayList<>();
        JTextField userName = new JTextField();
       
        final JComponent[] inputs = new JComponent[] {
                new JLabel("UserName "),
                userName,
        };
        
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
                selection.add(userName.getText());
                return selection;
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
            return null;
        }
    }
        
//        return null;

    @Override
    public void executeStrategy1(String s, ArrayList<String> text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
