package Day_3;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    public DLLNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    DLLNode head;

    public void insert(int data){
        DLLNode newNode = new DLLNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        DLLNode newNode = new DLLNode(data);

        DLLNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        newNode.prev = temp;
        temp.next = newNode;
    }

    public void display(){
        DLLNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DLL list = new DLL();

        list.insert(1);
        list.insertAtEnd(2 );
        list.insertAtEnd(3 );
        list.insertAtEnd(4 );

        list.display();

    }
}
