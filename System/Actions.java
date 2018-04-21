/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Anak
 */
public class Actions {
    //List of all room that this action is associated with 
    private List<Room> rooms = new ArrayList<>(); 
    //Action history created a user
    private List<User> users = new ArrayList<>();
    
    
    
    private String actionType;
    private String comment;
    private Date time;
    public Actions(User user, Room room,ActionType actionType){
        this.users.add(user);
        this.rooms.add(room);
        this.actionType=actionType.getActionType();
        this.comment=comment;
        this.time=time;
        
    }
    //get list of room of the action
    public List<Room> getRooms(){
          return rooms;
    }
    //get list of action in actionHistory
//    public List<User> getActionHistory(){
//        return actionHistory;
//    }
}
