import java.util.Arrays;

public class RemoveDuplicateElement{

    public static int RemoveDeplicate(int[] arr, int n){
       
           if(n==0 || n==1){
            return n;
        }
        int[] temp1 = new int[n];
        int j=0;
        int temp;

        // sorting error
        for(int a= 0; a<n; a++){
           for(int k = a+1; k<n; k++){
            if(arr[k]<arr[a]){
                temp = arr[a];
                arr[a] = arr[k];
                arr[k] = temp;
            }
           }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");

        }
        
        // Remove duplicate
        for(int i=0; i<n-1; i++){
            if(arr[i]!= arr[i+1]){
                temp1[j++] = arr[i];

            }
              }
        temp1[j++] = arr[n-1];

        // Copy the unique elements back to the original array
        for(int i = 0; i<j; i++){
            arr[i] = temp1[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,4,5,3};
        int n = arr.length;
        // Arrays.sort(arr);
        int length = RemoveDeplicate(arr,n);
        System.out.println();
        System.out.println("After removing duplicate elements: ");
        for(int i=0; i<length; i++){
            System.out.println(arr[i] + " ");
        }
        
        
      }
}

// Sorted array: 
// 1 1 1 2 2 2 3 3 3 4 4 4 5 5 5      
// After removing duplicate elements: 
// 1
// 2
// 3
// 4
// 5