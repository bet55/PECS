package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ag on 22.06.2018.
 */
public class CollectionUtils{

    // пример параметризации метода и его реализации:
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) { destination.addAll(source); }

    //Создать новый List из c вернуть в виде List
    public static <T> List newArrayList(List<? extends T> c) {
        return (new ArrayList<T>(c));
    }
    //индекс элемента в листе
    public static <T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

    //вернуть лист длиной не более size
    public static <T> List limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<T>(size);
        list.addAll(source);
        return list;
    }

    //добавить элемент в конец листа
    public static <T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    //удалить все вхождения элемента c2
    public static <T> void removeAll(List<? extends T> removeFrom, List c2) {
        for (T t : removeFrom) {
            if (t.equals(c2)){
                removeFrom.remove(c2);
            }
        }
    }

    //true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    //true если первый лист содержит хотя-бы 1 второго
    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t : c2) {
            if (c1.contains(t)){
                return true;
            }
        }
        return false;
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Пример
    //range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    //public static <T> List range(List<? extends T> list, T min, T max) {}

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через comparator.
    // Пример
    // range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    //public static List range(List list, Object min, Object max, Comparator comparator) {}

}