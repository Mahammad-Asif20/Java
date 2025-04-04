
public class PolymorphismMethodOverloading {
	
	//Method Overloading
	 int add(int a, int b) {
	        return a + b;
	    }

	    
	 double add(double a, double b) {
	        return a + b ;
	    }
	 
	 //Method Overriding
	 
	

	public static void main(String[] args) {
		PolymorphismMethodOverloading polymorphism=new PolymorphismMethodOverloading();
		//Method Overloading
		int x=polymorphism.add(1, 2);
		System.out.println(x);
		
		double y=polymorphism.add(10.12, 11.12);
		System.out.println(y);

	}

}
