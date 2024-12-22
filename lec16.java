import java.util.Scanner;

public class lec16 
{
    public static void main(String[] args) 
    {
        
     //        int a = 0;
     //        while(a<5){
     //            System.out.println(a);
     //            a++;
     //        }
       /*  int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5); */

        /* int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45); */

        //Quiz
        int j;
        j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number natural numbers to print: ");
        int n = sc.nextInt();
        sc.close();
        do {
            System.out.println(j);
            j++;
        } while (j<=n);
    }
}

