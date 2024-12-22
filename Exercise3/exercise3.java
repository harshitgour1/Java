import java.util.Scanner;
import java.util.Random;

class game{
    public int computerInput,userGuess, No_of_Guesses=0;

    public game(){
        Random random = new Random();
        computerInput=random.nextInt(100);
    }

    public void userinput(int num){
        userGuess = num;
    }

    public boolean Iscorrectnumber(){
        if (userGuess > computerInput) {
            System.out.println("You have choosen bigger no.");
            No_of_Guesses = No_of_Guesses+1;
            return false;
        }
        else if(userGuess < computerInput){
            System.out.println("You have choosen Lesser no.");
            No_of_Guesses = No_of_Guesses+1;
            return false;
        }
        else{
            System.out.println("Your Guess is correct");
            No_of_Guesses = No_of_Guesses+1;
            return true;
        }
    }
    
    public void numbofguess(){
        System.out.println("The no. of Guesses/Score is: "+ No_of_Guesses);
    }
}

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME ! ");
        
        game player = new game();
        System.out.println("Guess the Number from 0 to 100 : ");
        player.userinput(sc.nextInt());

        while(!player.Iscorrectnumber()){
            System.out.println("Guess the Number Again");
            player.userinput(sc.nextInt());
        }
        player.numbofguess();
        sc.close();
    }
}
