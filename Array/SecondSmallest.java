import java.util.Scanner;

public class SecondSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondSmallest(arr);
    }

    public static void findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements may be equal).");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}

