//Problem--1
// class Employee{
//     int salary;
//     String name;

//     public int getsalary(){
//         return salary;
//     }
//     public String getname(){
//         return name;
//     }
//     public void setname(String n){
//         name = n;
//     }
// }

// public class PS8 {
//     public static void main(String[] args) {
//         Employee harsh = new Employee();
//         harsh.setname("Harshit");
//         System.out.println("My name is " +harsh.getname());
//         harsh.salary =30000;
//         System.out.println("My salary is "+harsh.salary);
//     }
// }

//Problem--2
/*class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling Jayesh...");
    }
}
public class PS8 {
    public static void main(String[] args) {
        cellphone vivo = new cellphone();
        vivo.callfriend();
        vivo.vibrating();
        vivo.ringing();
    }
}*/

//Problem--3
// class square{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//         return 4*side;
//     }
// }
// public class PS8 {
//     public static void main(String[] args) {
//         square box = new square();
//         box.side = 5;
//         System.out.println(box.area());
//         System.out.println(box.perimeter());
//     }
// }

//Problem--4
// class rectangle{
//     int length;
//     int breadth;
//     public int area(){
//         return length*breadth;
//     }
//     public int perimeter(){
//         return (length+breadth)*2;
//     }
// }
// public class PS8 {
//     public static void main(String[] args) {
//         rectangle rc = new rectangle();
//         rc.length = 5;
//         rc.breadth = 10;
//         System.out.println(rc.area());
//         System.out.println(rc.perimeter());
//     }
// }

//Problem--5
// class TommyVecetti{
//     public void hit(){
//         System.out.println("Hitting....the enemy");
//     }
//     public void run(){
//         System.out.println("Running.. from the enemy");
//     }
//     public void Fire(){
//         System.out.println("firing... to the enemy");
//     }
// }
// public class PS8 {
//     public static void main(String[] args) {
//         TommyVecetti First = new TommyVecetti();
//         First.hit();
//         First.run();
//         First.Fire();
//     }   
// }

//Problem--6
class circle{
    float pi = 3.14f;
    float radius;
    float diameter;

    public float area(){
        return pi*(radius*radius);
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}

public class PS8 {
    public static void main(String[] args) {
        circle first = new circle();
        first.radius = 5.5f;
        first.diameter = 6f;
        System.out.println("The area of circle is "+ first.area()+"cm");
        System.out.println("The perimeter of circle is "+first.perimeter()+"cm");
    }    
}