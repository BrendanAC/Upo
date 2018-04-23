/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_DOC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pattern_2.View;

/**
 *
 * @author Anak
 */
public class Controller {
    pattern_2.Model model;
    View view;
    /**initialize model and view to this Controller
     * 
     */
    Controller(){
        
    }
    
    /**call addButtonActionListener in View
     * 
     */
    void callAddButton(){
        
    }
    /**A class with actionPerformed method to interact with outside
     * 
     */
    class addButtonListener implements ActionListener{
        /**call addNewButton() in Model
         * 
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
