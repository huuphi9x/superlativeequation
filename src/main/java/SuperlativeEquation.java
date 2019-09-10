import java.util.Scanner;

public class SuperlativeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value of b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            System.out.println("the equation has no solution");
        } else if (b == 0) {
            System.out.println("Equation countless solutions");
        } else {
            double x = -b / a;
            System.out.println("The solution to the equation is: " + x);
        }
    }
}
