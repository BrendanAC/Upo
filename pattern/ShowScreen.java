/*
 * To change frame license header, choose License Headers in Project Properties.
 * To change frame template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import GUI.Model;
import GUI.NewsFeed;
import GUI.PMProjectPage;
import GUI.login;
import GUI.showDialog;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import System.User;
import System.Room;


/**
 *
 * @author Anak
 */
public class ShowScreen {
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
    
    public Model model;
    private myProjectPage myProjectPage;
    private DMProjectPage dmProjectPage;
    private PMProjectPage pmProjectPage;
    
    
    ShowScreen(){
        
    }
    ShowScreen(Model model, myProjectPage myprojectpage){
        
        this.model = model;
        myprojectpage = new myProjectPage(model.getUser(), model.getRoom());
        this.myProjectPage = myprojectpage;
//        myProjectPage = new myProjectPage(model.getUser(),model.getRoom());
//        dmProjectPage = new DMProjectPage(model.getUser(),model.getRoom());
//        pmProjectPage = new pmProjectPage(model.getUser(),model.getRoom());
    }
    
     void initComponent(){
         
        
        getFrame().setLayout(new BorderLayout());
        getFrame().setDefaultCloseOperation(EXIT_ON_CLOSE);
        getFrame().setVisible(true);
        
        
//      panel
        northPanel = new JPanel(new BorderLayout());
        centerPanel = new JPanel(new BorderLayout());
        westPanel = new JPanel();
        notePanel = new JPanel();
        boxLayoutPanel1 = new JPanel();
        graphPanel = new JPanel();

//      button
        newsFeedButton = new JButton("News Feed");
        contactButton = new JButton("Contact info");
        uploadButton = new JButton("Upload");
        downloadButton = new JButton("Download");
        requestButton = new JButton("Request Files");


        suggestionButton = new JButton("Suggestion");

        logOutButton = new JButton("Log Out");
        


//      text
        textArea = new JTextArea();
        textList = new ArrayList<>();
        contactInfoArea = new JTextArea(10,20);
        taskTextArea = new JTextArea(10,20);
//        label
        label = new JLabel("My Project Page");
        label.setFont(new Font("Serif", Font.PLAIN, 50));

//        JScroolPane
        JScrollPane scrollPane = new JScrollPane(new JTextArea(10,20), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel1 = new JScrollPane( textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollPanel2 = new JScrollPane( taskTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

//        actionListener
        newsFeedButton.addActionListener((e)-> {

            frame.setVisible(false);
            NewsFeed ob = new NewsFeed(user);
            ob.setVisible(true);
        });

//        All Methods goes here
        loadProjectPage();
//        displayText(textArea,textList);

//        actionListener


        contactButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.contactDialog();
        });
        logOutButton.addActionListener((e)-> {
           frame.setVisible(false);
           login ob = new login();
           ob.setVisible(true);

        });
        uploadButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.uploadDialog();
        });

        downloadButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.downloadDialog();
        });

        requestButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.requestDialog();
        });


        suggestionButton.addActionListener((e)-> {
            showDialog showdialog = new showDialog();
            showdialog.suggestDialog();
        });

//       all the desgin goes here
        newsFeedButton.setMargin(new Insets(20,20,20,20));
        //      progressBar
        progressBar = new JProgressBar();
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

//        westPanel
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        northPanel
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        boxLayout
        notePanel.add(new JLabel("My Note"));
        notePanel.add(scrollPane);
        boxLayoutPanel1.add(uploadButton, BorderLayout.EAST);
        boxLayoutPanel1.add(downloadButton, BorderLayout.WEST);
        boxLayoutPanel1.add(requestButton, BorderLayout.NORTH);
        boxLayoutPanel1.add(suggestionButton, BorderLayout.SOUTH);




//        **********************Adding component***************************8

        //northPanel
        northPanel.add(label, BorderLayout.WEST);
        northPanel.add(notePanel, BorderLayout.CENTER);
        northPanel.add(logOutButton,BorderLayout.EAST);
//        northPanel.add(boxLayoutPanel1, BorderLayout.CENTER);





        //        graphPanel
        graphPanel.add(progressBar);
        graphPanel.add(scrollPanel2, BorderLayout.WEST );

        //        westPanel
        westPanel.add(newsFeedButton);
        westPanel.add(contactButton);

        //        centerPanel

        centerPanel.add(scrollPanel1);
