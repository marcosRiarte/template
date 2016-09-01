package ar.fiuba.tdd.template;

public class QueueTest extends TestCase {
        Queue cola = new Queue();
        int number = 8;
        String string ="seven";
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
        int number2= 9;
        this.cola.add(number2);
        assertEquals("Result with size = 1 value is : ",1,this.cola.size());

        }


@Test
    public void firstElementBack() {
        System.out.println("Test of take the first queue element");
        assertEquals("The first element is  : ",8,this.cola.top());

    }

@Test
    public void removeElement(){
        System.out.println("Test to remove the first element of the queue");
        this.cola.remove();
        assertTrue(cola.top()!=8);
    }
}