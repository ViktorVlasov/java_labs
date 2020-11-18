package pract13;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[5];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        }
    }

    // pre: количество элементов > 0
    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;

        return queue.elements[0];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        Object tmp;

        tmp = element(queue);
        queue.size--;
        queue.elements = Arrays.copyOfRange(queue.elements, 1, queue.elements.length);
        return tmp;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    public static void clear(ArrayQueueADT queue) { queue.elements = new Object[5]; }
}
