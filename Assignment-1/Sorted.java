package Assignment1;

import java.util.*;

public class Sorted{
    public static void main(String args[]) {
    	
    	 Random random = new Random();
         List<Integer> numbers = new ArrayList<>();
         for (int i = 0; i < 10; i++) {
             numbers.add(random.nextInt(100) + 1);
         }

         System.out.println("Random Numbers: " + numbers);

         
         Collections.sort(numbers);

         System.out.println("Sorted Numbers: " + numbers);
     }
 	
   }