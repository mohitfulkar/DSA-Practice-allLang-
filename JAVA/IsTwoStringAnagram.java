import java.util.Arrays;
import java.util.Scanner;

class IsTwoStringAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

       
        areAnagram(str1, str2);
        
        scanner.close();
    }

    public static void areAnagram(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 != n2) {
            System.out.println("Sorry, strings are not anagrams!");
        } else {
            char[] stri1 = str1.toCharArray();
            char[] stri2 = str2.toCharArray();

            Arrays.sort(stri1);
            Arrays.sort(stri2);

            if (Arrays.equals(stri1, stri2)) {
                System.out.println("Strings are anagrams!");
            } else {
                System.out.println("Sorry, strings are not anagrams!");
            }
        }
    }
}
