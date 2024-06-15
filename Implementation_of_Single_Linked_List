public class LinkedList {
    private Node head;
    private int size;

    // Constructor
    public LinkedList() {
        this.head = null;
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
        node.next = head; // New node points to the current head
        head = node; // Head is updated to the new node
        size++;
    }

    // Add a node with value at the tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = node; // If the list is empty, the new node becomes the head
        } else {
            Node dummy = head;
            while (dummy.next != null) dummy = dummy.next; // Traverse to the last node
            dummy.next = node; // The last node points to the new node
        }
        size++;
    }

    // Add a node with value at the given index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; // Index out of bounds check
        Node node = new Node(val);
        if (index == 0) {
            node.next = head; // New node points to the current head
            head = node; // Head is updated to the new node
        } else {
            Node dummy = head;
            for (int i = 0; i < index - 1; i++) dummy = dummy.next; // Traverse to the node before the desired index
            node.next = dummy.next; // New node points to the next node in the sequence
            dummy.next = node; // Previous node points to the new node
        }
        size++;
    }

    // Delete a node at the given index
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return; // Index out of bounds check
        if (index == 0) {
            head = head.next; // Head is updated to the next node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) current = current.next; // Traverse to the node before the desired index
            current.next = current.next.next; // Node at index is removed by skipping it
        }
        size--;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Node class
    private static class Node {
        private int val;
        private Node next;

        // Constructor
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Main class to demonstrate the LinkedList functionality
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements at the head
        list.addAtHead(1);
        list.addAtHead(2);
        System.out.println(list.get(0)); 
        System.out.println(list.get(1)); 

        // Add elements at the tail
        list.addAtTail(3);
        System.out.println(list.get(2)); 

        // Add elements at a specific index
        list.addAtIndex(1, 4);
        System.out.println(list.get(1)); 
        System.out.println(list.get(2)); 

        // Delete elements at a specific index
        list.deleteAtIndex(1);
        System.out.println(list.get(1)); 

        // Print the final state of the list
        printList(list);
    }

    // Helper method to print the list
    public static void printList(LinkedList list) {
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
