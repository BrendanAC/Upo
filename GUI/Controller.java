/*
 * Brendan Currie
 * Fau
 * 
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Brendan C.
 */
public class Controller {
    Model model;
    NewsFeed page;

    Controller(Model model,NewsFeed page){
       this.model=model;
       this.page=page;
  
    }

 
    public void setNameOnly(){
        
    }
    public void setNameCombo(){
        
    }
    public void setCombo(){
        
    
    }
    public void setNameDetail(){
             page.viewNameDetail(this.new setInformation());

    }
    
    public void setText(){
        
    }
    class setInformation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //use dialog to return information
            Context context = new Context(new NameNDescription(), "set Department");
//            NameNDescription temp = new NameNDescription();
            
            model.setInfo(context.doExecutionStrategy());
        }
        
    }
}
