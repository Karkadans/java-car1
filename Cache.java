import java.util.LinkedList; 

public class Cache<T> {
    private LinkedList<T> list;
    private int maxSize;
    
    public Cache(int maxSize) { 
        this.maxSize = maxSize; 
        this.list = new LinkedList<>();
    }
    
    public void add(T item) {
        list.add(item);
        if (list.size() > maxSize) {
            list.removeFirst();
        }
    }
    
    public boolean remove(T item) {
        return list.remove(item);
    }
    
    public boolean exists(T item) {
        return list.contains(item);
    }
    
    public T getFirst() {
        if (list.isEmpty()) return null;
        return list.getFirst();
    }
    
    public T getLast() {
        if (list.isEmpty()) return null;
        return list.getLast();
    }
    
    //Получить по индексу
    public T getItemByIndex(int i) {
        if (i < 0 || i >= list.size()) return null;
        return list.get(i);
    }
} 
