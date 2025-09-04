import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        sc.close();
    }
}
