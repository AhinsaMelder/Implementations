public class Queue {
    private Node front;
    private Node rear;
    private int size;

    // Constructor
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue a value to the queue
    public void enqueue(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // Dequeue a value from the queue
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        int val = front.val;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return val;
    }

    // Peek the front value of the queue
    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return front.val;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get the size of the queue
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

    // Main method to demonstrate the Queue functionality
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements to the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Peek the front element
        System.out.println("Peek: " + queue.peek()); 

        // Dequeue elements from the queue
        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Dequeue: " + queue.dequeue()); 

        // Check if the queue is empty
        System.out.println("Is Empty: " + queue.isEmpty()); 

        // Get the size of the queue
        System.out.println("Size: " + queue.size()); 

        // Dequeue the last element
        System.out.println("Dequeue: " + queue.dequeue()); 

        // Check if the queue is empty again
        System.out.println("Is Empty: " + queue.isEmpty()); 
    }
}
