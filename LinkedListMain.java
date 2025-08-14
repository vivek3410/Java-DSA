public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insertAtBeggining(4);

        list.display();

        list.delete(20);
        System.out.println();

        list.display();
    }
}
