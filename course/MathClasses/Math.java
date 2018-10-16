public class Math {
    public void calculateFactorialFirst (int number){
        int factorial = 1;
        for (int i = 1; i < number + 1; i++){
            factorial *= i;
        }
        System.out.println("Факториал числа " +number+" = "+factorial);
    }
    public int calculateFactorialSecond (int n){
        int factorial;
        if (n == 1) {
            return 1;
        }
        factorial = calculateFactorialSecond(n - 1) * n;
        return factorial;
    }
}

