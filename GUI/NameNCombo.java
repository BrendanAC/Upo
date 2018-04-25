
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
public class NameNCombo extends JOptionPane implements showDialog{

    private final Upo system;
    public NameNCombo(){
        system = Upo.getInstance();
    }
    @Override
    public ArrayList<String> executeStrategy(String s) {
        
        ArrayList<String> departmentList = system.getDeptList();
        ArrayList<String> selection= new ArrayList<>();
        JTextField userName = new JTextField();
        JComboBox departmentName;
        
      
        
        
        departmentName = new JComboBox(departmentList.toArray());
        final JComponent[] inputs = new JComponent[] {
                new JLabel("UserName "),
                userName,
                new JLabel("Department"),
                departmentName,  
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
               selection.add(userName.getText());
               selection.add((String)departmentName.getSelectedItem());
               return selection;
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
                return null;
        }
    }

    @Override
    public ArrayList<String> executeStrategy1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}