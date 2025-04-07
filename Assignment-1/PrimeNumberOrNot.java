package Assignment1;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		int n=9;
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		System.out.println(flag);
	}

}
