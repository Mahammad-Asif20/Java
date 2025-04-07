import java.util.*;


public class Map {

	public static void main(String[] args) {
		// 1. Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() – Add key-value pairs
        map.put(101, "Asif");
        map.put(102, "Mahir");
        map.put(103, "Faizan");
        map.put(104, "Zeeshan");

        // Duplicate key -> value gets updated
        map.put(102, "Mahammad");

        System.out.println("HashMap: " + map);

        // 3. get() – Get value by key
        System.out.println("Value at key 102: " + map.get(102));

        // 4. containsKey() and containsValue()
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Contains value 'Asif'? " + map.containsValue("Asif"));

        // 5. remove() – Remove entry by key
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // 6. size() – Number of entries
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 8. keySet() – Get all keys
        System.out.println("Keys: " + map.keySet());

        // 9. values() – Get all values
        System.out.println("Values: " + map.values());


        // 10. clear()
        map.clear();
        System.out.println("After clearing: " + map);
        
        
 //LinkedHashMap       
 
     // 1. Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // 2. put() – Add key-value pairs
        linkedMap.put(1, "Asif");
        linkedMap.put(2, "Mahir");
        linkedMap.put(3, "Faizan");
        linkedMap.put(4, "Zeeshan");

        // Duplicate key (updates value)
        linkedMap.put(2, "Mahammad");

        // 3. Displaying the map
        System.out.println("LinkedHashMap: " + linkedMap); // Maintains insertion order

        // 4. get() – Get value by key
        System.out.println("Value at key 2: " + linkedMap.get(2));

        // 5. containsKey() and containsValue()
        System.out.println("Contains key 3? " + linkedMap.containsKey(3));
        System.out.println("Contains value 'Asif'? " + linkedMap.containsValue("Asif"));

        // 6. remove() – Remove entry by key
        linkedMap.remove(4);
        System.out.println("After removing key 4: " + linkedMap);

        // 7. size()
        System.out.println("Size of map: " + linkedMap.size());

        // 8. isEmpty()
        System.out.println("Is map empty? " + linkedMap.isEmpty());

        // 9. keySet()
        System.out.println("Keys: " + linkedMap.keySet());

        // 10. values()
        System.out.println("Values: " + linkedMap.values());

        // 11. clear()
        linkedMap.clear();
        System.out.println("After clearing: " + linkedMap);
        
        
 //TreeMap
        // 1. Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 2. put() – Add key-value pairs (Keys will be sorted)
        treeMap.put(10, "Zeeshan");
        treeMap.put(5, "Asif");
        treeMap.put(7, "Faizan");
        treeMap.put(1, "Mahir");

        // Duplicate key (overwrites value)
        treeMap.put(7, "Mahammad");

        // 3. Displaying the TreeMap
        System.out.println("TreeMap (Sorted by keys): " + treeMap);

        // 4. get() – Get value by key
        System.out.println("Value at key 5: " + treeMap.get(5));

        // 5. containsKey() and containsValue()
        System.out.println("Contains key 10? " + treeMap.containsKey(10));
        System.out.println("Contains value 'Asif'? " + treeMap.containsValue("Asif"));

        // 6. remove() – Remove entry by key
        treeMap.remove(1);
        System.out.println("After removing key 1: " + treeMap);

        // 7. size()
        System.out.println("Size of TreeMap: " + treeMap.size());

        // 8. isEmpty()
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // 9. firstKey(), lastKey()
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        // 11. clear()
        treeMap.clear();
        System.out.println("After clearing: " + treeMap);
        
        
        

	}

}
