import java.util.*;
public class BasicCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double y = sc.nextDouble();

        switch (operator) {
            case 1:
                System.out.println("Result: " + (x + y));
                break;
            case 2:
                System.out.println("Result: " + (x - y));
                break;
            case 3:
                System.out.println("Result: " + (x * y));
                break;
            case 4:
                if (y != 0) {
                    System.out.println("Result: " + (x / y));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
