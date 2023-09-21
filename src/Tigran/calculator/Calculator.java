package Tigran.calculator;

public class Calculator {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;

        MathematicalOperation addition = new Addition();
        MathematicalOperation substraction = new Substraction();
        MathematicalOperation multiplication = new Multiplication();
        MathematicalOperation division = new Division();

        MathematicalOperation[] mathematicalOperations = new MathematicalOperation[] {
                addition,
                substraction,
                multiplication,
                division
        };
        for (MathematicalOperation mathematicalOperation : mathematicalOperations) {
            System.out.println(mathematicalOperation.calculate(numberOne, numberTwo));
        }
    }
}
