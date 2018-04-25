package GUI;



import GUI.showDialog;
import System.Upo;
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
public class NameNComboNDetail  extends JOptionPane implements showDialog{

    private final Upo system;

    public NameNComboNDetail(){
        this.system= Upo.getInstance();
    }
    @Override
    public ArrayList<String> executeStrategy(String s) {
        
        ArrayList<String> departmentList = system.getDeptList();
        ArrayList<String> selection = new ArrayList<>();
        String[] departmentArray;
        JTextField userName = new JTextField();
        JComboBox departmentName;
        JTextField ret = new JTextfield(10,20);
        JScrollPane scrollPanel1 = new JScrollPane(ret,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        

       
        departmentName = new JComboBox(departmentList.toArray());
        final JComponent[] inputs = new JComponent[] {
                new JLabel("UserName "),
                userName,
                new JLabel("Department"),
                departmentName,  
                new JLabel("Description"),
                scrollPanel1
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            selection.add(userName.getText());
            selection.add((String)departmentName.getSelectedItem());
            selection.add(ret.getText());
                return selection;
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
            return null;
        }
    }

    @Override
    public void executeStrategy1(String s, ArrayList<String> text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}