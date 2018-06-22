package task3;

import java.util.*;

/**
 * Created by ag on 22.06.2018.
 */
public class CountMapExample<K> implements CountMap {
    HashMap<K, Integer> storage;

    public CountMapExample(){
        storage = new HashMap<K, Integer>();
    }

    public void add(Object smth) {
        if (storage.containsKey((K) smth)){
            int newValue = storage.get(smth) + 1;
            storage.replace((K) smth, newValue);
        } else {
            storage.put((K) smth, 1);
        }
    }

    public int getCount(Object smth) {
        if (storage.get((K) smth) != null) {
            return storage.get((K) smth);
        }else return 0;
    }

    public int remove(Object smth) {
        int oldValue = storage.get((K) smth);
        storage.remove((K) smth);
        return oldValue;
    }

    public void addAll(CountMap source) {
        ArrayList<K> sourceValues = (ArrayList<K>) source.toMap().values();
        Iterator iterator = sourceValues.iterator();
        while (iterator.hasNext()){
            this.add(iterator.next());
        }
    }

    public Map toMap() {
        return storage;
    }

    //?????????????
    public void toMap(Map destination) {
        destination = storage;
    }


}
