/*
 * Brendan Currie
 * Fau
 * 
 */
package Upo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Brendan C.
 */
public class Parse {
    public static final String fileName="C:\\Users\\anom3\\Desktop\\UpoTextFile.txt";
    //private Scanner scanner;
    private ArrayList<User> user;
    private final BufferedReader br;
    private String words[];
    private int i;
    public Parse() throws FileNotFoundException{
        //this.scanner=new Scanner(new File(fileName));
        InputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
        br = new BufferedReader(isr);
        this.user=new ArrayList<User>();
    }
    private String getNextWord(){
        String ret=words[i];
        addI();
        return ret;
    }
    private void addI(){
        i=i+1;
    }
    private void resetI(){
        i=0;
    }
    public ArrayList Run() throws IOException{
        String line;
        while((line=br.readLine()) != null){
            
            words = line.split(" ");
            resetI();
            ArrayList<ActionType> activity = new ArrayList<ActionType>();
            String id=getNextWord();
            
            
            System.out.println(id);
            String name=getNextWord();
            String password=getNextWord();
            String role=getNextWord();
            String dept=getNextWord();
            String in;
            int i=5;
            String action;
            while( !(action=getNextWord()).equals("!")){
                
                
                String roomID=getNextWord();
                
                String comment=getComment();
                Date time=getTime();
                ActionType comp=new ActionType(action,roomID,comment,time);             
                activity.add(comp);
                }
            User temp = new User(id,name,password,role,dept,activity);
            user.add(temp);
            setUserAll(temp,activity);
            System.out.println(id + " "+ name + " " + password + " " + dept + " "  );
            for (int q =0; q<activity.size();q++){
                System.out.println(activity.get(q).toString());
            }
        }
        
        return user;
        
    }

    private String getComment() {
        String temp=getNextWord();
        String ret=temp.replace("\"", "");
        while(!ret.contains("\"")){
            ret+=" "+getNextWord();
        }
       ret=ret.replace("\"","");
       return ret;
    }

    private Date getTime() {
        String ret=getNextWord();
        
        ret+=" "+getNextWord();
        if(ret.contains("!"));
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yy kk:mm:ss");
        Date t=null;
        try{
            t=ft.parse(ret);
        } catch (ParseException ex) {
            System.out.println("Unparseable using ft");
        }
       return t;
    }

    private int convert(String next) {
        next=(String)next;
        int result = Integer.parseInt(next);
        return result;
    }

    private void setUserAll(User user, ArrayList<ActionType> activity) {
        for(ActionType a:activity){
            a.setUser(user);
        }
    }
}
