// finding missing number from array of natural numbers
import java.util.*;
class IsPalindrome {
    public static void palindrome(String str){
        
        char[] arr = str.toCharArray();
        int n=arr.length;
        System.out.print("Printing original string: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
        char[] reversed = new char[n];
        for(int i=0;i<n;i++){
            reversed[i]=arr[n-1-i];
        }
        
        System.out.print("Printing reversed string: ");
        for(int i=0;i<n;i++){
            System.out.print(reversed[i]);
        }
        System.out.println();
        
        
        boolean ispalindrome= true;
        for(int i=0;i<n;i++){
            if(reversed[i]!=arr[i]){
                ispalindrome= false;
                break;
            }
        }
        
        if(ispalindrome){
            System.out.println("Given String "+str+" is palindrome");
        }else{
            System.out.println("Given String "+str+" is not palindrome");

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String st = sc.next();
        palindrome(st);
    }
}

/*
 Output:
 Enter The String: eve
Printing original string: eve
Printing reversed string: eve
Given String eve is palindrome

Output:
Enter The String: thing
Printing original string: thing
Printing reversed string: gniht
Given String thing is not palindrome
 */