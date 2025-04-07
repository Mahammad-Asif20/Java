package Assignment1;
import java.util.Scanner;
public class ReverseString {
	static void reverseString() {
		String name="Pacewisdom";
        String rev="";
        for(int i=name.length()-1;i>=0;i--) {
        	char c=name.charAt(i);
        	rev=rev+c;
        }
        System.out.println(rev);
		
	}

	public static void main(String[] args) {
		reverseString();
		
	}

}
