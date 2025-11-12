public class Test {   
    public static void main(String[] args) {

        Cache<Integer> cache = new Cache<>(3);
        
        System.out.println("Тест cache"); 
        
        cache.add(1);
        cache.add(2);
        cache.add(3);
        System.out.println("Добавил 1,2,3");
        
        System.out.println("Первый: " + cache.getFirst());
        System.out.println("Последний: " + cache.getLast());
        System.out.println("Есть 2: " + cache.exists(1));
        System.out.println("Элемент 1: " + cache.getItemByIndex(0)); 
        
        cache.add(4);
        System.out.println("\nДобавил 4");
        System.out.println("Первый: " + cache.getFirst());
        System.out.println("Есть 1: " + cache.exists(0)); 
        
        cache.remove(2); 
        System.out.println("\nудалил 2"); 
        System.out.println("Есть 2: " + cache.exists(1)); 

        Cache<String> stringCache = new Cache<>(2);
        stringCache.add("Hello");
        stringCache.add("World");
        System.out.println("\nТест со строками");  
        System.out.println("Первый: " + stringCache.getFirst());
        System.out.println("Последний: " + stringCache.getLast()); 
    }
} 