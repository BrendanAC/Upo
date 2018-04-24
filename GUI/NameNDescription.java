package GUI;


import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Anak
 */
public class NameNDescription extends JOptionPane implements showDialog  {

    private Controller controller;
//    public ArrayList<String> passInformation(){
//        ArrayList<String> texts = new ArrayList<>();
//        texts.add("shit"); 
//        texts.add("damn"); 
//        return texts;
//    }
    public ArrayList<String> executeStrategy(String s) {
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
            System.out.println("You entered " +
                    userName.getText() + ", " +
                    departmentName.getSelectedItem() + ", ");
            ArrayList<String> temp = new ArrayList<>();
            temp.add(userName.getText());
            temp.add((String) departmentName.getSelectedItem());
            return temp;
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
