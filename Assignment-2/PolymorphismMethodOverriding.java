class Vehicle {
    public void startEngine() {
        System.out.println("Starting generic vehicle engine...");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting car engine...");
    }
}
public class PolymorphismMethodOverriding {
     public static void main(String[] args) {
		
		Vehicle myVehicle = new Vehicle();
        myVehicle.startEngine(); // Calls parent class method

        Vehicle myCar = new Car();
        myCar.startEngine();
		
	}

}
