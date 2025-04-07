import java.util.*;

public class SetExamples {

	public static void main(String[] args) {
		
		//1.Creating HashSet
		HashSet<String> set = new HashSet<>();
         
		// 2. add() – Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Apple"); // duplicate, ignored

        System.out.println("HashSet: " + set);

        // 3. contains() – Check if an element exists
        System.out.println("Contains Banana? " + set.contains("Banana")); // true

        // 4. remove() – Remove an element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        // 5. size() – Total elements
        System.out.println("Size of set: " + set.size());

        // 6. isEmpty() – Check if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 7. iterator() – Iterate through elements
        System.out.print("Elements: ");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // 8. clear() – Remove all elements
        set.clear();
        System.out.println("\nAfter clearing: " + set);
      
        
       
        
 //LinkedHashSet       
     // 1. Creating a LinkedHashSet
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        // 2. add() – Add elements (in insertion order)
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        set1.add("Yellow");
        set1.add("Red"); // duplicate, will be ignored

        System.out.println("LinkedHashSet: " + set1); // Preserves order

        // 3. contains() – Check if element exists
        System.out.println("Contains Green? " + set1.contains("Green")); // true

        // 4. remove() – Remove an element
        set1.remove("Blue");
        System.out.println("After removing Blue: " + set1);

        // 5. size() – Number of elements
        System.out.println("Size of set: " + set1.size());

        // 6. isEmpty() – Check if empty
        System.out.println("Is empty? " + set1.isEmpty());

        // 7. iterator() – Iterate over elements
        System.out.print("Elements: ");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // 8. clear() – Remove all
        set1.clear();
        System.out.println("\nAfter clearing: " + set1);
	
//TreeSet 
        
        
        TreeSet<Integer> set3 = new TreeSet<>();

        // 1. add() – Add elements
        set3.add(40);
        set3.add(10);
        set3.add(30);
        set3.add(20);
        set3.add(10); // duplicate, ignored

        System.out.println("Original TreeSet: " + set3); 

        // 2. first() – Get the first (smallest) element
        System.out.println("First element: " + set3.first()); 

        // 3. last() – Get the last (largest) element
        System.out.println("Last element: " + set3.last()); 

        // 4. contains() – Check if an element exists
        System.out.println("Contains 20? " + set3.contains(20));

        // 5. remove() – Remove an element
        set3.remove(30);
        System.out.println("After removing 30: " + set3); 
        // 6. size() – Number of elements
        System.out.println("Size of set: " + set3.size()); 

        // 7. isEmpty() – Check if empty
        System.out.println("Is set empty? " + set3.isEmpty()); 

        // 8. higher() – Find next higher element
        System.out.println("Element higher than 20: " + set3.higher(20)); 

        // 9. lower() – Find lower element
        System.out.println("Element lower than 20: " + set3.lower(20)); 
        
        // 10. headSet() – Elements less than a value
        System.out.println("Elements less than 40: " + set3.headSet(40)); 

        // 11. tailSet() – Elements greater than or equal to value
        System.out.println("Elements >= 20: " + set3.tailSet(20)); 

        // 12. subSet() – Elements in range
        System.out.println("Elements between 10 and 40: " + set3.subSet(10, 40)); 

        // 13. clear() – Remove all
        set3.clear();
        System.out.println("After clearing: " + set3); 
	
	}

}
