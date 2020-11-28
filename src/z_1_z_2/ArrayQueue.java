package z_1_z_2;

public class ArrayQueue extends AbstractQueue {

    private Object[] elements;

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
    }

    public void enqueue(Object element) {
        assert element != null;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        assert size > 0;
        return elements[head];
    }

    public Object dequeue() {
        Object tmp = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return tmp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}