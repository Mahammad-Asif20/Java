import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// 1. ArithmeticException (Unchecked)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        // 2. NullPointerException (Unchecked)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: String is null");
        }

        // 3. ArrayIndexOutOfBoundsException (Unchecked)
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index");
        }

        // 4. NumberFormatException (Unchecked)
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }

        // 5. FileNotFoundException (Checked)
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found");
        }

        // 6. IOException (Checked)
        try {
            File file = new File("test.txt");
            file.createNewFile();
            FileReader fr = new FileReader(file);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("IOException: Error reading/writing file");
        }

        // 7. InputMismatchException (Unchecked)
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid number");
        }

        // 8. ClassCastException (Unchecked)
        try {
            Object obj = new Integer(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Cannot cast Integer to String");
        }

        // 9. InterruptedException (Checked)
        try {
            System.out.println("Sleeping for 1 second...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Thread was interrupted");
        }

        System.out.println("Program executed with all exception handling.");

	}

}
