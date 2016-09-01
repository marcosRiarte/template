public class Queue<T> implements Queueable {
    class Node {

        private T element;
        private Node next;

        public Node(T object) {
            this.element = object;
            this.next = null;
        }

    }

    private Node first;
    private Node end;
    private int size = 0;


    public Queue() {
        this.end = null;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public int size() {
        return this.size;
    }
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

//public T top(){try{return this.first.element;}throw new AssertionError();} ;

    //public T top(){ assert this.size() > 1 : "ERROR";return top2();};
    public T top() {

        if (this.first == null)
            return null;

        else
            return this.first.elem;

    }

    public void remove() {
        if (this.first == null)
            return null;
        T generic = this.first.elem;
        this.first = this.first.next;
        size--;
        return generic;

    }
}
