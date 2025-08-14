package Day_4;
// implemntion with array

public class Stack {
    int capacity;
    int top;
    int[] arr;

    public Stack(int size){
        this.capacity = size;
        this.top = -1;
        this.arr = new int[size];
    }

    void push(int value){
        if(top == capacity - 1){
            System.out.println("Stack is overflow");
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }
        int elt = arr[--top];
        System.out.println(elt + " element is removed from stack");
        return elt;
    }

    int peek(){
        return arr[top];
    }

    boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }

    boolean isFull(){
        if(top == capacity -1) return true;
        return false;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(1);
        st.push(2);

        System.out.println(st.pop());
    }
}
