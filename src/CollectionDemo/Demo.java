package CollectionDemo;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Rishabh");
        list.add("Rajput");

        ListIterator i = list.listIterator();

        while (i.hasNext()) {

            System.out.println(i.next());
            i.add("IS MY NAME");
        }

//        list.forEach((x)-> System.out.println(x));
        System.out.println(list.toArray());

        System.out.println("----------------------------------------");
        System.out.println("Linked List");


        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);
        ((LinkedList<Integer>) linkedList).addFirst(10);
        System.out.println(linkedList);
        System.out.println(((LinkedList<Integer>) linkedList).getFirst());

        linkedList.forEach((yukti)-> System.out.println(yukti));


        System.out.println("------------------");

        System.out.println("List having objects");

        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("Rishabh",21,1));
        list1.add(new Employee("Yukti",89,2));

        ListIterator<Employee> iterator = list1.listIterator();

        while(iterator.hasNext()) {
            System.out.println("Employee name is : " + iterator.next().EId);
        }

    }
}


