/*
 * Brendan Currie
 * Fau
 * 
 */
package System;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Brendan C.
 */
public class User {

    private final String id;
    private final String name;
    private final String password;
    private  String role;
    private  String dept;
    private  ArrayList<Room> rooms;
    private  ArrayList<ActionType> history;
    
    
    public User( String id, String name, String password, String role, String dept, ArrayList<ActionType> history){
        this.id=id;
        this.name=name;
        this.password=password;
        this.role=role;
        this.dept=dept;
        this.history = history;
        rooms=new ArrayList<Room>();
    }
    
    public ArrayList<ActionType> getHistory(){
        return history;
    }
    
    @Override
    public String toString(){
        return "\nUser Id :" + id + "\tName :" + name;
        
    }
    public String toString(int i){
        return "\nUser Id :" + id + "\tName :" + name + "\n" + displayRooms();
        
    }
    public String displayRooms(){
        String ret = "";
                for (Room r : rooms){
                    ret += r.getRoomId() + " \n";
                }
        return ret;
    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public String getUsername() {
        return name;
    }
    public String getDept(){
        return dept;
    }

    boolean checkPassword(String password) {
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }
    
}
