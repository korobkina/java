public class FizzBuzzGame {
    public void startGame(int start, int end){
        for (int index = start; index < end + 1; index ++){
            if (index % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (index % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (index % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(index);
            }

        }

    }

}
