package Day_4;

import java.util.Stack;

public class MaxValue {
    Stack<Integer> maxStack;
    Stack<Integer> mainStack;

    public MaxValue(){
        maxStack = new Stack<>();
        mainStack = new Stack<>();
    }

    public void push(int value){
        mainStack.push(value);

        if(maxStack.isEmpty() || maxStack.peek() < value){
            maxStack.push(value);
        }
    }

    public int maxPeek(){
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxValue max = new MaxValue();

        max.push(5);
        max.push(10);
        max.push(1);
        max.push(8);

        int result = max.maxPeek();

        System.out.println(result);
    }
}
