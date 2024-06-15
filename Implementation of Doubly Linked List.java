public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Get the value at the given index
    public int get(int index) {
        if (index >= size || index < 0) return -1; // Index out of bounds check
        Node node = head;
        for (int i = 0; i < index; i++) node = node.next; // Traverse to the desired node
        return node.val;
    }

    // Add a node with value at the head
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    // Add a node with value at the tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    // Add a node with value at the given index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; // Index out of bounds check
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node node = new Node(val);
            Node current = head;
            for (int i = 0; i < index; i++) current = current.next; // Traverse to the node before the desired index
            node.next = current;
            node.prev = current.prev;
            current.prev.next = node;
            current.prev = node;
            size++;
        }
    }

    // Delete a node at the given index
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return; // Index out of bounds check
        if (index == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) current = current.next; // Traverse to the desired node
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Print the list from head to tail
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printListReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Node class
    private static class Node {
        private int val;
        private Node next;
        private Node prev;

        // Constructor
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Main class to demonstrate the DoublyLinkedList functionality
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add elements at the head
        list.addAtHead(1);
        list.addAtHead(2);
        list.printList(); 
        
        // Add elements at the tail
        list.addAtTail(3);
        list.printList(); 

        // Add elements at a specific index
        list.addAtIndex(1, 4);
        list.printList(); 

        // Delete elements at a specific index
        list.deleteAtIndex(1);
        list.printList(); 
        
        // Print the list in reverse order
        list.printListReverse(); 
    }
}
