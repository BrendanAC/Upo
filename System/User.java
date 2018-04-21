/*
 * Brendan Currie
 * Fau
 * 
 */
package System;

<<<<<<< HEAD
import java.io.Serializable;
=======
import java.awt.List;
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import java.util.ArrayList;

/**
 *
 * @author Brendan C.
 */
<<<<<<< HEAD
public class User implements Serializable{
=======
public class User {
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

    private final String id;
    private final String name;
    private final String password;
    private  String role;
    private  String dept;
<<<<<<< HEAD
    private  ArrayList<TaskType> tasks;
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
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
<<<<<<< HEAD
    public void addTask(User asignedBy, String taskDescription){
        TaskType temp = new TaskType(asignedBy, taskDescription);
        
    }
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
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

    boolean checkPassword(String password) {
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }

    void addRoom(Room r) {
        rooms.add(r);
    }
    
}
