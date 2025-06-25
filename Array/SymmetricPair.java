
   import java.util.Scanner;
public class SymmetricPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare 2D array
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
        findSymmetricPairs(arr);

   
    }
    public static void findSymmetricPairs(int[][] arr) {
        int n = arr.length;

        System.out.println("Symmetric pairs are:");
        for (int i = 0; i < n; i++) {
            int x1 = arr[i][0];
            int y1 = arr[i][1];

            for (int j = i + 1; j < n; j++) {
                int x2 = arr[j][0];
                int y2 = arr[j][1];

                if (x1 == y2 && y1 == x2) {
                    System.out.println("(" + x1 + ", " + y1 + ")");
                }
            }
        }
    }
  

}
