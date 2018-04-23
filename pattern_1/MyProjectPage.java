/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_1;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


/**
 *
 * @author Anak
 */
public class MyProjectPage {

      
    MyProjectPage(){
        initComponent();
    }
    void initComponent(){
         Model model = new Model();
        //set Label
        model.setPageName(new JLabel("MyProjectPage"));
        //set Button
        model.setAddButton(new JButton("addButton"));
        model.setContactButton(new JButton("contactButton"));
        model.setDownloadButton(new JButton("downloadButton"));
        model.setSuggestButton(new JButton("suggestButton"));
        model.setUploadButton(new JButton("downloadButton"));
        model.setDownloadButton(new JButton("uploadButton"));
        
        //progress Bar
        model.setProgressBar(new JProgressBar());
        //set TextArea
        model.setTextArea(new JTextArea());
        //set Panel
        model.setCenterPanel(new JPanel());
        model.getCenterPanel().setLayout(new BoxLayout(model.getCenterPanel(), BoxLayout.Y_AXIS));
        //center subPanel();
        model.setCenterNPanel(new JPanel());
        model.setCenterCPanel(new JPanel());
        model.setCenterSPanel(new JPanel());
        //north Panel
        model.setNorthPanel(new JPanel());
        
        //west Panel
        model.setWestPanel(new JPanel());
        
        //west subPanel
        model.setWestBoxPanel(new JPanel());
        
        
//        addComponenet
        //north
        model.getNorthPanel().add(model.getPageName(), BorderLayout.WEST);
        
        //west
        model.getWestBoxPanel().add(model.getAddButton());
        model.getWestBoxPanel().add(model.getContactButton());
        model.getWestPanel().add(model.getWestBoxPanel());
        
        //center
        model.getCenterNPanel().add(model.getProgressBar());
        
        model.getTextArea().setSize(20,20);
        model.setTextArea(textArea);
        model.getCenterCPanel().add(model.getTextArea());
        
        
        model.getCenterSPanel().add(model.getUploadButton(), BorderLayout.WEST);
        model.getCenterSPanel().add(model.getDownloadButton(),BorderLayout.CENTER);
        
        //*****************ONLY FOR MYPROJECTPAGE*****************************
        model.getCenterSPanel().add(model.getSuggestButton(),BorderLayout.EAST);
        //********************************************************************
//        model.getCenterPanel().add(model.getCenterCPanel());
        model.getCenterPanel().add(new JLabel("NORTH"));
        model.getCenterPanel().add(model.getCenterNPanel());
        model.getCenterPanel().add(model.getCenterCPanel());
        model.getCenterPanel().add(model.getCenterSPanel());
//        model.getCenterPanel().add(model.getCenterNPanel(),BorderLayout.NORTH);
        
        
        model.setFrame(new JFrame());
        model.getFrame().add(model.getNorthPanel(),BorderLayout.NORTH);
        model.getFrame().add(model.getWestBoxPanel(),BorderLayout.WEST);
        model.getFrame().add(model.getCenterPanel(),BorderLayout.CENTER);
        
    }
    public static void main(String[] agrs){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new MyProjectPage();
            }
        });
    }
}
