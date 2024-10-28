import java.io.*;
public class Database {
    String file = "Database.csv";
    Database(){

    }
    public void DisplayRecord(){
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!=null){
                String[] row = line.split(",");

                for(String index : row){
                    System.out.printf("%-10s",index);
                }
                System.out.println();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    
    }
    public void UpdateRecord(){

    }
    public void SelectRecord(){

    }
    public void DeleteRecord(){

    }
    public void ContainsRecord(){
        
    }

    
}
