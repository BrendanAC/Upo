/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import System.Upo;
import System.User;
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
 * @author Brendan C.
 */
public class TextOnly extends JOptionPane implements showDialog{
    ArrayList<String> text;
 
    @Override
    public ArrayList<String> executeStrategy1() {
        Upo system = Upo.getInstance();
       
        this.text= text;
        JTextArea textArea = new JTextArea();
        for(User u : system.getUserList()){
            textArea.append(u.toString());
        }
        JScrollPane scrollPanel1 = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        final JComponent[] inputs = new JComponent[] {
      
                scrollPanel1
        };
        int result = JOptionPane.showConfirmDialog(null, inputs," ", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            text.add(textArea.getText());
            return text;
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
        
        return null;
    }

    @Override
    public ArrayList<String> executeStrategy(String s) {
        return null;
    }


    
}