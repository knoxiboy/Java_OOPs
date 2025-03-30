package CodeWithHarry.java;

import java.util.Scanner;
import java.util.Random;

class Game{
    int input, noOfGuesses, ans;

    public Game(){
        Random random = new Random();
        ans = random.nextInt(100);
    }

    public void takeUserInput(int n){
        input = n;
    }

    public Boolean isCorrectNumber(){
        noOfGuesses++;
        if(input == ans){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", input, noOfGuesses);
            return true;
        }
        else if(input < ans){
            System.out.println("Too low...");
        }
        else if(input > ans){
            System.out.println("Too high...");
        }
        return false;
    }

}

public class GuessTheNo{
    public static void main(String[] args) {
        Game one = new Game();
        boolean b= false;
        while(!b){
            System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            one.takeUserInput(n);
            b = one.isCorrectNumber();
        }



    }
}
