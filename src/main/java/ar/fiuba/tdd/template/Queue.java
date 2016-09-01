public class Queue<T> implements Queueable<T>{
    class Node {

        private T element;
        private Node next;

        public Node(T object) {
            this.element = object;
            this.next = null;
        }

    }

    private Node first;
    private Node end = null;
    private int size = 0;


    public boolean isEmpty() { return (size == 0); }
    public int size() { return this.size; }
    public void add(T item) {
        Node new_node = new Node(item);
        if (this.end == null) {
            this.end = new_node;
        } else {
            new_node.next = this.end;
            this.end = new_node;

        }
        size++;
    }

    public T top() {
        if (this.size == 0)
            throw new AssertionError();

        else
            return this.first.element;

    }

    public void remove() {
        if (this.size == 0)
            throw new AssertionError();
        else
            this.first = this.first.next;
        size--;

    }
}