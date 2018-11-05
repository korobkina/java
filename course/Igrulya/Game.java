package eiden.igrulya;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public void start() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        Scanner in = new Scanner(System.in);

        System.out.println("приветики сыграем в игру");
        System.out.println("я загадал число от 0 до 10. какое число я загадал?))) ");
        int attempt;
        for (int i = 1; i < 4; i++) {
                try {
                    attempt = in.nextInt();

                if (attempt > number) {
                    System.out.println("меньше!!");
                } else if (attempt < number) {
                    System.out.println("больше!!");
                } else if (attempt == number) {
                    System.out.println("круто !! ты угадал с " + i + " попытки");
                    System.exit(0);
                }
                } catch (InputMismatchException s) {
                    System.out.println("\n" +"Попробуй в следующий раз ввести ЦИФРУ, а пока что ты проиграл");
                    System.exit(0);

                }

        }

            System.out.println("эх ты проиграл, число равно " + number + ", глупые кожаные мешки");
        }

}
