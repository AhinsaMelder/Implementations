public class StackLinkedList {
    private Node top;
    private int size;

    // Constructor
    public StackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    // Push a value onto the stack
    public void push(int val) {
        Node node = new Node(val);
        node.next = top;
        top = node;
        size++;
    }

    // Pop a value from the stack
    public int pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        int val = top.val;
        top = top.next;
        size--;
        return val;
    }

    // Peek the top value of the stack
    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return top.val;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the size of the stack
    public int size() {
        return size;
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

    // Main method to demonstrate the Stack functionality
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek the top element
        System.out.println("Peek: " + stack.peek()); 

        // Pop elements from the stack
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 

        // Check if the stack is empty
        System.out.println("Is Empty: " + stack.isEmpty()); 

        // Get the size of the stack
        System.out.println("Size: " + stack.size()); 

        // Pop the last element
        System.out.println("Pop: " + stack.pop()); 

        // Check if the stack is empty again
        System.out.println("Is Empty: " + stack.isEmpty()); 
    }
}
