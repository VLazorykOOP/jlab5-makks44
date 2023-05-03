import java.io.*;
import java.util.*;

abstract class Record implements Comparable<Record> {
    protected String name;
    protected String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract void show();

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int compareTo(Record other) {
        return this.getName().compareTo(other.getName());
    }
}

class StudentRecord extends Record {
    private String studentID;

    public StudentRecord(String name, String phone, String studentID) {
        super(name, phone);
        this.studentID = studentID;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Student ID: " + studentID);
    }

    public String getStudentID() {
        return studentID;
    }
}

class TeacherRecord extends Record {
    private String department;

    public TeacherRecord(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + department);
    }

    public String getDepartment() {
        return department;
    }
}

class StaffRecord extends Record {
    private String role;

    public StaffRecord(String name, String phone, String role) {
        super(name, phone);
        this.role = role;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + role);
    }

    public String getRole() {
        return role;
    }
}

class DepartmentHeadRecord extends TeacherRecord {
    private String degree;

    public DepartmentHeadRecord(String name, String phone, String department, String degree) {
        super(name, phone, department);
        this.degree = degree;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + getDepartment());
        System.out.println("Degree: " + degree);
    }

    public String getDegree() {
        return degree;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentRecord> studentRecords = readStudentRecordsFromFile("students.txt");
        ArrayList<TeacherRecord> teacherRecords = readTeacherRecordsFromFile("teachers.txt");
        ArrayList<StaffRecord> staffRecords = readStaffRecordsFromFile("staff.txt");
        ArrayList<DepartmentHeadRecord> departmentHeadRecords = readDepartmentHeadRecordsFromFile("department_heads.txt");

        System.out.println("Student Records:");
        showRecords(studentRecords);
        System.out.println();

        System.out.println("Teacher Records:");
        showRecords(teacherRecords);
        System.out.println();

        System.out.println("Staff Records:");
        showRecords(staffRecords);
        System.out.println();
    }
}