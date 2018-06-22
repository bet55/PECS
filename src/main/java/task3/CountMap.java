package task3;

import java.util.Map;

/**
 * Created by ag on 22.06.2018.
 */
public interface CountMap<T> {
    // добавляет элемент в этот контейнер.
    void add(T smth);

    // Возвращает количество добавлений данного элемента
    int getCount(T smth);

    //Удаляет элемент из контейнера и возвращает количество его добавлений (до удаления)
    int remove(T smth); //количество разных элементов int size();

    // Добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения
    void addAll(CountMap source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map destination);
}