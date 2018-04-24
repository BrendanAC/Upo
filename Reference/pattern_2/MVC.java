/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anak
 */
public class MVC {
    public static void main(String[] agrs){
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model,view);
        
//        Controller.addButtonListener ob = controller.new addButtonListener();
//        view.addButtonsActionListener(ob);         
        controller.callAddButton();
        view.setVisible(true);
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(600,200);
//        JPanel panel = new JPanel();
//        
//        JButton button = new JButton("addButton");
//        
//        button.addActionListener((e)-> {
//            panel.add(new JButton("hello"));
//            panel.revalidate();
//            panel.repaint();
//                });
//        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        panel.add(button);
//        frame.add(panel);
        
    }
}
