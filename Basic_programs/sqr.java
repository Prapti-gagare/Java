import java.util.Scanner;

public class SqrCal
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        double num = sc.nextDouble();
        double square = num*num;
        System.out.println("The square of " + num + " is " + square);
        sc.close();
    }
}
