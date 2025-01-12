import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        if (str1.length() == str2.length()) {
            String str3 = str1 + str1;
            return str3.contains(str2);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
          System.out.println("The strings are rotations of each other.");
      } else {
          System.out.println("The strings are NOT rotations of each other.");
      }
    }
}
  