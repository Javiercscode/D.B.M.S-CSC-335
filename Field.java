import java.io.FileWriter;
import java.io.IOException;

public class Field extends DBMS {
    private String name;
    private String value;
    private FileWriter pw;

    public Field() {
        this.name = "";
        this.value = "";
    }

    public Field(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addRecord() {
            try {
                pw = new FileWriter("Database.csv", true);
                pw.write(getName() + "," + getValue() + "\n");
                System.out.println("Record added: " + getName() + " = " + getValue());
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            } finally {
                try {
                    if (pw != null) {
                        pw.close();
                    }
                } catch (IOException e) {
                    System.out.println("Failed to close the FileWriter.");
                    e.printStackTrace();
                }
            }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Value: " + getValue();
    }
}
