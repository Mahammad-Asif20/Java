class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new InvalidAgeException("You must be 18 or older to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }


	}

}