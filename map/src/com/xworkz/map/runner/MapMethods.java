package com.xworkz.map.runner;
import java.util.*;
public class MapMethods {

        public static void main(String[] args) {

            Map<String, String> map = new HashMap<>();


            map.put("Red", "Apple");
            map.put("Yellow", "Banana");
            map.put("Marron", "Cherry");

            // 2. putIfAbsent(K key, V value)
            map.putIfAbsent("Brown", "Dates");
            map.putIfAbsent("Red", "Apricot");

            // 3. get(Object key)
            System.out.println("3.get(Object key)");
            System.out.println("Get key Yellow: " + map.get("Yellow"));

            // 4. getOrDefault(Object key, V defaultValue)
            System.out.println("GetOrDefault key Blue: " + map.getOrDefault("Blue", "No Fruit"));

            // 5. containsKey(Object key)
            System.out.println("Contains key Marron: " + map.containsKey("Marron"));

            // 6. containsValue(Object value)
            System.out.println("Contains value 'Cherry': " + map.containsValue("Cherry"));

            // 7. remove(Object key)
            map.remove("Yellow");

            // 8. remove(Object key, Object value)
            boolean removed = map.remove("Marron", "Mango");
            System.out.println("Removed Marron with Mango? " + removed);

            // 9. replace(K key, V value)
             String replace=map.replace("Blue", "Dragonfruit");


            // 10. replace(K key, V oldValue, V newValue)
            boolean replaced = map.replace("Blue", "Dragonfruit", "BlueBerry");
            System.out.println("Replaced Blue from Dragonfruit to BlueBerry? " + replaced);

            // 11. size()
            System.out.println("Map size: " + map.size());

            // 12. isEmpty()
            System.out.println("Is map empty? " + map.isEmpty());

            // 13. keySet()
            System.out.println("Keys: " + map.keySet());

            // 14. values()
            System.out.println("Values: " + map.values());

            // 15. entrySet()
            System.out.println("Entries:");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }

            // 16. forEach(BiConsumer)
            System.out.println("Using forEach:");
            map.forEach((key, value) -> System.out.println(key + " = " + value));

            // 17. clear()
            map.clear();
            System.out.println("Cleared map. IsEmpty: " + map.isEmpty());
        }
    }

