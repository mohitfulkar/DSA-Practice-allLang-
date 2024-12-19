package JAVA;

public class MergeSort {
       public static void main(String[] args){
            int arr[]={5,8,3,1,2};
            int n = arr.length;
            Divide(arr,0,n-1);
            for(int i =0;i<n;i++){
                System.out.print(arr[i]+ " ");
            }
       }
       public static void Divide(int arr[], int low, int high){
        if(low>=high){
            return ;
        }
        int mid =low+ (high-low)/2 ;

        Divide(arr,low,mid);
        Divide(arr,mid+1,high);
        Conquer(arr,low,mid,high);
       }

       public static void Conquer(int arr[], int low, int mid,int high){
           int temp[]=new int[high-low+1];
           int k =0 ;
           int left = low ;
           int right = mid+1 ;

           while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }
            else{
                temp[k++]=arr[right++];
            }
           }
           while(left<=mid){
            temp[k++]=arr[left++];
           }
           while(right<=high){
            temp[k++]=arr[right++];
           }
        for(int i =0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
       
       
        }  
}


