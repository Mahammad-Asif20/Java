package Assignment1;
import java.util.Scanner;


public class FibonacciSequence {
	
	static void fibonacciNumbers(int n){
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<n;i++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		fibonacciNumbers(n);
		
		
		
		
		
		
	}

}
