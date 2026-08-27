import java.util.Scanner;
import java.util.Random;
public class Rock {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.printf(" %n");
    System.out.printf("Choose rock, paper, or scissors %n");
    String playerInput = scanner.nextLine();
    playerInput = playerInput.toLowerCase(); 
    int player = -1 ; 
    if (playerInput.equals("rock")){
        player = 0;
    }
    else if (playerInput.equals("paper")){
        player = 1;
    }
    else if (playerInput.equals("scissors")){
        player = 2;
    }
    int computer = random.nextInt(0 , 3);
    if (computer == 0){
        System.out.printf("Computer Chose Rock");
    }
    else if (computer == 1){
        System.out.printf("Computer Chose Paper");
    }
    else {
        System.out.printf("Computer Chose Scissors");
    }
    System.out.printf(" %n");
    int answer = (( player - computer + 3) % 3);
    if (answer == 0 ){
        System.out.printf("Tie");
    }
    else if (answer == 1){
        System.out.printf("You Win");
    }
    else if (answer == 2){
        System.out.printf("You lose");
    }
  }
}
