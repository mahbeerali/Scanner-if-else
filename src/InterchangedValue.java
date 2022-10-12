import java.util.Scanner;

public class InterchangedValue
{
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y");
        Scanner scanner = new Scanner(System.in);
        //Define variables
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("before interchanged values: "+x+" "+y);
        // interchnged
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After interchanged values: "+x+" "+y);
    }}

