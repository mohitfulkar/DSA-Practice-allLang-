package Pattern;

public class InvertedRightTriangle {
    void printPattern(int n){
        for(int i=n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedRightTriangle obj = new InvertedRightTriangle();
        obj.printPattern(6);
    }
}
//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*