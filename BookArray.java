import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];

        // Input book titles
        System.out.println("Enter the titles of 10 books:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        // Display books starting with 'A'
        System.out.println("\nBooks starting with letter 'A':");

        for (int i = 0; i < 10; i++) {
            if (books[i].startsWith("A") || books[i].startsWith("a")) {
                System.out.println(books[i]);
            }
        }

        sc.close();
    }
}
