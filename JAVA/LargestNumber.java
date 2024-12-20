package JAVA;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 19, 20};
        int biggestNumber = arr[0];
           for (int i = 1; i < arr.length; i++) {  
                 if (arr[i] > biggestNumber) {
                biggestNumber = arr[i];
            }
        }
        System.out.println("The biggest number is:" + biggestNumber);
    }
}
