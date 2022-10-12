import java.util.Scanner;

public class UpperCase {
        public static void main (String[] args){
            char x;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter any character");
            x=scanner.next().charAt(0);
            if (x>=65 && x<=90)
            {System.out.println("Upper Case letter" );}
            else if (x>=97 && x<=122)
            {System.out.println("lower Case letter" );}



        }


    }
