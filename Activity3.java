import java.util.Scanner;

public class Activity3 {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     
     System.out.print("Enter First Integer: ");
     int num1st = input.nextInt();
     
     System.out.print("Enter Second Integer: ");
     int num2nd = input.nextInt();
     
     int sum = num1st + num2nd;
     System.out.println("Sum: " + sum);
     int diffrence = num1st - num2nd;
     System.out.println("Diffrence: " + diffrence);
     int product = num1st * num2nd;
     System.out.println("Product: " + product);

    }
}