// package JAVA;

// public class TwoSum {
//     public static void main(String[] args) {
//         int[] nums = {1, 3, 5, 6, 2};
//         int target = 9;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                    System.out.println("Two numbers are " + nums[i] + " and " + nums[j]);
//                       return; 
//                 }
//             }
//         }

//         System.out.println("No two numbers added:");
//     }
// }


 package JAVA;
 public class TwoSum {
 
    public static int[] twoSum (){
        int nums[]= {1, 3, 5, 6, 2};
        int n=nums.length;
        int target = 9;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return null ;
    }
    public static void main(String[] args) {
        int result[]=TwoSum.twoSum();
        if(result != null){
        System.out.println("the index are: " +  result[0]+ " " + result[1] );
    }
    else{
        System.out.println("No solution found.. ");
    }
}
 }
