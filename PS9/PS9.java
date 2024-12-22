//Question 1
// class Cylinder{
//     int radius;
//     int height;

//     public int getRadius(){
//         return radius;
//     }
//     public void setRadius(int radius){
//         this.radius = radius;
//     }
    
//     public int getheight(){
//         return height;
//     }
//     public void setheight(int height){
//         this.height = height;
//     }
// }

// public class PS9 {
//     public static void main(String[] args) {
//         Cylinder mycylinder = new Cylinder();
//         mycylinder.setheight(12);
//         int h = mycylinder.getheight();
//         System.out.println(h);
//         mycylinder.setRadius(20);
//         System.out.println(mycylinder.getRadius());
//     }
// }

//Question 2
// class Cylinder{
//     private int radius;
//     private int height;
    
//     public int getRadius(){
//          return radius;
//      }
//      public void setRadius(int radius){
//          this.radius = radius;
//      }
        
//      public int getheight(){
//          return height;
//      }
//      public void setheight(int height){
//          this.height = height;
//      }
   
//      public double volume(){
//         return Math.PI*radius*radius*height;
//      }

//      public double surfacearea(){
//         return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
//      }
//  }
    
//  public class PS9 {
//      public static void main(String[] args) {
//          Cylinder mycylinder = new Cylinder();
//          mycylinder.setheight(12);
//          mycylinder.setRadius(20);
//          mycylinder.volume(); 
//          System.out.print("The surfacearea of cylinder is: ");
//          System.out.println(mycylinder.surfacearea());
//          System.out.print("The volume of cylinder is: ");
//          System.out.println(mycylinder.volume());
//      }
//  }

//Question 3
// class Cylinder{
//     private int radius;
//     private int height;

//     public Cylinder(int radius, int height){     //Added  a constructor
//         this.radius = radius;
//         this.height = height;
//     }
    
//     public int getRadius(){
//          return radius;
//      }
//      public void setRadius(int radius){
//          this.radius = radius;
//      }
        
//      public int getheight(){
//          return height;
//      }
//      public void setheight(int height){
//          this.height = height;
//      }
   
//      public double volume(){
//         return Math.PI*radius*radius*height;
//      }

//      public double surfacearea(){
//         return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
//      }
//  }
    
//  public class PS9 {
//      public static void main(String[] args) {
//          Cylinder mycylinder = new Cylinder(20, 12);  //Direct calling constructor
//          mycylinder.volume(); 
//          System.out.print("The surfacearea of cylinder is: ");
//          System.out.println(mycylinder.surfacearea());
//          System.out.print("The volume of cylinder is: ");
//          System.out.println(mycylinder.volume());
//      }
//  }

 //Question 4
// class Rectangle{
//     private int length;
//     private int breadth;

//     public Rectangle(){
//         this.length = 4;
//         this.breadth = 5;
//     }
//     public Rectangle(int length , int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }
//     public int getlength(){
//         return length;
//     }
//     public int getbreadth(){
//         return breadth;
//     }
// }
//  public class PS9 {
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle(12, 15);
//         System.out.println(r.getlength());
//         System.out.println(r.getbreadth());
//         }
//     }

// Question 5
class Sphere{
    private int radius;
    private int diameter;
    
    public Sphere(int radius, int diameter){     //Added  a constructor
        this.radius = radius;
        this.diameter = diameter;
    }
        
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
            
    public int getdiameter(){
        return diameter;
    }
    public void setdiameter(int diameter){
        this.diameter = diameter;
    }
       
    public double volume(){
        return (4.0/3.0)*(Math.PI*radius*radius*radius);
    }
    
    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }
}
        
 public class PS9 {
      public static void main(String[] args) {
          Sphere mySphere = new Sphere(20, 12);  //Direct calling constructor
          System.out.print("The surfacearea of Sphere is: ");
          System.out.println(mySphere.surfacearea());
          System.out.print("The volume of Sphere is: ");
          System.out.println(mySphere.volume());
      }
    } 
