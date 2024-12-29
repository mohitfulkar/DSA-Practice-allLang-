package JAVA;

import java.util.Scanner;

public class Second_Largest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Create an array and take user input
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the method to find the second largest element
        s_largest(arr);

        scanner.close(); // Close the scanner to release resources
    }

    public static void s_largest(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second largest element. All elements are equal.");
        } else {
            System.out.println("Second Largest Number is: " + smax);
        }
    }
}
