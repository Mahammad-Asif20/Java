import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {
		
//1.Write a Java program to filter a list of strings and print only the ones that have length greater than 3. Use a lambda expression to perform this operation.
		
		List<String> list=List.of("Mahmmad","asif","Mahir","aaa");
		List<String> names=list.stream().filter(e->e.length()>3).collect(Collectors.toList());
		System.out.println(names);
		
//2.Write a Java program that takes a list of integers and returns the sum of the even numbers in the list. Use a lambda expression to perform this operation.
		
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8);
		List<Integer> list2=list1.stream().filter(e->e%2==0).map(n->n+n).collect(Collectors.toList());
	    System.out.println(list2);
	    
	    
	    
//3.Write a Java program that takes a list of names and returns the names sorted in ascending order. Use a lambda expression to perform this operation.
	    List<String> str=List.of("Mahammad","Asif","Mausooq","abdul");
	    List<String> names1=str.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
	    System.out.println(names1);
	    
//4.Write a Java program to find the maximum number in a list of integers. Use a lambda expression to perform this operation.
	    
	    List<Integer> numbers=List.of(2,1,3,4,5,7,8);
	    Optional<Integer> maxNumber=numbers.stream().max((num1,num2)->num1.compareTo(num2));
	    maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));
	    
	    
//5.Write a Java program to find the first letter of each word in a sentence, and return a string containing only the first letters. Use a lambda expression to perform this operation.
	
	    String sentence = "Java is a powerful language";

        String firstLetters = Arrays.stream(sentence.split(" ")).map(word -> word.substring(0, 1)) .collect(Collectors.joining());    
        System.out.println("First letters: " + firstLetters);
	    
	    
	}

}
