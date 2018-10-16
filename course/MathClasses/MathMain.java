import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Math taskFactorial = new Math();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер желаемого факториала:");
        int number = in.nextInt();
        if (number >= 0){
            taskFactorial.calculateFactorialFirst(number);
            taskFactorial.calculateFactorialSecond(number);
            System.out.println("Факториал числа " +number+" = "+taskFactorial.calculateFactorialSecond(number));
            System.out.println("Факториал НОМЕР ДВА числа " +number+" = "+taskFactorial.calculateFactorialSecond(number));
        }
        else {
            System.out.println("Сорри, гамма-функцию считать неохота");
        }
    }
}
