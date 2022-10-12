import java.util.Scanner;

public class Value
   {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any character");
            char char1 = scanner.next().charAt(0);
            if (char1 >= '0' && char1 <= '9') {
                System.out.println("char is digit");
            } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
                System.out.println("char is alphabet");
            } else {
                System.out.println("char is symbol");
            }


        }     }
