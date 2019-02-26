package Collection.SpecialStack;

public class SpecialStack {

    private  int maxSize;
    private int[] stackArray;
    private int top;
    private int minEle;

    public int getMinEle() {
        return minEle;
    }

    public SpecialStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top=-1;

    }

    boolean isEmpty (){
        if(top==-1) return true;
        else return false;
    }

    void push(int Ele)
    {
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        if(isEmpty()) {
            stackArray[++top] = Ele;
            minEle = Ele;
        }
        else
        {

            if(Ele >=minEle) stackArray[++top] =Ele;
            else
            {
                stackArray[++top]= (2*Ele - minEle);
                minEle = Ele;
            }
        }
    }

    int pop(){

        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        if(stackArray[top] >= minEle){
            int i= stackArray[top];
            top--;
            return i;
        }
        else
        {
            int i =minEle;
            minEle =2*minEle-stackArray[top];
            top--;
            return i;

        }

    }
    int peek(){
        return stackArray[top];



    }
    boolean isFull()
    {
        if(top>=maxSize-1) return true;
        else return false;
    }
}
