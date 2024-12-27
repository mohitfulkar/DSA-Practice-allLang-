package JAVA;

class Remove_Duplicate {
    public static void main(String[] args) {
       int arr[]={1,1,1,2,2,5,9};
       int newlength = removeduplicate (arr);
       
       System.out.println("Array :");
       for(int i=0;i<newlength;i++){
           System.out.print(" "+arr[i]);
       }
       
    }
    public static int  removeduplicate(int arr[]){
        int n= arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}