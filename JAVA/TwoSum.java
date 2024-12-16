package JAVA;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 2};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Two numbers are " + nums[i] + " and " + nums[j]);
                  //  System.out.println("Indices: " + i + ", " + j);
                    return; 
                }
            }
        }

        System.out.println("No two numbers added:");
    }
}
