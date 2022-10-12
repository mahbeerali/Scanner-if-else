import java.util.Scanner;

 //Vowel or Constant in Java
    // input a e i o u are Vowel
    // input b c d etc are consonant
    public class Vowel

{   public static void main(String[] args)
{
    int i=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Character");//taking output from the user
    char ch=scanner.next().charAt(0);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
        System.out.println(ch + "is vowel \t");
    else
        System.out.println(ch + "is consonant \t");


}}