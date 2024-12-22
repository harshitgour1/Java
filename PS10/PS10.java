//Question1
// class circle1{
//     public int radius;
//     circle1(int r){
//         this.radius = r;
//     }
//     public double area(){
//         return Math.PI*this.radius*this.radius;
//     }

// }
// class Cylinder1 extends circle1{
//     public int height;
//     Cylinder1(int r, int h){
//         super(r);
//         this.height = h;
//     }
//     public double volume(){
//         return (Math.PI*this.radius*this.radius*this.height);
//     }
// }

// public class PS10{
//     public static void main(String[] args) {
//       // circle1 c1 = new circle(12);
//        Cylinder1 a1 = new Cylinder(12,5);
//       // System.out.println(c1.area()); 
//       System.out.println(a1.volume());
//       System.out.println(a1.area());
//     }
// }

//Question2
// class Rectangle1{
//     public int width;
//     public int length;
//     Rectangle1(int w, int l){
//         this.width = w;
//         this.length = l;
//     }
//     public double area(){
//         return width*length;
//     }
// }
// class Cuboid extends Rectangle{
//     public int height;
//     Cuboid(int w,int l, int h){
//         super(w,l);
//         this.height = h;
//     }
//     public double volume(){
//         return width*height*length;
//     }
// }

// public class PS10{
//     public static void main(String[] args) {
//       Cuboid a1 = new Cuboid(20, 10, 15);
//       //Rectangle r1 = new Rectangle(10, 15);
//       System.out.println(a1.area());
//       System.out.println(a1.volume()); 

//     }
// }

// Question4
class Rectangle1{
    public int width;
    public int length;
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getlength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public double area(){
        return width*length;
    }
}
class Cuboid1 extends Rectangle1{
    public int height;
    public int getHeight(){
        return height;
    }
    public void sethHeight(int height){
        this.height = height;
    }
    public double volume(){
        return width*height*length;
    }
}
        
public class PS10{
    public static void main(String[] args) {
       Cuboid1 a1 = new Cuboid1();
       Rectangle1 r1 = new Rectangle1();
       a1.setLength(10);
       a1.setWidth(5);
       a1.sethHeight(15);
       r1.setLength(8);
       r1.setWidth(12);
       System.out.println("The area of Cuboid is: " + a1.area());
       System.out.println("The volume of Cuboid is: " +a1.volume()); 
       System.out.println("The area of rectangle is: " +r1.area());
    }
}
