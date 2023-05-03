import java.util.ArrayList;

// abstract class for records
abstract class Record {
    protected String name;
    protected String phoneNumber;

    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public abstract void show();

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

// class to represent a student record
class StudentRecord extends Record {
    private int studentNumber;

    public StudentRecord(String name, String phoneNumber, int studentNumber) {
        super(name, phoneNumber);
        this.studentNumber = studentNumber;
    }

    public void show() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Student Number: " + studentNumber);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}

// class to represent a teacher record
class TeacherRecord extends Record {
    private String course;

    public TeacherRecord(String name, String phoneNumber, String course) {
        super(name, phoneNumber);
        this.course = course;
    }

    public void show() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Course: " + course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

// class to represent a staff record
class StaffRecord extends Record {
    private String title;

    public StaffRecord(String name, String phoneNumber, String title) {
        super(name, phoneNumber);
        this.title = title;
    }

    public void show() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Title: " + title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

// class to represent a department head record
class DepartmentHeadRecord extends StaffRecord {
    private String department;

    public DepartmentHeadRecord(String name, String phoneNumber, String title, String department) {
        super(name, phoneNumber, title);
        this.department = department;
    }

    public void show() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Title: " + title + ", Department: " + department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// class to represent a collection of records
class RecordCollection<T extends Record> {
    private ArrayList<T> records = new ArrayList<T>();

    public void add(T record) {
        records.add(record);
    }

    public void remove(T record) {
        records.remove(record);
    }

    public void show() {
        for (T record : records) {
            record.show();
        }
    }

    public ArrayList<T> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<T> records) {
        this.records = records;
    }
}
