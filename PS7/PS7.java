import java.util.*;

public class PS7 {

    //Problem --1
    // static void multiplication(int n){
    //     for(int i=1; i<=10; i++){
    //        System.out.format("%d X %d = %d\n", n, i, n*i);
    //     }
    // }
    // public static void main(String[] args) 
    // {
    //     System.out.print("The No. for Table: ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     multiplication(n);
    //     sc.close();
    // }

    //Problem--2
    // static void pattern(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<i+1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.print("\n");
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern(3);
    // }

    // Problem--3
    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n + sum(n-1);
    // }
    // public static void main(String[] args) {
    //     int c = sum(5);
    //     System.out.println(c);
    // }


    // Problem--4
    // static void pattern2(int n){
    //     for(int i=n; i>0; i--){
    //         for(int j=0; j<i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.print("\n");
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern2(5);
    // }

    // Problem--5
    // static int fibonacci(int n){
    //     if(n==1){
    //         return 0;
    //     }
    //     else if(n==2){
    //         return 1;
    //     }else{
    //         return fibonacci(n-1) + fibonacci(n-2);
    //     }   
    // }
    // public static void main(String[] args) {
    //     int result = fibonacci(5);
    //     System.out.println(result);
    // }

    // Problem--6
    // static double avg(int ...arr){
    //     if (arr.length == 0) {
    //         System.out.println("No numbers are provided.");
    //         return 0;
    //     }

    //     int sum = 0;
    //     for(int a: arr){
    //         sum +=a;
    //     }
    //     return (double) sum / arr.length;
    // }

    // public static void main(String[] args) {

    //     System.out.println("The AVG of passed Set of numbers is: " +avg(2,2,5,6,3,4,6,8,1));
    // }

    //Problem --7
    // static void pattern1_rec(int n){
    //     if (n==0) {
    //         return;
    //     }
    //     System.out.print("*");
    //     pattern1_rec(n-1);
    // }
    // static void pattern1_rec1(int rows){
    //     if (rows==0) {
    //         return;
    //     }
    //     pattern1_rec(rows);
    //     System.out.print();
    //     pattern1_rec1(rows-1);
    // }
    // public static void main(String[] args) {
    // pattern1_rec1(4);
    // } 


    // Problem--8
    // static void pattern2_rec(int n){
    //     if (n>0) {
    //         pattern2_rec(n-1);

    //         for(int j=0; j<n; j++){
    //         System.out.print("*");
    //         }
    //         System.out.print("\n");
    //     }
    // }
    // public static void main(String[] args) {
    // pattern2_rec(4);
    // }

    // Problem --9
    // static float temperature(float n){
    //     return (n * 9/5) + 32;
    // }
    
    // public static void main(String[] args) {
    //     System.out.print("Enter the temperature in Celsius: ");
    //     Scanner sc = new Scanner(System.in);
    //     float n = sc.nextFloat();
    //     System.out.println("The temperature in Farenheit: " +temperature(n));
    //     sc.close();
    // }
}

