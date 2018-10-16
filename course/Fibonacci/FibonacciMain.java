import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciSolver taskFibonacci = new FibonacciSolver();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер желаемого числа Фибоначчи:");
        int number = in.nextInt();
        taskFibonacci.calculateFibonacci(number);
        System.out.println(number+" число Фибоначчи – это "+taskFibonacci.calculateFibonacci(number));
    }
}
