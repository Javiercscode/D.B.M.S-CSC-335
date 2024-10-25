public class Record {
    private String[] fields;

    public String getField(int index) {
        return fields[index];
    }

    public void setField(int index, String n, String v) {
        Field f = new Field(n, v);
        fields[index] = f;
    }

    public boolean equals(Record r1, Record r2) {
        if (r1.getField().equals(r2.getField())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(Field f) {
        return ("Name: " + f.getName() + " Value: " + f.getValue());
    }
}
