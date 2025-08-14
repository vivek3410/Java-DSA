package Day_3;

class Node {
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    }
}



public class LinkedList {
    
    Node head;

    public void insertAtBegging(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.link = head;
        head = newNode;    
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            System.out.println("you have to insert the node first");
            return;
        }

        Node temp = head;

        while(temp.link != null){
            temp = temp.link;
        }

        temp.link = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }

        System.out.println("null");

    }

    public void insertionByValue(int data,int value){
        if(value == 1){
            insertAtBegging(data);
            return;
        }

        

        Node newNode = new Node(data);
        int count = 2;
        Node temp = head;


        while(count < value){
            temp = temp.link;
            count++;
        }

        if(temp.link == null){
            insertAtEnd(data);
            return;
        }

        newNode.link = temp.link;
        temp.link = newNode;


    }

    public void deletionAtBeggining(){
        head = head.link;
    }

    public void deletionAtEnd(){
        Node temp = head;
        Node prev = temp;

        while(temp.link != null){
            prev = temp;
            temp = temp.link;
        }

        prev.link = null;
    }

    public void deletionByValue(int value){
        Node temp = head;
        Node prev = null;

        while(temp.link != null && temp.data != value){
            prev = temp;
            temp = temp.link;
        }

        prev.link = temp.link;
    }

    public void midValue(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
        }

        System.out.println(slow.data);
    }

    public static void MergeSortedLL(LinkedList l1,LinkedList l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        Node n1 = l1.head;
        Node n2 = l2.head;


        while(n1 != null && n2 != null){
            if(n1.data <= n2.data){
                temp.link = n1;
                n1 = n1.link;
            }else{
                temp.link = n2;
                n2 = n2.link;
            }
            temp = temp.link;
        }

        // if(n1 == null){
        //     temp.link = n2;
        // }else{
        //     temp.link = n1;
        // }

        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }


    }

    public void reversal(){
        Node temp = head;
        Node next = null;
        Node prev = null;

        while(temp != null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }

        head = prev;

        print();

    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.insertAtBegging(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(3);
        list1.insertAtEnd(4);
        list1.insertAtEnd(5);


        list1.print();


        list1.reversal();
        // System.out.println(head);
        // Node curr = head;

        // while(curr != null){
        //     System.out.print(curr.data+" -> ");
        //     curr = curr.link;
        // }

        // list1.print();

        
    }
}
