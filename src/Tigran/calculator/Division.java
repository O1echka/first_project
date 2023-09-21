package Tigran.calculator;

public class Division extends MathematicalOperation{
    @Override
    public int calculate(int numberOne, int numberTwo) {
        if(numberTwo == 0) {
            throw new RuntimeException("Cannot divide by zero");
        }
        return numberOne / numberTwo;
    }
}
