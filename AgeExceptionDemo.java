import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            // Convert String to integer
            int age = Integer.parseInt(input);

            System.out.println("Your age is: " + age);

            // Demonstrate ArithmeticException
            int result = 100 / (age - age);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            sc.close();
            System.out.println("Program completed.");
        }
    }
}
