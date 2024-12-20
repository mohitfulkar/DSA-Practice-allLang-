package Pattern;

public class Palindrome2 {
    void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Palindrome1 obj = new Palindrome1();
        obj.printPattern(5);
    }

}
