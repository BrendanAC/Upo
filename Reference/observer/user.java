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

/**
 *
 * @author Anak
 */
public class user extends Observer{
    
    user(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
          if(this.subject.getAnswer() == null){System.out.println("Answer is null");}
          else{System.out.println("user: "  + this.subject.getAnswer());}
    }
//    public String answer;
    

}
