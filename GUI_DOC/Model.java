/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_DOC;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import observer.Observer;

/**
 *
 * @author Anak
 */
public class Model extends Observer {
    //ButtonList has list of Project Buttons 
    private ArrayList<JButton> buttonsList = new ArrayList<>();
    private JPanel panel;
    /**
     * 
     * @param panel of class that call addNewButton Method
     * @param frame of class that call addNewButton method
     */
    public void addNewButton(JPanel panel1, JFrame frame){

    }
        private ArrayList<Observer> observers = new ArrayList<>();
    private String answer;
    
    public void setAnswer(){
        notifyAllObservers();
    }
    public void updateProgressBar(){
        notifyAllObservers();
    }
    void attach(Observer observer){
        this.observers.add(observer);
    }
    void notifyAllObservers(){
        for(Observer ob: observers){
            ob.update();
        }
    }
}
