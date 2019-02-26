package Collection.FourthAnswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fourth {

    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(21d,25458.25,"Rishabh"));
        listEmp.add(new Employee(26d,29876.25,"Lohit"));
        listEmp.add(new Employee(25d,254547.14,"Vagish"));
        listEmp.add(new Employee(27d,257.14,"Yukti"));

        Collections.sort(listEmp,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary()-o1.getSalary());
            }
        });
        System.out.println("Employee starting from highest salary to lower salary : \n");

        for (Employee e:listEmp
             ) {
            System.out.println("Name : " +e.getName() );
            System.out.println("Salary : " +e.getSalary() );
            System.out.println("Age : " +e.getAge() );
            System.out.println("---------------------------");

        }


    }
}

class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "Age=" + Age +
                ", salary=" + salary +
                ", Name='" + Name + '\'' +
                '}';
    }

    private Double Age ;
    private  Double salary;
    private String Name;

    public Employee(Double age, Double salary, String name) {
        Age = age;
        this.salary = salary;
        Name = name;
    }

    public Double getAge() {
        return Age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return Name;
    }
}
