/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import System.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Brendan C.
 */
public class Controller {
    Model model;
    NewsFeed page;
    DMProjectPage page1;
    PMProjectPage page2;
    MyProjectPage page3;

    Controller(Model model,NewsFeed page){
       this.model=model;
       this.page=page;
    }
    Controller(Model model,PMProjectPage page){
       this.model=model;
       this.page2=page;
    }
    Controller(Model model,DMProjectPage page){
       this.model=model;
       this.page1=page;
    }
    Controller(Model model,MyProjectPage page){
       this.model=model;
       this.page3=page;
    }

//    void setTextOnly(){
//        
//        page.viewTextOnly(this.new setTextOnlyInformation());
//    }
//    class setTextOnlyInformation implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            //use dialog to return information
//            Context context = new Context(new TextOnly(), "set Department");
////            NameNDetail temp = new NameNDetail();
//            
//            model.setInfo1(context.doExecutionStrategy1());
//        }
//        
//    }
     void setNameNComboNDetail() {
         page.veiwNameNComboNDetail(this.new setNameNComboNDetailInformation());
    }
     class setNameNComboNDetailInformation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //use dialog to return information
            Context context = new Context(new NameNComboNDetail(), "set Department");
//            NameNDetail temp = new NameNDetail();
            
            model.setInfo(context.doExecutionStrategy());
        }
        
    }
     
    public void setNameOnly(){
        page.viewNameOnly(this.new setNameOnlyInformation());
    }

   
    class setNameOnlyInformation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //use dialog to return information
            Context context = new Context(new NameOnly(), "set Department");
//            NameNDetail temp = new NameNDetail();
            
            model.setInfo(context.doExecutionStrategy());
        }
        
    }
    public void setNameNCombo(){
        page.viewNameNCombo(this.new setNameNComboInformation());
    }
    class setNameNComboInformation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //use dialog to return information
            Context context = new Context(new NameNCombo(), "set Department");
//            NameNDetail temp = new NameNDetail();
            
            model.setInfo(context.doExecutionStrategy());
        }
        
    }
    
    public void setNameNDetail(){
             page.viewNameNDetail(this.new setNameNDetailInformation());

    }
    
    public void setText(){
        
    }
    class setNameNDetailInformation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //use dialog to return information
            Context context = new Context(new NameNDetail(), "set Department");
//            NameNDetail temp = new NameNDetail();
            
            model.setInfo(context.doExecutionStrategy());
        }
        
    }
}
