import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) 
    /*{
    // // Question1 
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
    }*/

    /*{
        // // Question2
        char grade = 'C';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }*/

    {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int a = 64;
        int b = sc.nextInt();
        System.out.println( a>=b );
        sc.close();
    }

    /*{
        Float v = 10f;
        float u = 2f;
        float a = 4f;
        float s = 5f;

        float k = (v*v - u*u) / (2*a*s);
        System.out.println(k);
    }*/

    /*{
        int a = (7*49/7) + (35/7);
        System.out.println(a);
    }*/
}
