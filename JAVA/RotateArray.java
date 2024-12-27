package JAVA;

public class RotateArray {
      public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7};
    int num =3;
    System.out.println("Array Before Rotated: ");
    for(int item: arr){
        System.out.print(" "+item);
    }
    
    rotate(arr,num);
    System.out.println();
    
    System.out.println("Array After Rotated: ");
    for(int item:arr){
        System.out.print(" "+item);
    }
}
public static void rotate(int arr[],int num){
    int len = arr.length;
   num = num %len  ;
   
   int temp[] =new int[num];
   for (int i = 0; i < num; i++) {
        temp[i] = arr[i];
    }
   
   for(int i=num;i<len;i++){
       arr[i-num]=arr[i];
   }
   
   for(int i=0;i<num;i++){
       arr[len-num+i]=temp[i];
   }
}
}
