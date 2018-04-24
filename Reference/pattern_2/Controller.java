/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Anak
 */
public class Controller {
    Model model;
    View view;
    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    void callAddButton(){   
        view.addButtonsActionListener( this.new addButtonListener());
    } 
    class addButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                model.addNewButton(view.getPanel(),view.getFrame());
        }
        
    }
    
}
