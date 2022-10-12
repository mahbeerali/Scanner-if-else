import java.util.Scanner;

public class GrossSalary
{


        double basicsalary, hra, da, ta, pf, gross;// declare global variable
        int id;
        String name;
        public  void print() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the employee name: ");
            name=scanner.nextLine();
            System.out.println("Enter the employee id: "); // taking all the input from user
            id=scanner.nextInt();
            System.out.println("Enter the employee salary : ");
            basicsalary= scanner.nextDouble();
        }
        public void count(){//calculate of all programmes counting
        hra=basicsalary* 10/100;
        da= basicsalary*8/100 ;
        ta= basicsalary*9/100 ;
        pf= basicsalary*20/100;
        gross = basicsalary+hra+ta+da-pf;}
        public void display(){// display all the parameter calculation
            System.out.println("HRA= " +hra);
            System.out.println("DA= " +da);
            System.out.println("TA= " +ta);
            System.out.println("PF= " +pf);
            System.out.println("Gross salary= "+gross+ "&\tHRA= "+hra+ "&\tDA= "+da+ "&\tTA= "+ta+ "&\tPF= "+pf );

        }
        public static void main(String[] args) {
            GrossSalary grossSalary = new GrossSalary();//calling object
            grossSalary.print();// calling print function
            grossSalary.count();// calling count function
            grossSalary.display();// calling display function
        }










    }




