import java.util.Scanner;

public class Addition {
    public static void main(String[] args)
    { int a,b, opt, add,subtraction,multiplication;
        double division;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();
        while(true)
        {   System.out.println("Enter 1 addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to exit");
            opt = scanner.nextInt();
            switch(opt)
            {case 1:
                add = a+b;
                System.out.println("Result:"+add);
                break;
                case 2:
                    subtraction = a-b;
                    System.out.println("Result:"+subtraction);
                    break;
                case 3:
                    multiplication = a*b;
                    System.out.println("Result:"+multiplication);
                    break;
                case 4:
                    division = a/b;
                    System.out.println("Result:"+division);
                    break;
                case 5:
                    System.exit(0);




            }
    }
}}
