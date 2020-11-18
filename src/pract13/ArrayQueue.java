package pract13;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[5];

    public void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    // pre: количество элементов > 0
    public Object element() {
        assert size > 0;

        return elements[0];
    }

    public Object dequeue() {
        Object tmp;

        tmp = element();
        size--;
        elements = Arrays.copyOfRange(elements, 1, elements.length);
        return tmp;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() { elements = new Object[5]; }
}
