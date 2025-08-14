package Day_4;

public class Queue {
    int capacity;
    int[] arr;
    int front = -1;
    int rear = -1;

    public Queue(int size){
        capacity = size;
        arr = new int[size];
    }


    public void enqueue(int data){

        if(rear == capacity-1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1) front = 0;

        arr[++rear] = data;

        System.out.println(arr[rear] + " data is inserted");
    }

    public int dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue is empty");
            return -1;
        }

        return arr[front++];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(2);


        int result = q.dequeue();
        result = q.dequeue();


        System.out.println(result );
    }


}
