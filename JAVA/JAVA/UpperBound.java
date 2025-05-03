package JAVA;

import java.util.Scanner;

public class UpperBound {
    //method to find upper bounf index from given array
    public static int upper_bound(int[] arr, int target) {
        int low = 0;                    //low as 0th index
        int high = arr.length;          //high as array length index
        int ans = arr.length;           //initial value of a result/ans is array length

        while (low <= high) {                   //while we have low smaller than high
            int mid = low + (high - low)/2;     
            if (arr[mid] > target) {            
                ans = mid;
                high = mid - 1;                 //ignore/remove the right side of the array 
            } else {
                low = mid + 1;                  //ignore/remove the left side of the array 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 12, 12, 13 };
        int num = read();
        int result = upper_bound(arr, num);
        System.out.println("Upper bound index: " + result);
    }

    private static int read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target number:");
        return scan.nextInt();
    }
}