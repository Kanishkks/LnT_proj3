import java.util.Scanner;
import add;
import sub;
import mul;
import div;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = add.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = sub.sub(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = mul.mul(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = div.div(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}