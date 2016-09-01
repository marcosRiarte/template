public class QueueTest<T> extends TestCase {
    private Queue <T>cola = new Queue<T>();
    private T number;
    private T string;
    @Test
    public void ListEmpty() {
        System.out.println("Test of List Empty");
        assertTrue(this.cola.isEmpty());
    }

    @Test
    public void seeSize(){
        System.out.println("Test of size of the queue");
        assertEquals("Result with size = 0  value is : ",0,this.cola.size());
        this.cola.add(this.number);
        assertEquals("Result with size = 1 value is : ",1,this.cola.size());
        this.cola.add(this.string);
        assertEquals("Result with size = 2 value is : ",2,this.cola.size());
    }

    @Test
    public void addElement() {
        System.out.println("Test add a element to queued");
        assertEquals("Result with size = 0 value is : ",0,this.cola.size());
        T number2 = (T) new Integer(2);
        this.cola.add(number2);
        assertEquals("Result with size = 1 value is : ",1,this.cola.size());

    }

    @Test
    public void firstElementBack() {
        System.out.println("Test of take the first queue element");
        assertTrue (cola.top() != null );

    }

    @Test
    public void removeElement(){
        System.out.println("Test to remove the first element of the queue");
        int tamañoActual=this.cola.size();
        this.cola.remove();
        assertTrue(cola.size()== (tamañoActual -1));
    }
}