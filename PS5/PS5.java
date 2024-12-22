import java.util.*;

public class PS5 
{
    public static void main(String[] args) 
    {
       /*  {
            //Question1
            int n = 4;
            for(int i=n; i>0; i--){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            } 
        }*/

       /*   {
            //Question2
            System.out.print("Enter a Number: ");
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                sum = sum + (2*i);
            }
            System.out.print("Sum of even numbers is: " +sum);
            sc.close();
        }*/

       /*  {
            //Question3
            System.out.print("Enter a Number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.printf("%d X %d = %d\n ", n, i, n*i);
            } 
            sc.close();
        }*/

        /* {
            //Question4
            int n = 10;
            for(int i=n; i>0; i--){
                System.out.printf("%d X %d = %d\n ",n, i, n*i);
            }
        }*/

       /*   {
            //Question5
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();
            int factorial = 1;
            for(int i=1; i<=n; i++){
                factorial *= i;
            }
            System.out.println("The Factorial of "+n+" is: "+factorial);
            sc.close();
        }*/

       /*  {
            //Question6
            int n = 5;
            int i = 1;
            int factorial = 1;
            while (i<=n) {
                factorial *= i;
                i++;
            }
            System.out.println(factorial);
        }*/

        /*{
            //Question7
            int n = 4;
            int i = n;
        
            while (j>0) {
                int j = 0;
                while (j<i ){
                    System.out.print("*");
                    j++;
                }
                System.out.println(" ");
               i--;
             
        }*/

        /*{
            //Question9
            int n = 8;
            int sum = 0;
            for(int i=1; i<=10; i++){
               sum *= n*i;
            } 
            System.out.println(sum);

        }*/

        {
            //Question11
            System.out.print("Enter a Number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            int i = 0;
            while(i<=n){
                sum = sum + (2*i);
                i++;
            }
            System.out.println(sum);
            sc.close();
            
        }
    } 
}
