import java.util.Scanner;

public class SmallAndLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findSmallAndLargest(arr);
    }

    public static void findSmallAndLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(" Largest element: " + largest);
        System.out.println(" Smallest element: " + smallest);
    }
}
