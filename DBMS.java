import java.io.File;
public class DBMS extends Database{
    File file = new File("Database.csv");
    boolean File_connection;
    
    DBMS(){

    }
    public void Connect(){
        if(file.exists()){
            File_connection = true;
            System.out.println("File does exist!");
            System.out.println("Connection established");
        }
        else{
            File_connection = false;
            System.out.println("Could not connect to file:");
            System.out.println("Reason:File could not be find");
            System.exit(0);
        }

    }
    public void Disconnect(){
        if(file.exists()){
            System.out.println("File is found");
            System.out.println("Sucessfully disconnected from file!");
        }
        else{
            System.out.println("Could not disconnect from file:");
            System.out.println("Reason:File could not be find");
            //System.exit(0);
        }
    }
    public void Contains(){

    }
    public void Update(){

    }
    public void Insert(){

    }
    public void Delete(){
        
    }
    public void Select(){
        
    }
}
