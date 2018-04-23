/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Anak
 */
public class ObserverDemo {
            public static void main(String[] agr){
        JFrame frame = new JFrame();
        
        frame.setSize(600,200);
        JPanel panel = new JPanel();
        JProgressBar progressBar = new JProgressBar(); 
        JButton button = new JButton("addButton");
        JButton deleteButton = new JButton("DeleteButton");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Subject subject = new Subject();
        
        new PM(subject);
        new user(subject);
         progressBar = new JProgressBar(0,100);
        progressBar.setStringPainted(true);
        Goal goal = new Goal(subject, progressBar);
        
        
        button.addActionListener((e)-> {
            String answer = JOptionPane.showInputDialog("Annoucnement");
            goal.getTotalTask().add(answer);
            goal.getCurrentTask().add(answer);
            subject.setAnswer(answer); 
            answer = null;
            goal.getTotalTask().add(answer);
            goal.getCurrentTask().add(answer);
            
            int confirm = JOptionPane.showOptionDialog(null, "You want to start again?", "Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(confirm != 1){
                button.doClick();
            }else{}
        });
        deleteButton.addActionListener((e)-> {
            System.out.println("In delete");
            goal.getCurrentTask().remove(goal.getCurrentTask().size()-1);
            subject.updateProgressBar(); 
        });       
        
        
        panel.add(progressBar);
        panel.add(button);
        panel.add(deleteButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
