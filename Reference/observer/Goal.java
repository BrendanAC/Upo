/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author Anak
 */
public class Goal extends Observer{
    
    private ArrayList<String> totalTask = new ArrayList<>();
    private ArrayList<String> currentTask = new ArrayList<>();
    private int finishedTask;
    private JProgressBar progressBar;
//    private int i;
    Goal(Subject subject, JProgressBar progressBar){
        this.subject = subject;
        this.subject.attach(this);
        this.progressBar =progressBar;
    }

    @Override
    public void update() {
        
        if(totalTask.size()==0){
//            i +=1;
            System.out.println("if is true");
            finishedTask = 50;
        }else{
            System.out.println("if is false");
            finishedTask = (totalTask.size() - currentTask.size()) / totalTask.size() *100;
            System.out.println(finishedTask);
//            finishedTask = totalTask.size() + 15;
        }
        progressBar.setValue(finishedTask);
        progressBar.revalidate();
        progressBar.repaint();
        
    }    
    public int getFinishedTask(){
        return this.finishedTask;
    }

    public ArrayList<String> getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(ArrayList<String> totalTask) {
        this.totalTask = totalTask;
    }

    public ArrayList<String> getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(ArrayList<String> currentTask) {
        this.currentTask = currentTask;
    }
    
}
