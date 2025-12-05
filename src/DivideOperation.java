public class DivideOperation {
    public static double divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double)a / b;
    }
}