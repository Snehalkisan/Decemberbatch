package MathOperations;

public class Main {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();

        // performing the multiply() method with two arguments
        int productTwoNumbers = operation.multiply(7, 6);
        System.out.println("Product of two numbers (7, 6): " + productTwoNumbers);

        // performing the multiply() method with three arguments
        int productThreeNumbers = operation.multiply(8, 3, 5);
        System.out.println("Product of three numbers (8, 3, 5): " + productThreeNumbers);
    }
}