//        centerPanel.add(notePanel, BorderLayout.SOUTH);
        centerPanel.add(graphPanel, BorderLayout.NORTH);
        centerPanel.add(boxLayoutPanel1, BorderLayout.SOUTH);


        //       JFrame
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(westPanel, BorderLayout.WEST);



    }
    void displayText(JTextArea textArea, ArrayList text){
        for(String s: textList){
            textArea.append(s + "\n");
        }
    }
    
    private  void loadProjectPage(){
          getRoom().getRoomHistory().forEach((a) -> {
              textList.add(a.toString());
        });
        displayText(textArea,textList);
    }
    
    public void updateMyProjectPage(){
        System.out.println("in updateMyProjectPage");
        myProjectPage.setUp();
    }
//    public void setJFrameName(String s){
////        frame = new JFrame(s);
//          model.setFrame(new JFrame(s));
//    }
//    public void setJFrameSize(int x, int y){
//        model.getFrame().setSize(x,y);
//    }
    
// **************setter and getter***********************

    public JPanel getNotePanel() {
        return model.getNotePanel();
    }

    public void setNotePanel(JPanel notePanel) {
        model.getNotePanel();
    }

    public JPanel getBoxLayoutPanel1() {
        return model.getBoxLayoutPanel1();
    }

    public void setBoxLayoutPanel1(JPanel boxLayoutPanel1) {
        model.setBoxLayoutPanel1(boxLayoutPanel1);
    }

    public JPanel getNorthPanel() {
        return model.getBoxLayoutPanel1();
    }

    public void setNorthPanel(JPanel northPanel) {
        model.setNorthPanel(northPanel);
    }

    public JPanel getWestPanel() {
        return model.getWestPanel();
    }

    public void setWestPanel(JPanel westPanel) {
        model.setWestPanel(westPanel);
    }

    public JPanel getCenterPanel() {
        return model.getCenterPanel();
    }

    public void setCenterPanel(JPanel centerPanel) {
        model.setCenterPanel(centerPanel);
    }

    public JPanel getGraphPanel() {
        return model.getGraphPanel();
    }

    public void setGraphPanel(JPanel graphPanel) {
        model.setGraphPanel(graphPanel);
    }

    public JButton getNewsFeedButton() {
        return model.getNewsFeedButton();
    }

    public void setNewsFeedButton(JButton newsFeedButton) {
        model.setNewsFeedButton(newsFeedButton);
    }

    public JButton getContactButton() {
        return model.getContactButton();
    }

    public void setContactButton(JButton contactButton) {
        model.setContactButton(contactButton);
    }

    public JButton getUploadButton() {
        return model.getUploadButton();
    }

    public void setUploadButton(JButton uploadButton) {
        model.setUploadButton(uploadButton);
    }

    public JButton getDownloadButton() {
        return model.getDownloadButton();
    }

    public void setDownloadButton(JButton downloadButton) {
        model.setDownloadButton(downloadButton);
    }

    public JButton getRequestButton() {
        return model.getRequestButton();
    }

    public void setRequestButton(JButton requestButton) {
        model.setRequestButton(requestButton);
    }

    public JButton getSuggestionButton() {
        return model.getSuggestionButton();
    }

    public void setSuggestionButton(JButton suggestionButton) {
        model.setSuggestionButton(suggestionButton);
    }

    public JButton getLogOutButton() {
        return model.getLogOutButton();
    }

    public void setLogOutButton(JButton logOutButton) {
        model.setLogOutButton(logOutButton);
    }

    public JLabel getLabel() {
        return model.getLabel();
    }

    public void setLabel(JLabel label) {
        model.setLabel(label);
    }

    public JTextArea getTextArea() {
        return model.getTextArea();
    }

    public void setTextArea(JTextArea textArea) {
        model.setTextArea(textArea);
    }

    public JTextArea getContactInfoArea() {
        return model.getContactInfoArea();
    }

    public void setContactInfoArea(JTextArea contactInfoArea) {
       model.setContactInfoArea(contactInfoArea);
    }

    public JTextArea getTaskTextArea() {
        return model.getTaskTextArea();
    }

    public void setTaskTextArea(JTextArea taskTextArea) {
       model.setTaskTextArea(taskTextArea);
    }

    public ArrayList<String> getTextList() {
        return model.getTextList();
    }

    public void setTextList(ArrayList<String> textList) {
        model.setTextList(textList);
    }

    public JProgressBar getProgressBar() {
        return model.getProgressBar();
    }

    public void setProgressBar(JProgressBar progressBar) {
        model.setProgressBar(progressBar);
    }

    public JFrame getFrame() {
        return model.getFrame();
    }

    public void setFrame(JFrame frame) {
        model.setFrame(frame);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = new Model();
    }

    public User getUser() {
//        return user;
        return model.getUser();
    }

    public void setUser(User user) {
        model.setUser(user);
    }

    public Room getRoom() {
        return model.getRoom();
    }

    public void setRoom(Room room) {
        model.setRoom(room);
    }
    
}
