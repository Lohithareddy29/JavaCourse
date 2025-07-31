public class Linkedlist {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    // Insert a new node at the end
    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to run the list
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}