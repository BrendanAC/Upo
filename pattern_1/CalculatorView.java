package pattern_1;


import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anak
 */
public class CalculatorView extends JFrame{
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JTextField calcSolution = new JTextField(10);
    private JButton calculateButton = new JButton();
    
    CalculatorView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
    }

    public int getFirstNumber(){
     return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
     return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcNumber(){
     return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(rootPane, errorMessage);
    }
}
