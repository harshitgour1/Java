//  import java.util.*;

public class PS6 
{
 public static void main(String[] args) 
  {
    /*{
     //Question1
     float [] marks = {55.6f,22.4f,98.3f,45.2f,33.6f};
     float sum = 0;
     for(float element:marks){
        sum = sum + element; 
     }
     System.out.println("The Total is: "+ sum);
    }*/

    /*  {
        //Question2
       Scanner sc = new Scanner(System.in);
        int [] first = {55,66,87,45,23,96,25,14,0,256,59,22,41,26};
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int element:first){
            if (num==element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in array.");
        }else{
                System.out.println("The value is not present.");
        }
        sc.close();
    }*/
        
    /*{
        //Question3
        float [] marks = {55.6f,22.4f,98.3f,45.2f,33.6f};
        float sum = 0;
        for(float element:marks){
           sum = sum + element; 
        }
        float avg = sum / marks.length;
        System.out.println("The Average of the Total marks is: "+ avg);
    }*/

    /*{
        //Question4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

    }*/

    /*{
        //Question5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
    }*/

    {
        //Question6
        // int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        // int max = Integer.MIN_VALUE;
        // for(int e: arr){
            // if(e>max){
                // max = e;
            // }
        // }
        // System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 7
        // int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        // int min = Integer.MAX_VALUE;
        // for(int e: arr){
            // if(e<min){
                // min = e;
            // }
        // }
        // System.out.println("the value of the minimum element in this array is: "+ min);
        
    }

    {
        //Question8
        boolean isSorted = true;
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        for(int i=0;i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Given array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
  }
  
}   

