import java.util.Scanner;

public class StringProcessing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        //1.Finds the number of characters in the string
        int length=input.length();
        System.out.println("the number of characters in the string is :"+length);
        
        //2. Converts the string to uppercase
        String uppercase=input.toUpperCase();
        System.out.println("The Uppercase is :"+uppercase);
        
        //3.Converts the string to lowercase
         String lowercase = input.toLowerCase();
         System.out.println("The Lowercase is :"+lowercase);

        //4.Finds the frequency of a specific character in the string
           for(char c='a';c<='z';c++) {
        	   int ch=0;
        	   for(int i=0;i<input.length();i++) {
        		   if(input.charAt(i)==c) {
        			   ch++;
        		   }
        		   
        	   }
           
           if (ch > 0) { 
        	   System.out.println("Frequency of '" + c + "': " + ch);
           }
          }
           
           
         //5.Replaces a specific substring in the string with another string
            
           
           
           
	}

}
