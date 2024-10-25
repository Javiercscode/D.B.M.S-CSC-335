import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Record> records;

    public Database() {
        records = new ArrayList<>();
    }

    public Record[] displayRecord() {
        return records.toArray(new Record[0]);
    }

    public void addRecord(Record record) throws Exception {
        if (containsRecord(record)) {
            throw new Exception("Duplicate record exception: Record already exists.");
        }
        records.add(record);
    }

    public void updateRecord(Record search, Record modify) throws Exception {
        boolean updated = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).equals(search)) {
                records.set(i, modify);
                updated = true;
                break;
            }
        }
        if (!updated) {
            throw new Exception("Record not found exception: Unable to update, record not found.");
        }
    }

    public Record[] selectRecord(Record search) throws Exception {
        List<Record> selectedRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.equals(search)) {
                selectedRecords.add(record);
            }
        }
        if (selectedRecords.isEmpty()) {
            throw new Exception("Record not found exception: No matching records found.");
        }
        return selectedRecords.toArray(new Record[0]);
    }

    public void deleteRecord(Record search) throws Exception {
        boolean deleted = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).equals(search)) {
                records.remove(i);
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            throw new Exception("Record not found exception: Unable to delete, record not found.");
        }
    }

    public boolean containsRecord(Record search) {
        for (Record record : records) {
            if (record.equals(search)) {
                return true;
            }
        }
        return false;
    }
}
