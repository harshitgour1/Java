import java.util.*;

public class lec17 
{
 public static void main(String[] args) 
    {
     /* for (initialize; check_bool_expression; update){

           //code;

     } */

     /*  int i;
     for(i=1; i<=10; i++){
       System.out.println(i);
     }*/

     // 2n = 0,2,4,6...Even numbers
     // 2n+1 = 1,3,5,7...Odd numbers

      {
        //Quiz
        // System.out.print("Enter a Number: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        
        // for(int i=0; i<n; i++){
        // System.out.println(2*i+1);
        // }; 
      }

      // for(int i=5; i>0; i--){
            // System.out.println(i);
      // };
      
      { //Quiz 2
            System.out.print("Enter the total number of natural numbers\n that you want to print in reverse order:  ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();

            for(int i=n; i>0; i--){
                System.out.println(i);
            };
      }
    }   
}
