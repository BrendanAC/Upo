/*
 * Brendan Currie
 * Fau
 * 
 */
package System;

<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631
import java.util.Date;

/**
 *
 * @author Brendan C.
 */
<<<<<<< HEAD
public class ActionType implements Serializable {
=======
public class ActionType {
>>>>>>> f88a5b91b2ea4e785d659a967d5fc2d3bc1a8631

    private final String actionType;
    private final String roomId;
    private final String comment;
    private final Date dateTime;
    private User user;
    public ActionType(String ActionType, String roomId, String comment, Date dateTime){
        this.actionType=ActionType;
        this.roomId=roomId;
        this.comment=comment;
        this.dateTime=dateTime;
    }
    public ActionType(User user,String ActionType, String roomId, String comment, Date dateTime){
        this.user=user;
        this.actionType=ActionType;
        this.roomId=roomId;
        this.comment=comment;
        this.dateTime=dateTime;
    }
    public void setUser(User user){
        this.user=user;
    }
    public String getActionType(){
        return actionType;
    }
     public String getRoomId(){
        return roomId;
    }
      public String getComment(){
        return comment;
    }
       public Date getDateTime(){
        return dateTime;
    }
    @Override
    public String toString()
    {
    return " Acitivity " +
            " User " + user +
            " actionType = " + actionType +
            " roomId = " + roomId +
            " comment = "+ comment + 
            " time = " + dateTime +
            "\n";
    }
  }
