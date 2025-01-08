import java.util.Scanner;

public class RightRotateArray {
    public static void oneRightRotate(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
        }
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter an Array Value : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        oneRightRotate(arr);

        System.out.print("Array after Right Rotation: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}


