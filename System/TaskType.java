/*
 * Brendan Currie
 * Fau
 * 
 */
package System;

/**
 *
 * @author Brendan C.
 */
public class TaskType {
    private User asigenedBy;
    private String taskDescription;
   
    
    public TaskType(User asigenedBy, String taskDescription){
        this.asigenedBy=asigenedBy;
        this.taskDescription= taskDescription;
        
    }
}
