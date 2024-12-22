class Employee{
        int id;
        String name;
        int salary;

        public void getdetails(){
            System.out.println("My id is " + id);
            System.out.println("My name is "+ name);
        }
        public int getsalary(){
            return salary;
        }
}    
public class lec38 {
        public static void main(String[] args) {
        Employee harshit = new Employee(); //Instantation of new object
        Employee john = new Employee();
        //Setting Attributes
        harshit.id = 15; 
        harshit.name = "Harshit";
        harshit.salary = 30000;

        john.salary = 40000;
        john.id = 16;
        john.name = "John Tripathi";
        //Printing the attributes
        // System.out.println(harshit.id);
        // System.out.println(harshit.name);
        harshit.getdetails();
        john.getdetails();

        int salary = john.getsalary(); //object 
        System.out.println(salary);
    }
}
