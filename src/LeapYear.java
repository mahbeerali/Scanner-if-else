import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your LeapYear");
        int year = scanner.nextInt();
        // if the year is divided by 4
        if ((year % 4 == 0) && (year % 100 == 0))  //LeapYear

        {
            System.out.println("year " + "  is a LeapYear");
        }
        else
         {
            System.out.println("not a LeapYear");
         }
    }


}





