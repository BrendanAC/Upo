package GUI;


import System.Upo;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anak
 */
public class NameNDetail extends JOptionPane implements showDialog  {
    
    private Controller controller;
    private final Upo system;
    public NameNDetail(){
        this.system=Upo.getInstance();
    }
//    public ArrayList<String> passInformation(){
//        ArrayList<String> texts = new ArrayList<>();
//        texts.add("shit"); 
//        texts.add("damn"); 
//        return texts;
//    }
    public ArrayList<String> executeStrategy(String s) {
        ArrayList<String> departmentList = system.getDeptList();
        ArrayList<String> selection = new ArrayList<>();
        JTextField userName = new JTextField();
    
        
        JTextArea ret = new JTextArea(10,20);
         JScrollPane scrollPane = new JScrollPane(ret, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        final JComponent[] inputs = new JComponent[] {
                new JLabel("UserName "),
                userName,
                new JLabel("Department"),
                scrollPane,                
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("You entered " +
                    userName.getText() + ", " +
                    ret.getText() + ", ");
            
            selection.add(userName.getText());
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
