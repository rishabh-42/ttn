package Collection.FifthAnswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fifth {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(25.89,25,"Rishabh"));
        stuList.add(new Student(28.89,26,"Arpit"));
        stuList.add(new Student(25.89,21,"Lohit"));
        stuList.add(new Student(21.89,22,"Surbhi"));
        stuList.add(new Student(25.89,28,"Gagan"));
        stuList.add(new Student(23.89,20,"Vagish"));
        stuList.add(new Student(26.89,25,"Yukti"));

        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getScore()-o1.getScore()==0)
                {
                    return o1.getName().compareTo(o2.getName());
                }
                return (int) (o2.getScore()-o1.getScore());
            }
        });

        System.out.println("List of students according to their marks . In case of same marks ,ordering by name ");
        for (Student s: stuList
             ) {
            System.out.println("Name : " + s.getName());
            System.out.println("Score : " + s.getScore());
            System.out.println("Age : " + s.getAge());
            System.out.println("========================");

        }


    }
}

class Student {

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private double score;
    private double age;
    private String name;

    public Student(double score, double age, String name) {
        this.score = score;
        this.age = age;
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}