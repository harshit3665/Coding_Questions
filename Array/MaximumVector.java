import java.util.Scanner;

public class MaximumVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.print("Enter elements of arr1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter elements of arr2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        // Calculate minimum scalar product
        int product = 0;
        for (int i = 0; i < n; i++) {
            product += arr1[i] * arr2[i];
        }

        System.out.println("Minimum Scalar Product: " + product);
    }
    
}