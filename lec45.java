import javax.print.DocFlavor.STRING;

// class Base{
//     public int x;

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         System.out.println("I am in base and setting x now");
//         this.x = x;
//     }

//     public void printMe(){
//         System.out.println("I am a constructor");
//     }
// }

// class Derived extends Base{
//     public int y;

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }
// }

// public class lec45 {
//     public static void main(String[] args) {
//         // Creating an Object of base class
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         // Creating an object of derived class
//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());
//     }
// }

///Quizz

class Animal{
    public String a;

    public String getStringa(){
        return a;
    }
    public void setStringa(String a){
        this.a = a;
    }
}
class Dog extends Animal{
    public String b;

    public String getStringb(){
        return b;
    }
    public void setStringb(String b){
        this.b = b;
    }

}
public class lec45{
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.setStringa("German");
        puppy.setStringb("hybrid");
        System.out.println(puppy.getStringa());
        System.out.println(puppy.getStringb());
    }
}

