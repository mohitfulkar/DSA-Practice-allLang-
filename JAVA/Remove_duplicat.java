package JAVA;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

       
        int newLength = removeDuplicate(arr);

    
        int[] resultArray = Arrays.copyOf(arr, newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
        
        
    }

    public static int removeDuplicate(int arr[]) {
        int n = arr.length;

       
        if (n == 0) {
            System.out.println("Array is empty.");
            return 0;
        }
        
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
