import static java.lang.Math.*;

public class FibonacciSolver {
    public int calculateFibonacci(int number) {
        double ansFibonacci;
        if (number >= 0){
            ansFibonacci = (pow((1 + sqrt(5))/2, number) - pow((1 - sqrt(5))/2, number))/sqrt(5);
            return (int) ansFibonacci;
        }
        else {
            ansFibonacci = pow(-1, (number + 1) ) * (pow((1 + sqrt(5))/2, -number) - pow((1 - sqrt(5))/2, -number))/sqrt(5);
            return (int) ansFibonacci;
        }
    }
}
