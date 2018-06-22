package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ag on 22.06.2018.
 */
public class CollectionUtils {

    // пример параметризации метода и его реализации:
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) { destination.addAll(source); }

    //Создать новый List из c вернуть в виде List
    public static <T> List<? super T> newArrayList(List<? extends T> c) {
        return (List<? super T>) c.subList(0, (c.size() - 1));
    }
    //индекс элемента в листе
    public static <T> int indexOf(List<? extends T> source, Object o) {
        return source.indexOf(o);
    }

    //вернуть лист длиной не более size
    public static <T> List<? super T> limit(List<? extends T> source, int size) {
        return (List<? super T>) source.subList(0, (size - 1));
    }

    //добавить элемент в конец листа
    public static <T> void add(List<? extends T> source, Object o) {

    }

    //удалить все вхождения элемента c2
    public static void removeAll(List removeFrom, List c2) {}

    //true если первый лист содержит все элементы второго
    //public static boolean containsAll(List c1, List c2) {}

    //true если первый лист содержит хотя-бы 1 второго
    //public static boolean containsAny(List c1, List c2) {}

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Пример
    //range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    //public static List range(List list, Object min, Object max) {}

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через comparator.
    // Пример
    // range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    //public static List range(List list, Object min, Object max, Comparator comparator) {}

}