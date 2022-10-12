import java.util.Scanner;

public class StudentGrade
{
    public static void main(String[] args)
    {String name;
        int roll;
        double math, science, english, total, percentage, grade;
        System.out.println("Enter student name \t");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        System.out.println("Enter  roll number \t");
        roll = scanner.nextInt();

        System.out.println("Enter  marks for math");
        math = scanner.nextDouble();

        System.out.println("Enter  marks for science");
        science = scanner.nextDouble();

        System.out.println("Enter  marks english");
        english = scanner.nextDouble();

        {System.out.println("Enter  total");
        total = scanner.nextDouble();}
        {System.out.println("percentage=total/3");
        percentage = scanner.nextDouble();
        percentage= total/3;

        {System.out.println("grade is");}
            scanner.close();

        if (percentage >= 35) {
            System.out.println("pass");
        } else if (percentage <= 35) {
            System.out.println("fail");
        } else if (percentage >= 35 && percentage <= 50) {
            System.out.println(" C");
        } else if (percentage >=50 && percentage <=60) {
            System.out.println("B");
        } else if (percentage >= 60 && percentage <= 80) {
            System.out.println("A");
        } else if (percentage >=80) {
            System.out.println(" A +");
        } else {
            System.out.println("Invalid");
        }

    } }}
