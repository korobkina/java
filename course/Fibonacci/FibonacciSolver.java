import static java.lang.Math.*;

public class FibonacciSolver {
    public void calculateFibonacci(int number) {
        double ansFibonacci;
        ansFibonacci = (pow((1 + sqrt(5))/2, number) - pow((1 - sqrt(5))/2, number))/sqrt(5);
        System.out.println(number+" число Фибоначчи – это "+(int) ansFibonacci);
    }
}
