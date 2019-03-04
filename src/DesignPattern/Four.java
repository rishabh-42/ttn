package DesignPattern;

import java.text.DateFormat;

public class Four {


}

class Student {



    Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.rollNo = studentBuilder.getRollNo();
        this._class = studentBuilder.get_class();
        this.section = studentBuilder.getSection();
        this.DOB = studentBuilder.getDOB();
        this.fathersName = studentBuilder.getFathersName();
        this.address = studentBuilder.getAddress();

    }

    private String name;
    private long rollNo;
    private String address;
    private DateFormat DOB;
    private int _class;
    private char section;
    private String fathersName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DateFormat getDOB() {
        return DOB;
    }

    public void setDOB(DateFormat DOB) {
        this.DOB = DOB;
    }

    public int get_class() {
        return _class;
    }

    public void set_class(int _class) {
        this._class = _class;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

}

class StudentBuilder {

    private String name;
    private long rollNo;
    private String address;
    private DateFormat DOB;
    private int _class;
    private char section;
    private String fathersName;

    public StudentBuilder(String name, long rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public long getRollNo() {
        return rollNo;
    }

    public StudentBuilder setRollNo(long rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;

        return this;
    }

    public DateFormat getDOB() {
        return DOB;
    }

    public StudentBuilder setDOB(DateFormat DOB) {
        this.DOB = DOB;
        return this;
    }

    public int get_class() {
        return _class;
    }

    public StudentBuilder set_class(int _class) {
        this._class = _class;
        return this;
    }

    public char getSection() {
        return section;
    }

    public StudentBuilder setSection(char section) {
        this.section = section;
        return this;
    }

    public String getFathersName() {
        return fathersName;
    }

    public StudentBuilder setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    Student build() {
        return new Student(new StudentBuilder(name, rollNo));
    }

}


class BuilderDemo {

    public static void main(String[] args) {
        Student student =
                new StudentBuilder("Rishabh", 1).
                set_class(12).
                setAddress("Mainpuri").
                build();
        System.out.println(student.getName());

    }


}