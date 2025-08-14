package Day_4;
import java.util.Stack;


public class MinValue {
    Stack<Integer> minStack;
    Stack<Integer> mainStack;


    public MinValue(){
        minStack = new Stack<>();
        mainStack = new Stack<>();
    }

    public void push(int value){
        mainStack.push(value);

        if(minStack.isEmpty() || minStack.peek() > value){
            minStack.push(value);
        }
     }

     public int minPeek(){
        return minStack.peek();
     }

     public static void main(String[] args) {
        MinValue min = new MinValue();
        min.push(5);
        min.push(4);
        min.push(3);
        min.push(2);

        int result = min.minPeek();

        System.out.println(result);
     }


}
