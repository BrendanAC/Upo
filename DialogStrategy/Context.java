/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DialogStrategy;

/**
 *
 * @author Anak
 */
public class Context {
    private showDialog showdialog;
    private String s;
    public Context(showDialog showdialog, String s){
        this.showdialog = showdialog;
        this.s = s;
    }
    public void doExecutionStrategy(){
        showdialog.executeStrategy(s);
    }
}
