/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Room;
import System.User;
import java.util.ArrayList;
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
    private JPanel notePanel;
    private JPanel boxLayoutPanel1;
    private JPanel northPanel;
    private JPanel westPanel;
    private JPanel centerPanel;
    private JPanel graphPanel;

    private JButton newsFeedButton;
    private JButton contactButton;
    private JButton uploadButton;
    private JButton downloadButton;
    private JButton requestButton;

    private JButton suggestionButton;
    private JButton logOutButton;

    private JLabel label;

    private JTextArea textArea;
    private JTextArea contactInfoArea;
    private JTextArea taskTextArea;

    private ArrayList<String> textList;
    private JProgressBar progressBar;
    
    private User user;
    private Room room;
    
    private JFrame frame;
    

    public JPanel getNotePanel() {
        return notePanel;
    }

    public void setNotePanel(JPanel notePanel) {
        this.notePanel = notePanel;
    }

    public JPanel getBoxLayoutPanel1() {
        return boxLayoutPanel1;
    }

    public void setBoxLayoutPanel1(JPanel boxLayoutPanel1) {
        this.boxLayoutPanel1 = boxLayoutPanel1;
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

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }

    public JPanel getGraphPanel() {
        return graphPanel;
    }

    public void setGraphPanel(JPanel graphPanel) {
        this.graphPanel = graphPanel;
    }

    public JButton getNewsFeedButton() {
        return newsFeedButton;
    }

    public void setNewsFeedButton(JButton newsFeedButton) {
        this.newsFeedButton = newsFeedButton;
    }

    public JButton getContactButton() {
        return contactButton;
    }

    public void setContactButton(JButton contactButton) {
        this.contactButton = contactButton;
    }

    public JButton getUploadButton() {
        return uploadButton;
    }

    public void setUploadButton(JButton uploadButton) {
        this.uploadButton = uploadButton;
    }

    public JButton getDownloadButton() {
        return downloadButton;
    }

    public void setDownloadButton(JButton downloadButton) {
        this.downloadButton = downloadButton;
    }

    public JButton getRequestButton() {
        return requestButton;
    }

    public void setRequestButton(JButton requestButton) {
        this.requestButton = requestButton;
    }

    public JButton getSuggestionButton() {
        return suggestionButton;
    }

    public void setSuggestionButton(JButton suggestionButton) {
        this.suggestionButton = suggestionButton;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }

    public void setLogOutButton(JButton logOutButton) {
        this.logOutButton = logOutButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextArea getContactInfoArea() {
        return contactInfoArea;
    }

    public void setContactInfoArea(JTextArea contactInfoArea) {
        this.contactInfoArea = contactInfoArea;
    }

    public JTextArea getTaskTextArea() {
        return taskTextArea;
    }

    public void setTaskTextArea(JTextArea taskTextArea) {
        this.taskTextArea = taskTextArea;
    }

    public ArrayList<String> getTextList() {
        return textList;
    }

    public void setTextList(ArrayList<String> textList) {
        this.textList = textList;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    
    
}
