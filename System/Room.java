/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anak
 */
//for all user, create rooms 
//if room already exist, skip
//add room
<<<<<<< HEAD
public class Room implements Serializable{
=======
public class Room {
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
    //a room is owned by a Team Leader
    private String roomId;
    //Actions associated to a room
    private List<User> roomMembers = new ArrayList<>();
    //room's history of activity
    private List<ActionType> roomHistory = new ArrayList<>();
            
    //Team Leader create a room that belong to him. 
    public Room(User user,String roomId){
        addRoomMember(user);
        this.roomId = roomId;
        ArrayList<ActionType> history=user.getHistory();
        
        for(ActionType h: history){
            if((h.getRoomId()).equals(this.roomId)){
                roomHistory.add(h);
            }
        }

        }
    public List<User> getRoomMembers(){
        return roomMembers;
    }
    
    void addRoomMember(User u) {
       roomMembers.add(u);
    }

    public List<ActionType> getRoomHistory(){
        return roomHistory;
    }
    public void addRoomHistory(ActionType a){
        roomHistory.add(a);
    }
    public String getRoomId() {
        return roomId; //To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
        String userRet="";
                for(User u: roomMembers){
                    userRet+=u.toString()+"\n";
                }
        return "\nRoom ID : " + roomId + "\nRoom members\n" + userRet+ "\nRoom history : \n" + roomHistory.toString();
    }
//    
//    //show info to swing screen
//    public void show(){
//       
//    }
//    //a method that annouce action to users that are in related department.
//    public void announceAction(){
//       //if(file is edited)
//       //   for(all departments in this room that is responsible for this file)
//       //       for(all users that are in these department)
//       //           addActivity to 1. feedspage 2. roomHistory
////                  show this announcement to responsible users.
//       
//       //if(user is a team Leader and announce something)
//       //   for(list of departments that are created by TL to receive this announcement)
////              addActivity to 1.feedpage 2.
////              show this announcemnent to reponsibe users.
//       
//    }
//    
//    //create all rooms
//    public void CreateAllRoom(List<user> users, List<Action> actions){
//        //for all actions
//        for(int x=0; x < users.size(); x++){
//            for(int i =0; i < users.get(x).getUserHistory().size(); i++){
//                // for all rooms in eaech actions
//                for(int j=0; j < users.get(x).getUserHistory().get(i).getRooms().size(); j++){
//                    //add action object to roomHistory
//                    users.get(x).getUserHistory().get(i).getRooms().get(j).addActivitiy(users.get(x).getUserHistory().get(i));
//                }
//            }
//        }
//    }
//    
//    //get list of all actions in this room
//    public List<Action> getRoomHistory(){
//        return roomHistory;
//    }
//    
//    //add an action to a room
//   public void addActivitiy(Action action){
//       roomHistory.add(action);
//   }
//   
//   //Left To do
//   //1. create new room(team leader)
//   //2. create department (TL)
//   //3. add/delete member to a room (TL)

    
    
    
}
