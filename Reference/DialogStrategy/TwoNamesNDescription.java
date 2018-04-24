/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DialogStrategy;

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
public class TwoNamesNDescription extends JOptionPane implements showDialog{

    @Override
    public void executeStrategy(String s) {
        
        ArrayList<String> departmentList = new ArrayList<>();
        String[] departmentArray;
        JTextField userName = new JTextField();
        JComboBox departmentName;
        JScrollPane scrollPanel1 = new JScrollPane(new JTextArea(10,20),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
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
                new JLabel("Description"),
                scrollPanel1
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, s, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("You entered " +
                    userName.getText() + ", " +
                    departmentName.getSelectedItem() + ", ");
        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
    }
    
}
