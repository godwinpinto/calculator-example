import addition.Addition;
import subtraction.Subtraction;
import multiplication.Multiplication;
import division.Division;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("This is a sample calculator program")
        int num1 = 10;
        int num2 = 5;

        // Perform addition
        int sum = Addition.add(num1, num2);
        System.out.println("Sum: " + sum);

        // Perform subtraction
        int difference = Subtraction.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        // Perform multiplication
        int product = Multiplication.multiply(num1, num2);
        System.out.println("Product: " + product);

        // Perform division
        try {
            double quotient = Division.divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }        
    }
}