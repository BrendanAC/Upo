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
public class test {
    public static void main(String[] args){
//        Context context = new Context(new NameOnly(), "Name"); 
        Context context1 = new Context(new NameNDescription(), "Name"); 
        Context context2 = new Context(new NameOnly(), "Name"); 
               
//        context.doExecutionStrategy();
//        context1.doExecutionStrategy();
        context2.doExecutionStrategy();
    }
}
