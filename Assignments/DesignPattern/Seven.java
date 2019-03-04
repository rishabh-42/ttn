package DesignPattern;

import sun.java2d.xr.DirtyRegion;

import java.awt.*;
import java.awt.dnd.DragGestureListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class Seven {
}

//Component
interface Directory {
    void showDirectoryDetails();
}

//Leaf
class Employee implements Directory {
    private String name;
    private int Id;
    private String language;

    public Employee(String name, int id, String language) {
        this.name = name;
        this.Id = id;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", language='" + language + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", language='" + language + '\'' +
                '}';
    }
}

class EmployeeDirectory implements Directory {

   List<Directory> directoryList = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        directoryList.forEach(directory -> directory.showDirectoryDetails());

    }
}

//client
class Composite {
    public static void main(String[] args) {
        Employee employee = new Employee("Rishabh",1,"Java");
        Employee employee1 = new Employee("Shivam",2,".net");

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.directoryList.add(employee);
        employeeDirectory.directoryList.add(employee1);

        employeeDirectory.showDirectoryDetails();
    }
}
