package Collection.SpecialStack;

public class Main {

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack(10);

        //StackUnderflow
        specialStack.pop();
        specialStack.push(-2);
        specialStack.push(1);
        specialStack.push(4);
        specialStack.push(8);
        specialStack.push(9);
        specialStack.push(-7);
        specialStack.push(24);
        specialStack.push(-23);
        specialStack.push(32);
        specialStack.push(12);

        //Overflow Now
        specialStack.push(1);
        System.out.println("Top element is : " +specialStack.peek());

        System.out.println("Minimum Element is : " +specialStack.getMinEle());
        System.out.print("After removal of -23 , Minimum element is : ");

        //removing -23
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        System.out.println(specialStack.getMinEle());









    }
}
