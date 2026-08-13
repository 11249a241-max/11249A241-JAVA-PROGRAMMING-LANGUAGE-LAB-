import java.util.Scanner;

public class SalesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sales = new int[12];

        // Input monthly sales
        System.out.println("Enter sales for 12 months:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        // Assume first value is maximum and minimum
        int max = sales[0];
        int min = sales[0];

        // Find maximum and minimum
        for (int i = 1; i < 12; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("\nHighest Sales = " + max);
        System.out.println("Lowest Sales = " + min);

        sc.close();
    }
}
