// class MyMainEmployee{
//     // private int id;
//     // private String name;

//     // public MyMainEmployee(){
//     //     id = 0;
//     //     name = "Your-Name-Here";
//     // }
//     // public MyMainEmployee(String myName, int myId){
//     //     id = myId;
//     //     name = myName;
//     // }
//     // public MyMainEmployee(String myName){
//     //     id = 1;
//     //     name = myName;
//     // }
//     Employee(String i, int a, int b ){
//         System.out.println("The name of the second employee is : " + i);
//         System.out.println("The id of the second employee is : " + a);
//         System.out.println("The Salary of Second employee is: "+ b);
//     }
// }

// public class lec42 {
//     public static void main(String[] args) {
//         //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
//          MyMainEmployee harry = new MyMainEmployee();
//         // //harry.setName("CodeWithHarry");
//         // //harry.setId(34);
//         // System.out.println(harry.getId());
//         // System.out.println(harry.getName());

//         Employee steve = new Employee("Stevejobs", 12 ,10000);
//     }
// }
class Employee1 {
    // First constructor
        Employee1(String s, int i){
            System.out.println("The name of the first employee is : " + s);
            System.out.println("The id of the first employee is : " + i);
        }
    //    Constructor overloaded
        Employee1(String s, int i, int salary){
            System.out.println("The name of the second employee is : " + s);
            System.out.println("The id of the second employee is : " + i);
            System.out.println("The salary of second employee is : " + salary);
        }
    
    }
    public class lec42 {
        public static void main(String[] args) {
            Employee1 a = new Employee1("Steve jobs", 12);
            System.out.println(a);
            Employee1 b = new Employee1("Justin Bieber", 13, 10000);
            System.out.println(b);
        }
    }
    


