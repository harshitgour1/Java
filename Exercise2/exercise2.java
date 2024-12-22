import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your move: ");
        int human = sc.nextInt();
        sc.close();
        switch (human) 
        {
            case 1:
                System.out.println("You have choosen rock.");
                break;
            case 2:
                System.out.println("You have choosen paper.");
                break;
            case 3:
                System.out.println("You have choosen scissors.");
                break;   
            default:
                System.out.println("Please make a valid move.");
                break;    
        }

        int min = 1;
        int max = 3;
        System.out.print("Computer has choosen: ");
        int x = (int)(Math.random()*(max-min+1)+min);
        switch (x) 
        {
            case 1:
                System.out.println("Computer have chosen rock.");
                break;
            case 2:
                System.out.println("Computer have chosen paper.");
                break;
            case 3:
                System.out.println("Computer have chosen Scissors.");
                break;    
        }

        if (human == x){
            System.out.println("Match tie.");
          }
        else if((human == 1 && x == 2)||(human == 2 && x == 3)||(human == 3 && x == 1))
          {
            System.out.println("Computer won!");
         }
        else if((human == 1 && x == 3)||(human == 2 && x == 1)||(human == 3 && x == 2)) {
            System.out.println("Congratulations! You won the game!");
         }
        else if(human >= 4){
            System.out.println("Match cannot be played");
        }
    }
}
