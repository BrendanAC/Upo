/*
 * Brendan Currie
 * Fau
 * 
 */
package System;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brendan C.
 */
public class Upo {

    private ArrayList<User> users;
    private ArrayList<Room> rooms;
    private ArrayList<ActionType> actions;
    public static Upo system=null;
    
    
    private Upo(){
       users=new ArrayList();
       rooms=new ArrayList();
       actions=new ArrayList();
       Parse p;
       try{
       p = new Parse();
        users=p.Run();
       this.LoadRoom(users);
       }catch (FileNotFoundException e){
           
       }catch(IOException e){
           
       }
       
    }
    public static Upo getInstance(){
        if (system == null){
            system = new Upo();
        }
        return system;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
     Upo u = new Upo();
     
     System.out.println("ROOMS :");
     System.out.println(u.rooms.toString());
     
     System.out.println("ACTIONS :");
     System.out.println(u.actions.toString());
     
     System.out.println("USERS :");
    // System.out.println(u.users.toString());
     for(User us :u.users)
     System.out.println(us.toString()+"\n "+ us.displayRooms());
    }

    private void LoadRoom(ArrayList<User> users) {
        for(User u : users){
            for(ActionType a : u.getHistory()){
                if(!(roomIdExist(a))){
                    rooms.add(new Room(u,a.getRoomId())); 
                            }
                 else{
                            this.addToRoom(u,a);
                            }
                this.addAction(a);
                
            }
        }
        this.linkUsers();
          }
    
    private void addToRoom(User u,ActionType a) {
        for(Room r : rooms){
            if(r.getRoomId().equals(a.getRoomId())){
                if(!(r.getRoomMembers().contains(u))){
                    r.addRoomMember(u);
                }
                int i=rooms.indexOf(r);
                Room x=rooms.get(i);
                x.addRoomHistory(a);
                
        }
        }
    }
    public boolean login(String username,String password){
        if(usernameExist(username)){
            User temp=getUserByUsername(username);
            if(temp.checkPassword(password)){
                return true;
            }
                    
        }
        return false;
    }

    public User getUserByUsername(String username){
         for (User u : users){
            if((u.getUsername()).equals(username)){
            return u;
            }
        }
        return null;
    }
    private boolean usernameExist(String username) {
        for (User u : users){
            if((u.getUsername()).equals(username)){
            return true;
            }
        }
        return false;
    }
    private boolean roomIdExist(ActionType a) {
        for (Room r : rooms){
            if((r.getRoomId()).equals(a.getRoomId())){
            return true;
            }
        }
        return false;
    }
    
    private void addAction(ActionType a) {
       actions.add(a);
    }

    private void linkUsers() {
        for(Room r: rooms){
           if(!(r.equals(null))){
           List<User> temp= r.getRoomMembers();
           for(User u : temp){
               u.addRoom(r);
           }
           }
        }
    }
    
}
