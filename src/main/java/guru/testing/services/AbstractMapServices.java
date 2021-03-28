package guru.testing.services;

import guru.testing.model.BaseEntity;

import java.util.*;

public class AbstractMapServices<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){ return new HashSet<>(map.values());}

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if (object != null){
            if (object.getId() == 0){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    private long getNextId() {
        try{
            return Collections.max(map.keySet()) + 1;
        }
        catch (NoSuchElementException e){
            return 1l;
        }
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        // map.entrySet() returns Set<T> ( T == Map.Entry<K,V> )
        //Set extends Collections that has removeIf(Predicate<? super T>)
        // Predicate<? super T> has only test(T t) method that return boolean
        // entry of type T
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
