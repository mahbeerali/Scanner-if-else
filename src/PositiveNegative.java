import java.util.Scanner;

public class PositiveNegative {
    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input any number:");
        int number = scanner.nextInt();
        if (number > 0)
        {System.out.println(number+ " is a positive number");}
        else if (number < 0)
        {System.out.println(number+ " is a negative number");}
         else
        {System.out.println(number+ " is zero");}

        }





    }

