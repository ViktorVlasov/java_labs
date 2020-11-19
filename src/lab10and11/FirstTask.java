package lab10and11;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstTask {
    public <E> ArrayList<E> convert(E[] arr) {
        return (new ArrayList<>(Arrays.asList(arr)));
    }

    public void testFirstTask() {
        // Числа
        Integer[] a = {1, 2, 3};
        ArrayList<Integer> listInt;

        listInt = convert(a);
        listInt.set(0, 222);
        a[2] = 333;

        System.out.println(Arrays.toString(a));
        System.out.println(listInt);

        // Строки
        String[] b = {"a", "b", "c"};
        ArrayList<String> listStr;

        listStr = convert(b);
        listStr.set(0, "bbb");

        System.out.println(Arrays.toString(b));
        System.out.println(listStr);
    }
}
