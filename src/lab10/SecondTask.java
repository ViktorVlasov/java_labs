package lab10;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondTask {
    // Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).

    public class ArrayGeneric <E> {
        private E[] arr;

        ArrayGeneric(E[] arr) { this.arr = arr; }

        public int getLength() { return  arr.length; }
        public E getElem(int i) {
            if (i < getLength())
                return  arr[i];
            else
                return null;
        }
        @Override
        public String toString() { return Arrays.toString(arr); }
    }

    public void testSecondTask() {
        Integer[] testArr = {10, 21, 32, 43};

        ArrayGeneric<Integer> arrayGeneric = new ArrayGeneric<>(testArr);
        System.out.println(arrayGeneric);
        System.out.println("Элемент по индексу 0: " + arrayGeneric.getElem(0));
    }
}
