import java.util.Scanner;

public class CityName
 {

        public static void main (String[] args)
        {
            String alphabet;
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter between  a to f:");
            alphabet = scanner.next();

            switch (alphabet){
                case "a" :
                    System.out.println("Aberdeen");
                    break;
                case "b" :
                    System.out.println("Beijing");
                    break;
                case "c" :
                    System.out.println("Cairo");
                    break;
                case "d" :
                    System.out.println("Dover");
                    break;
                case "e" :
                    System.out.println("Edmonton");
                    break;
                case "f" :
                    System.out.println("Florance");
                    break;

                    default:
                    alphabet ="Invalid entry";




            } return;









        }    }
