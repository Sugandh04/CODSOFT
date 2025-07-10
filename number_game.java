import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {

        Random random = new Random();
        int low = 1;
        int high = 100;

        Scanner sc = new Scanner(System.in);

        int guess;
        int game = 1;

        while (game == 1) {
            int attempts=10;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have 10 attempts at max to guess the number");        
            System.out.println("Choose a number between 1 and 100.");
            int randomNumber = random.nextInt(high - low + 1) + low;
            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                if (guess < randomNumber) {
                    System.out.println("Warmer");
                    attempts--;

                } else if (guess > randomNumber) {
                    System.out.println("Colder");
                    attempts--;

                }
            
            if(attempts<1){
                System.out.println("Out of attempts !");
                break;
            }
                
            } while (guess != randomNumber);

            if(guess==randomNumber){
            System.out.println("You have guessed the number in " + (11-attempts) + "attempts.");
            }
            else{
                System.out.println("Better luck Next time");
            }



            System.out.println("Press 1 to play again");
            game = sc.nextInt();
            if (game != 1) {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
