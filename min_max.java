import java.util.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for (int num : arr) {
            long temp = totalSum - num;
            if (temp < minSum) {
                minSum = temp;
            }
            if (temp > maxSum) {
                maxSum = temp;
            }
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        miniMaxSum(arr);
        sc.close();
    }
}
