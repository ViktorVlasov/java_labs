package lab10;

 /*
        * 5)Реализуй вспомогательныe методы в классе Solution, которые должны создавать соответствующую коллекцию
        * и помещать туда переданные объекты.
        * Методы newArrayList, newHashSet параметризируй типом T.
        * Метод newHashMap параметризируй типами К(ключ) и V(значение). Аргументы метода newHashMap должны
        * принимать списки, в которых содержатся наследники типов K и V.
        * Возвращаемые коллекции должны быть такого же типа, что и переданные в метод объекты.
        *

         * Требования:
            1.Метод newArrayList должен быть параметризован типом Т.
            2.Метод newArrayList должен возвращать ArrayList, который содержит переданные в метод объекты.
            3.Метод newHashSet должен быть параметризован типом Т.
            4.Метод newHashSet должен возвращать HashSet, который содержит переданные в метод объекты.
            5.Метод newHashMap должен быть параметризован типом K и V.
            6.Метод newHashMap должен возвращать HashMap, который содержит переданные в метод ключи и значения.
            7.Метод newHashMap должен кидать IllegalArgumentException, если списки ключей и значений не совпадают по размеру.
         */

import java.util.*;

public class Solution {
    public static <T> ArrayList<T> newArrayList(T ... elements) {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, elements);
        return (arrayList);
    }

    public static <T> HashSet<T> newHashSet(T ... elements) {
        HashSet<T> hashSet = new HashSet<>();
        Collections.addAll(hashSet, elements);
        return (hashSet);
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();

        HashMap<K, V> hashMap = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            hashMap.put(keys.get(i), values.get(i));
        }
        return hashMap;
    }
}
