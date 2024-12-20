// 1.  printing  name N times by using recersion ..
// package Recursive_approch;
// class Demo{
//     public static void funct(int n){
//         if(n==10){
//             return ;
//         }
//         System.out.println("Satyam");
//         funct(n+1);
//     }
//     public static void main(String[] args) {
//        int n=0; 
//         Demo.funct(n);

// }
// }

// 2.  printing  lineraly 1-N (1-10) by using recursion ..
// package JAVA ;
// class Recursive_approch{
    
//     public static void funct(int n, int i){
//      if(n>i){
//         return ;
//      }
//      System.out.println(" "+n);
//      funct(n+1,i);
//     }
//      public static void main(String args[]){
//         int n =1 ;
//        // int i=10 ;
//         funct(n,10);
//      }
// }

// 3.printing linearly from N to 1 (10-1) by using recursion .

// package JAVA ;
// class Recursive_approch{
//     public static void funct(int n, int i){
//     if(i<n){
//         return ;
//     }
//    System.out.println(" "+ i);
//     funct(n ,i-1);
// }
// public static void main(String args[]){
//        int n=1;
//     funct(n,10);
// }
// }

// 4. factorial of the number without using recursion ..
// package JAVA ;
// class Recursive_approch{
//     public static void factorial(int fact){
//           for(int i =5;i>=1;i--){
//             fact =fact * i ;
//           }
//           System.out.println(" " + fact);

//           }
//     public static void main(String args[]){
//         int fact = 1 ;
//         factorial(fact);
//     }
// }

// 5. factorial of the number by using recursion ..
// package JAVA ;
// class Recursive_approch {
//     public static void factorial(int fact, int n) {
//         if(n<1){
//             System.out.println("Factorial: " + fact);
//             return;
//         }
//         fact =fact* n;
//         factorial(fact, n-1);
// }
// public static void main(String args[]){
//     int n=5;
//     factorial(1,n);
// }
// }