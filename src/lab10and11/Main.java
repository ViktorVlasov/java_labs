package lab10and11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
* Лабы:
*       10.1,2,3 = 10;
*       10.4,5 = 11;
* */

public class Main {

    public static void main(String[] args) {

        /*
        1)Написать метод для конвертации массива строк/чисел в список.
        */
        System.out.println("Первая задача:");
        new FirstTask().testFirstTask();

        /*
        * 2) Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
        * 3) Реализовать метод, который возвращает любой элемент массива по индексу.
        * */
        System.out.println("\nВторая задача:");
        new SecondTask().testSecondTask();

        /*
        * 4) Написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
        * */
        System.out.println("\nТретья задача:");
        new ThirdTask().testThirdTask();

        /*
        * 5)Реализуй вспомогательныe методы в классе Solution, которые должны создавать соответствующую коллекцию
        * и помещать туда переданные объекты.
        * Методы newArrayList, newHashSet параметризируй типом T.
        * Метод newHashMap параметризируй типами К(ключ) и V(значение). Аргументы метода newHashMap должны
        * принимать списки, в которых содержатся наследники типов K и V.
        * Возвращаемые коллекции должны быть такого же типа, что и переданные в метод объекты.
        *
        * Подсказка: в методе newHashMap нужно проверить чтобы списки ключей и значений совпадали по размерам,
        * в противном случае кинь IllegalArgumentException.

         * Требования:
            1.Метод newArrayList должен быть параметризован типом Т.
            2.Метод newArrayList должен возвращать ArrayList, который содержит переданные в метод объекты.
            3.Метод newHashSet должен быть параметризован типом Т.
            4.Метод newHashSet должен возвращать HashSet, который содержит переданные в метод объекты.
            5.Метод newHashMap должен быть параметризован типом K и V.
            6.Метод newHashMap должен возвращать HashMap, который содержит переданные в метод ключи и значения.
            7.Метод newHashMap должен кидать IllegalArgumentException, если списки ключей и значений не совпадают по размеру.
         */
        System.out.println("\nЧетвертая задача");

        ArrayList<String> arrayList = Solution.newArrayList("Hello", "World", "!");
        HashSet<Integer> hashSet = Solution.newHashSet(1, 2, 1, 3, 1, 55);
        HashMap<String, Integer> hashMap = Solution.newHashMap(Arrays.asList("Audi", "BMW", "Mercedes"), Arrays.asList(2, 1, 3));

        System.out.println(arrayList);
        System.out.println(hashSet);
        System.out.println(hashMap);
    }
}