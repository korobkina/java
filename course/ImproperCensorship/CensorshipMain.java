import java.util.Scanner;

public class CensorshipMain {
    public static void main(String[] args) {
        Censorship censor = new Censorship();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше выражение:");
        String lineToBeCensored = in.nextLine();
        censor.censored(lineToBeCensored);
        System.out.println(censor.censored(lineToBeCensored));
    }
}
