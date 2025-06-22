import java.util.Scanner;

public class LongestPalindromeInArray {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Function to find the longest palindrome in array
    public static String findLongestPalindrome(String[] arr) {
        String longest = "";

        for (String str : arr) {
            if (isPalindrome(str)) {
                if (str.length() > longest.length()) {
                    longest = str;
                }
            }
        }

        return longest.isEmpty() ? "No palindrome found" : longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Find and print result
        String result = findLongestPalindrome(arr);
        System.out.println("Longest palindrome in array: " + result);

        sc.close();
    }
}
