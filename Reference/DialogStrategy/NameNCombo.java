/*
 * Brendan Currie
 * Fau
 * 
 */
package Reference.DialogStrategy;

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
public class NameNCombo extends JOptionPane implements DialogStrategy.showDialog{

    @Override
    public void executeStrategy(String s) {
        
        ArrayList<String> departmentList = new ArrayList<>();
        String[] departmentArray;
        JTextField userName = new JTextField();
        JComboBox departmentName;
        
        for(int i =0; i < 10; i ++){
                departmentList.add(Integer.toString(i));
        }
        departmentArray = new String[departmentList.size()];
        for(int i = 0; i< departmentList.size(); i++){
            departmentArray[i] = departmentList.get(i);
        }
        departmentName = new JComboBox(departmentArray);
        final JComponent[] inputs = new JComponent[] {
                new JLabel("UserName "),
                userName,
                new JLabel("Department"),
                departmentName,  
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {

        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
    }

    @Override
    public void executeStrategy1(String s, ArrayList<String> text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}