/*
 * Brendan Currie
 * Fau
 * 
 */
package Upo;

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
    private  ArrayList<ActionType> history;
    public User( String id, String name, String password, String role, String dept, ArrayList<ActionType> history){
        this.id=id;
        this.name=name;
        this.password=password;
        this.role=role;
        this.dept=dept;
        this.history = history;
    }
    
    public ArrayList<ActionType> getHistory(){
        return history;
    }
    @Override
    public String toString(){
        return "\nUser Id :" + id + "\tName :" + name;
    }

    public String getUserName() {
        return name;
    }
    
}
