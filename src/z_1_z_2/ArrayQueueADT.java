package z_1_z_2;

public class ArrayQueueADT
{
    private int size;
    private int head;
    private int tail;
    private Object[] elements;

    public ArrayQueueADT(int capacity) {
        elements = new Object[capacity];
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert queue != null;
        assert element != null;
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue != null;
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue != null;
        Object tmp = element(queue);
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return tmp;
    }

    public static int size(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        assert queue != null;
        return (queue.size == 0);
    }

    public static void clear(ArrayQueueADT queue) {
        assert queue != null;
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}