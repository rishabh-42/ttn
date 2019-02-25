package Collection;

import java.util.ArrayList;
import java.util.List;

public class First {

    static float sum=0;
    public static void main(String[] args) {

        //Declaring a list of generic type float
        List<Float> floatingList = new ArrayList<>();

        floatingList.add(1.2f);
        floatingList.add(2.22f);
        floatingList.add(3.4567f);
        floatingList.add(54.54f);
        floatingList.add(3.4f);

        for(Float num : floatingList){
            sum+= num;

        }
        System.out.format(" Sum is %.2f",sum);




    }
}
