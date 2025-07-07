import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        
        Random random = new Random();
         int low =1;
         int high = 100;
        int randomNumber = random.nextInt(high - low + 1) + low;

        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose a number between 1 and 100.");
        int attempts = 1;
        int guess;
        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess < randomNumber){
                System.out.println("Warmer");
            attempts++;
            }
            else if (guess > randomNumber){
                System.out.println("Colder");
                attempts++;
            }
        }
        while (guess != randomNumber);
        System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
        }
    }
