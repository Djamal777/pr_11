package z_1_z_2;

public class ArrayQueueModule {
    private static int size;
    private static int head;
    private static int tail;
    private static Object[] elements = new Object[10];

    public static void enqueue(Object element) {
        assert element != null;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        assert size > 0;
        return elements[head];
    }

    public static Object dequeue() {
        assert size > 0;
        Object tmp = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return tmp;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return (size == 0);
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}