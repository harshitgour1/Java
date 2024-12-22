// Question1,2

// abstract class Pen{
//     abstract void write();
//     abstract void refill();
// }
// class FountainPen extends Pen{
//     @Override
//     void write(){
//         System.out.println("Writing.");
//     }
//     @Override
//     void refill(){
//         System.out.println("Refill the pen..");
//     }
//     void changeNib(){
//         System.out.println("Change the pen nib...");
//     }
// }
// public class PS11 {
//     public static void main(String[] args) {
//         FountainPen one = new FountainPen();
//         one.write();
//         one.changeNib();
//         one.refill();
//     }
// }

// Question 3,5
// class Monkey{
//     void jump(){
//         System.out.println("Monkey is jumping");
//     }
//     void bite(){
//         System.out.println("Monkey is taking bite");
//     }
// }
// interface BasicAnimal{
//     public void eat();
//     public void sleep();
// }
// class Human extends Monkey implements BasicAnimal{
//     void speak(){
//         System.out.println("Speaking.....");
//     }
//     @Override
//     public void eat(){
//         System.out.println("Eating");
//     }
//     @Override
//     public void sleep(){
//         System.out.println("Sleeeping");
//     }
// }
// public class PS11 {
//     public static void main(String[] args) {
//         Human a1 = new Human();
//         Monkey m1 = new Human();  //It can eat, sleep,jump,bite but couldn't speak
//         a1.jump();
//         a1.bite();
//         a1.eat();
//         a1.sleep();
//         a1.speak();
//     }
// }

// Question 4

// abstract class Telephone{
//     abstract void ring();
//     abstract void lift();
//     abstract void disconnect();
// }
// class SmartTelephone extends Telephone{
//     void camera(){
//         System.out.println("Opening camera");
//     }
//     void music(){
//         System.out.println("Opening music app");
//     }
//     void ring(){
//         System.out.println("Phone is ringing");
//     }
//     void lift(){
//         System.out.println("lifting the phone");
//     }
//     void disconnect(){
//         System.out.println("Disconnecting the call");
//     }
// }
// public class PS11 {
//     public static void main(String[] args) {
//         Telephone vivo = new SmartTelephone();
//         // vivo.camera(); Telephone doesn't have camera or musis app
//         // vivo.music();
//         vivo.ring();
//         vivo.lift();
//         vivo.disconnect();
//     }
// }

// Question 6,7
interface TvRemote{
    public void on();
    public void off();
    public void mute();
}
interface SmartTvRemote extends TvRemote{
    public void netflixbutton();
    public void primebutton();
    public void cursor();
}
class Tv implements TvRemote{
    public void on(){
        System.out.println("On");
    }
    public void off(){
        System.out.println("Off");
    }
    public void mute(){
        System.out.println("Mute");
    }
    public void cursor(){
        System.out.println("Cursor");
    }
}
public class PS11 {
    public static void main(String[] args) {
        Tv led = new Tv();
        led.cursor();
    }
}