import java.util.ArrayList;
public class Record {
    private ArrayList<Field> fields;

    public String getField(int ind) {
        return (String)fields.get(ind);
    }

    public void setField(Field old, Field n) {
        int ind = fields.indexOf(old);
        fields.set(ind, n);
    }

    public Record(Field f) {
        fields.add(f);
    }

    public boolean isEqual(Record r1, Record r2) {
        int num = 0;
        while (num<fields.size()) {
            if (r1.getField().equals(r2.getField())) {
                num++;
            } else {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return ("Name: " + fields.get(0).getName() + " Value: " + fields.get(0).getValue());
    }
}
