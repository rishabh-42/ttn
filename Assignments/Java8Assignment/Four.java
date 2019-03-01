package Java8;

public class Four {
    //Employee class is made downward
}

@FunctionalInterface
interface ConstructorReference {
    Employee getEmployeeReference(String name, Integer age, String city);
}

class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {

        ConstructorReference constructorReference = Employee::new;

        System.out.println("Getting instance of Employee Class using constructor reference : \n"
                + constructorReference.getEmployeeReference("Rishabh", 21, "Mainpuri"));
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}


