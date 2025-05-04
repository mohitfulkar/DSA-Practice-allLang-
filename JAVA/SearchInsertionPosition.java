package JAVA;

import java.util.Scanner;

public class SearchInsertionPosition {
    public static int search_index(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 12, 13 };
        int num = read();
        int result = search_index(arr, num);
        System.out.println("Corrent index is : " + result);
    }

    private static int read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target number:");
        return scan.nextInt();
    }
}