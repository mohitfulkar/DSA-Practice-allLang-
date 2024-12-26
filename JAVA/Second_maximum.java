 package JAVA;
public class Second_maximum {
    public static void main(String args[]){
        int arr[] ={23,5,46,71,3,57};
        s_largest(arr);
    }
    public static void s_largest(int arr[] ) {
        int n =arr.length ;
        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        if(n<2){
            System.out.println("Array must contain at least 2 numbers.");
        }
        
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i] != max){
                smax=arr[i];
            }
        }
        if (smax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second Largest Number is: " + smax);
        }
    }
}
 
