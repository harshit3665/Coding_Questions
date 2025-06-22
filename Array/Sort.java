import java.util.Scanner;

public class Sort {

    // Bubble Sort Function
    public static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
int min=i;
for(int j=i+1;i<arr.length;i++){
    if(arr[min]>arr[j]){
        min=j;
    }
    
} int temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort(arr);
    }
}
