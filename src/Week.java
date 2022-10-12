import java.util.Scanner;

public class Week
{
    public static void main(String[] args)
    {
        int day = 2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Number"); //taking output from the user
        day=scanner.nextInt();
        switch (day)

        { //using switch case
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("");
                break;

        }

    }

}
