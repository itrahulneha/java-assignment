import java.util.Scanner;

class InvertedTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();

        // Print the inverted triangle
        printInvertedTriangle(n);
    }

    // Method to print the inverted triangle
    public static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            // Print numbers in increasing order for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}