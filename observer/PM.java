/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Anak
 */
public class PM extends Observer{
    PM(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(this.subject.getAnswer() == null){System.out.println("Answer is null");}
        else{System.out.println("PM" + this.subject.getAnswer());}
    }
}
