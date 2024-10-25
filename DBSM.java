import java.io.File;
import java.io.FileNotFoundException;

public class DBSM extends Database {
    private boolean containsRecord; 
    private File dbmsFile;
    private boolean Connected;

    public void connect(String filePath) {
        dbmsFile = new File("C:\\Users\\XxGho\\Desktop\\CSC 335 java project\\DBMS 335\\Databasefile.csv"); 
        try {
            if (dbmsFile.exists()) {
                Connected = true;
                System.out.println("Connected to the database file.");
            } else {
                throw new FileNotFoundException("Database file not found.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        if (dbmsFile != null && dbmsFile.exists()) {
            dbmsFile = null;
            System.out.println("Disconnected from the database.");
        } else {
            System.out.println("Can't disconnect; file doesn't exist.");
        }
    }

    public boolean contains() {
        super.containsRecord("")
        return containsRecord;
    }
    public static Contains(){

    }
    public void update(){

    }
    public void insert(){

    }
    public void delete(){

    }
}
