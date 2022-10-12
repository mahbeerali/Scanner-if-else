import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter number here"); // check if the number is Odd or Even
        int number = scanner.nextInt();
        String check = (number % 2 == 0) ? "Even" : "Odd";// turnery operator ?:
        System.out.println("This given number\t" + number + "\tis : " + check);
    }
}
