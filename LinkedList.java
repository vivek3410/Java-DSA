public class LinkedList {
    
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }


        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public void insertAtBeggining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int value){
        if(head == null) return;

        if(head.data == value){
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }

}
