import java.util.Scanner;

public class Commission {

        public static void main(String[] args) {

            String SalesId;
            String SellersName;
            double SalesAmount, SalaryBasic, SalesCommission,Commission;





            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter SalesId \t");
            SalesId = scanner.next();

            System.out.println("Enter SellerName\t");
            SellersName = scanner.next();

            System.out.println("Enter SalesAmount\t");
            SalesAmount = scanner.nextDouble();

            System.out.println("Enter SalaryBasic\t");
            SalaryBasic = scanner.nextDouble();

            if (SalesAmount >= 50000)
            Commission = 0.35;


            else if (SalesAmount >= 30000)
                Commission = 0.20;
            else if (SalesAmount >= 20000)
                Commission = 0.10;

            else if (SalesAmount >= 10000)
                Commission = 0.05;

            else if (SalesAmount < 10000);
                Commission = 0.02;
            SalesCommission = Commission *SalesAmount;
            {System.out.println("The SalesCommission is: "+ SalesCommission);}














        }
    }

