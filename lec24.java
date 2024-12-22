public class lec24 
{

    //static int sum(int a, int b){
    //return = a + b;
    //}
    //static int sum(int a, int b, int c){
    //return = a + b + c;
    //}
    //static int sum(int a, int b, int c, int d){
    //return = a + b + c + d;
    //}

    static int sum(int x, int ...arr)
    {
        //Available as int[] arr;
        int result=x;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to varagrs tutorial.");
        // System.out.println("The sum of nothing is:" + sum());
        System.out.println("The sum of 1 is:" + sum(1));
        System.out.println("The sum of 2 and 4 is:" + sum(2,4));
        System.out.println("The sum of 8,9 and 5 is:" + sum(8,9,5));
        System.out.println("The sum of 9,18,1,2,3,4,9,7,5,3,4 is: " + sum(9, 18,1,2,3,4,9,7,5,3,4));
    }
 
  /*   static int add(int ...arr)
   {
     int result = 0;
        for (int a : arr){
            result = result + a;
        }
      return result;
    }
    
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }*/
}
