import java.util.*;

public class PS3 {
    public static void main(String[] args) 
    {
        //Question 1
        // String a = "HarsHit";
        // System.out.println(a.toLowerCase());

        //Question2
        // String b = "this is a string";
        // System.out.println(b.replace(' ','_'));

        //Question3        
         Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // String c = "Dear <|name|> thanks a lot";
        // c = c.replace("<|name|>",a);
        // System.out.println(c);
         sc.close();

        //Question4
        String d = "This is a  string it is   very nice.";
        System.out.println(d.indexOf("  "));
        System.out.println(d.indexOf("   "));

        // Question5
        System.out.println(" \"Dear Harry, This Java Course is nice. Thanks\" ");
    }
}
