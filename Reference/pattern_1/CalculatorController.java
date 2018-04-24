/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Anak
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView,CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculateListener(new CalculateListener());
    }
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber,secondNumber = 0;
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addTwoNumbers(firstNumber, secondNumber);
                
                theView.setCalcSolution(theModel.getCalculationValue());
            }catch(NumberFormatException ex){
                theView.displayErrorMessage("You need to add 2 numbers");
            }
        }
    
}
}
