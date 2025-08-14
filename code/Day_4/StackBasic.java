package Day_4;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackLL{
    Node top;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed in stack");
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data);
        top = top.next;
    }

    public void peek(){
        if(top == null) {
            System.out.println("Empty");
            return;
        }else{
            System.out.println(top.data);
        }
    }
}

public class StackBasic {
    int top;
    int capacity;
    int arr[];

    StackBasic(int size){
        this.capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.peek());

        StackLL stLL = new StackLL();
        stLL.push(30);
        stLL.push(20);

        stLL.pop();
        stLL.peek();
    }
}
