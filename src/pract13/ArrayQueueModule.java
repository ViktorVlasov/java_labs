package pract13;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];

    public static void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    // pre: количество элементов > 0
    public static Object element() {
        assert size > 0;

        return elements[0];
    }

    public static Object dequeue() {
        Object tmp;

        tmp = element();
        size--;
        elements = Arrays.copyOfRange(elements, 1, elements.length);
        return tmp;
    }

    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void clear() { elements = new Object[5]; }
}
