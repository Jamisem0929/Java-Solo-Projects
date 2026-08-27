import java.util.Scanner;
import java.util.Random;
public class TestScanner{
    static Scanner scanner = new Scanner(System.in);
    static void guessingGame(){
        int difficulty;
        Random random = new Random();
        System.out.printf("Select difficulty 1-3%n");
        difficulty = scanner.nextInt();
        int x = 0; 
        if (difficulty == 1){
            x = 101;
        }
        else if (difficulty == 2){
            x = 501;
        }
        else if (difficulty == 3){
            x = 1001;
        }
        int randInt = random.nextInt(1 , x);
        int count = 0;
        int guess = 0;
        while (guess != randInt){
            System.out.printf("Enter your guess: ");
            guess = scanner.nextInt();  
            count++; 
            if (guess > randInt){
                System.out.printf("Lower%n");
            }
            else if (guess < randInt){
                System.out.printf("Higher%n");
            }
        }
        System.out.printf("You Got It!%n");
        System.out.printf(" number of guesses: %d%n", count);
        }
    public static void main(String[] args){
        int playAgain = 1;
        while ( playAgain == 1){
            guessingGame();
            System.out.printf("Would you like to play again 1 = Yes 2 = No%n");
            playAgain = scanner.nextInt();
        }
    }
}