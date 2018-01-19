import java.util.*;

public class ScratchPaper
{//start class
   public static void main(String[] args)
   {
      int outerBoundXAXIS = 3; //Both the number of arrays, and the quantities of values (example: nth array will have n unsorted values)
      Random random = new Random();
      
      
      /* 
      *  This makes up the range of all nonnegative integers Z-* to outerBoundXAXIS variable.
      *  The numbers will represent the size of the unsorted array.
      */ 
      for(int i = 1; i <= outerBoundXAXIS; i++)
      {
         //create array of int index size of i, the counter in the first for loop
         int[] array = new int[i];
         for(int j = 0; j <= i; j++)
         {
            if(j<i){                                      //if the array has not filled up, then keep adding random numbers
               array[j] = Math.abs(random.nextInt())%100; //assigns random numbers 0-100 to the unsorted array
               System.out.println(array[j]);
              } 
             
         }
    
      }
      
       
   }
}//end class

// print out all array values
// for(int v: array){
//          System.out.print("--Unsorted--");
//          System.out.println(v);
//                  }