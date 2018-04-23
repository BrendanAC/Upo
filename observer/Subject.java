/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Anak
 */
public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String answer;
    
    public String getAnswer(){
        return this.answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
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
