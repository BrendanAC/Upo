/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_1;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Anak
 */
public class Model {
    private JLabel pageName;
    private JButton addButton;
    private JButton contactButton;
    private JButton suggesstButton;
    private JButton downloadButton;
    private JButton uploadButton;
    private JProgressBar progressBar;
    private JTextArea textArea;
    
    private JPanel northPanel;
    
    private JPanel westPanel;
    //west subPanel
    private JPanel westBoxPanel;
    
    private JPanel centerPanel;
    //center subPanel
    private JPanel centerNPanel;
    private JPanel centerCPanel;
    private JPanel centerSPanel;    
    private JFrame frame;    

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame){
        frame.setSize(700,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame = frame;
    }

    public JButton getSuggesstButton() {
        return suggesstButton;
    }

    public void setSuggesstButton(JButton suggesstButton) {
        this.suggesstButton = suggesstButton;
    }

    public JPanel getNorthPanel() {
        return northPanel;
    }

    public void setNorthPanel(JPanel northPanel) {
        this.northPanel = northPanel;
    }

    public JPanel getWestPanel() {
        return westPanel;
    }

    public void setWestPanel(JPanel westPanel) {
        this.westPanel = westPanel;
    }

    public JPanel getWestBoxPanel() {
        return westBoxPanel;
    }

    public void setWestBoxPanel(JPanel westBoxPanel) {
        this.westBoxPanel = westBoxPanel;
        westBoxPanel.setLayout(new BoxLayout(westBoxPanel, BoxLayout.Y_AXIS));
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public JPanel getCenterNPanel() {
        return centerNPanel;
    }

    public void setCenterNPanel(JPanel centerNPanel) {
        this.centerNPanel = centerNPanel;
    }

    public JPanel getCenterCPanel() {
        return centerCPanel;
    }

    public void setCenterCPanel(JPanel centerCPanel) {
        this.centerCPanel = centerCPanel;
    }

    public JPanel getCenterSPanel() {
        return centerSPanel;
    }

    public void setCenterSPanel(JPanel centerSPanel) {
        this.centerSPanel = centerSPanel;
    }

    public JLabel getPageName() {
        return pageName;
    }

    public void setPageName(JLabel pageName) {
        this.pageName = pageName;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getContactButton() {
        return contactButton;
    }

    public void setContactButton(JButton contactButton) {
        this.contactButton = contactButton;
    }

    public JButton getSuggestButton() {
        return suggesstButton;
    }

    public void setSuggestButton(JButton suggesstButton) {
        this.suggesstButton = suggesstButton;
    }

    public JButton getDownloadButton() {
        return downloadButton;
    }

    public void setDownloadButton(JButton downloadButton) {
        this.downloadButton = downloadButton;
    }

    public JButton getUploadButton() {
        return uploadButton;
    }

    public void setUploadButton(JButton upLoadButton) {
        this.uploadButton = upLoadButton;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
       
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        this.progressBar = progressBar;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
    
 

 
}
