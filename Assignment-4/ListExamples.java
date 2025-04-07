import java.util.*;

public class ListExamples {

	public static void main(String[] args) {
		//ArrayList
		
		// 1. Create an ArrayList
        List<String> list = new ArrayList<>();

        // 2. add() – Add elements
        list.add("Asif");
        list.add("Mahir");
        list.add("Faizan");
        list.add("Asif"); // Allows duplicate

        // 3. Display the list
        System.out.println("ArrayList: " + list);

        // 4. size() – Get the size
        System.out.println("Size: " + list.size());

        // 5. get(index) – Access by index
        System.out.println("Element at index 1: " + list.get(1));

        // 6. contains() – Check if element exists
        System.out.println("Contains 'Mahir'? " + list.contains("Mahir"));

        // 7. indexOf() – Get index of first occurrence
        System.out.println("Index of 'Asif': " + list.indexOf("Asif"));

        // 8. lastIndexOf() – Last index of an element
        System.out.println("Last index of 'Asif': " + list.lastIndexOf("Asif"));

        // 9. set(index, value) – Update an element
        list.set(1, "Mahammad");
        System.out.println("After update: " + list);

        // 10. remove(index) – Remove by index
        list.remove(2);
        System.out.println("After removing index 2: " + list);

        // 11. for-each loop – Iterate over elements
        System.out.println("Iterating list:");
        for (String name : list) {
            System.out.println(name);
        }

        // 12. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 13. clear() – Remove all elements
        list.clear();
        System.out.println("After clear(): " + list);
       
       
	
//LinkedList
          
     // 1. Create LinkedList
        LinkedList<String> list1 = new LinkedList<>();

        // 2. add() – Add elements
        list1.add("Asif");
        list1.add("Mahir");
        list1.add("Faizan");

        // 3. addFirst() – Add at the beginning
        list1.addFirst("First");

        // 4. addLast() – Add at the end
        list1.addLast("Last");

        System.out.println("LinkedList: " + list1);

        // 5. get() – Get element at index
        System.out.println("Element at index 2: " + list1.get(2));

        // 6. getFirst() and getLast()
        System.out.println("First element: " + list1.getFirst());
        System.out.println("Last element: " + list1.getLast());

        // 7. remove() – Remove by index
        list1.remove(2);
        System.out.println("After removing index 2: " + list1);

        // 8. removeFirst() and removeLast()
        list1.removeFirst();
        list1.removeLast();
        System.out.println("After removing first and last: " + list1);

        // 9. set(index, element) – Update value
        list1.set(0, "Mahammad");
        System.out.println("After updating index 0: " + list1);

        // 10. contains() – Check element
        System.out.println("Contains 'Asif'? " + list1.contains("Asif"));

        // 11. indexOf() and lastIndexOf()
        list1.add("Asif");
        System.out.println("Index of 'Asif': " + list1.indexOf("Asif"));
        System.out.println("Last index of 'Asif': " + list1.lastIndexOf("Asif"));

        // 12. size()
        System.out.println("Size: " + list1.size());

        // 13. isEmpty()
        System.out.println("Is list empty? " + list1.isEmpty());

        // 14. clear()
        list1.clear();
        System.out.println("After clear(): " + list1);
   
   
       
	}

}
