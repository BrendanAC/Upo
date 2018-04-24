
package GUI;

import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Anak
 */
public class Context {
    private showDialog showdialog;
    private String s;
    public Context(){
        
    }
    public Context(showDialog showdialog, String s){
        this.showdialog = showdialog;
        this.s = s;
    }
    public ArrayList<String> doExecutionStrategy(){
        return showdialog.executeStrategy(s);
    }
    public void doExecutionStrategy1(){
        showdialog.executeStrategy(s);
    }
}
