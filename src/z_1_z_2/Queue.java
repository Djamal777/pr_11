package z_1_z_2;

public interface Queue {

    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();
}