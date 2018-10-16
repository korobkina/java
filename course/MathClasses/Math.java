public class Math {
    public int calculateFactorialFirst (int number){
        int factorial = 1;
        for (int i = 1; i < number + 1; i++){
            factorial *= i;
        }
        return factorial;
    }
    public int calculateFactorialSecond (int n){
        int factorial;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        factorial = calculateFactorialSecond(n - 1) * n;
        return factorial;
    }
}


