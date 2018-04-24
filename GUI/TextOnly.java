/*
 * Brendan Currie
 * Fau
 * 
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
 * @author Brendan C.
 */
public class TextOnly extends JOptionPane implements DialogStrategy.showDialog{
    ArrayList<String> text 
    @Override
    public void executeStrategy1(String s, ArrayList<String> text) {
        
        this.text= text;
        JTextArea textArea = new JTextArea();
        for(String i: text){
            textArea.append(i + "/n");
        }
        JScrollPane scrollPanel1 = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        final JComponent[] inputs = new JComponent[] {
      
                scrollPanel1
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {

        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
    }

    @Override
    public void executeStrategy(String s) {
    }


    
}