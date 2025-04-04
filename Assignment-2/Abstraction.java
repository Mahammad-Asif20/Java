abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Abstraction {

	public static void main(String[] args) {
		Shape shape = new Circle();
        shape.draw();    
        shape.display();
		
		

	}

}
