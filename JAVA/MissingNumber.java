// finding missing number from array of natural numbers

class MissingNumber {
    public static void missing(){
        int[] arr= {1,2,3,4,5,6,7,9};
        int n=arr.length;
        int m=arr.length+1;

        int actualsum=((m)*(m+1))/2;
        
        int arraysum = 0;
        for(int i=0;i<n;i++){
            arraysum+=arr[i];
        }
        
    int difference = actualsum-arraysum;
    System.out.println("missing element is: "+difference);
    }
    public static void main(String[] args) {
        missing();
    }
}

/*
Output:
 missing element is: 8
 */