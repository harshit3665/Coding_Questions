import java.util.*;

public class MaxSubarrayWithPrint {

    public static void findMaxSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        // Output results
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(nums);
    }
}
