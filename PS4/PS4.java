import java.util.Scanner;

public class PS4 
{
    public static void main(String[] args) 
    /*{ 
        //Question1
        int a = 10;
        if (a==11) {
            System.out.println("I'm 11");
        }else{
            System.out.println("I'm not 11");
        }    
    }*/

    /*{
        //Question2
        System.out.println("Enter your Marks:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Maths: ");
        int a = sc.nextInt();
        System.out.print("Science: ");
        int b = sc.nextInt();
        System.out.print("Java: ");
        int c = sc.nextInt();

        float avg = (a+b+c)/3.0f;
        System.out.println("Overall Percentage: "+avg);
        
        if (avg>=40 && a>=33 && b>=33 && c>=33) {
            System.out.println("Congrats, You have Promoted!");
        } else{
            System.out.println("You have failed!");
        }
        sc.close();
    }*/

    /*{
       //Question3 Divyansh approach
        Scanner bc = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        int income = bc.nextInt();
        int tax = 0;

        if (income<200000) 
        {
            System.out.println("No tax your gareeb");
        }
         else if ( income>250000&& income<=500000)
        {
            tax=(int)(income*0.05);
            System.out.println(tax);
        }
        else if(income>500000&& income<=1000000)
        {
            tax=(int)(income*0.2);
            System.out.println(tax);
        }
        else
        {
            tax=(int)(income*0.3);
            System.out.println(tax);
        }
        bc.close();

    }*/

    // Question 3
    //{
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter your income in Lakhs per annum");
    //    float tax = 0;
    //    float income = sc.nextFloat();
    //    if(income<=2.5){
    //        tax = tax + 0;
    //    }
    //    else if(income>2.5f && income <= 5f){
    //        tax = (tax + 0.05f * (income - 2.5f))*(100000);
    //    }
    //    else if(income>5f && income <= 10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = (tax + 0.2f * (income - 5f))*(100000);
    //    }
    //    else if(income>10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f * (10.0f - 5f);
    //        tax = (tax + 0.3f * (income - 10.0f))*(100000);
    //    }
    //   sc.close();
    //    System.out.println("The total tax paid by the employee is: " + tax);
    //}

    /*{
        //Question4

        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i==1) {
            System.out.println("Monday");
        }
        else if (i==2) {
            System.out.println("Tuesday");
        }
        else if (i==3) {
            System.out.println("Wednesday");
        }
        else if (i==4) {
            System.out.println("Thrusday");
        }
        else if (i==5) {
            System.out.println("Friday");
        }
        else if (i==6) {
            System.out.println("Saturday");
        }
        else if (i==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Not exist..");
        }
        sc.close();
        
    }*/

    /*{
        //Question5
        System.out.println("Enter the year to be checked");
        Scanner s=new Scanner(System.in);
        int yr= s.nextInt();

        if((yr%4==0 && yr%100!=0)|| yr%400==0)
            System.out.println("Leap year");
        else {
            System.out.println("Not a leap year");
        }
        s.close();
    }*/

    {
        //Question6
        System.out.print("Enter the URL: ");
        Scanner s = new Scanner(System.in);
        String url = s.nextLine();
        s.close();
        if(url.endsWith(".org")){
            System.out.println("This is an organizational website.");
        }
        else if(url.endsWith(".in")){
            System.out.println("This is an government site.");
        }
        else if(url.endsWith(".com")){
            System.out.println("This is an commercial site.");
        }
    } 
    

}
