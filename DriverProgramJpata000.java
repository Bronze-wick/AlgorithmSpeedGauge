/*
*  Driver Program demonstrates the performance of a
*  quadratic order selection sorting algotithm. 
*  
*  A range of input can be analyzed with a fixed dx.
*  OR
*  Test data of known quantity can be analyzed via an array.
*
*/

public class DriverProgramJpata000
{
   //main method.
   public static void main(String[] args)
   {  
      int smallerNumber = 1000000;
      long bigNumber = 10000000000000000000000000000000000000000000000000;
      System.out.println(bigNumber);
      // runRangeOfData(1000);
      // runTestData();
      // O2ElapsedTime(100);
      //exampleOfSelectionSort(10);
   }
   
   /*
   *  Runs analysis with discrete values
   *  Provide the domain within the testData int[]
   *
   *  Some of the test data was reduced by factor of 10 
   *  to save CPU resources (and time)
   */
   public static void runTestData()
   {
      int[] testData = new int[]{1,2,3,10000,100000,1000000}; 
      
      System.out.println("\nRUNNING TEST DATA");
      printHeader();
      
      for(int i = 0; i < testData.length; i++)
      {
         System.out.printf("%-10s", testData[i]);
         O2ElapsedTime(testData[i]);
      }
   }
   
   /*
   *  Runs analysis with a given right bound
   *  Non-continuous, rather uses a dx of 10.
   * @param rightBound :The most positive domain
   */
      
   public static void runRangeOfData(int rightBound)
   {
         int leftBound = 0;
         int dx = 10;
         
         System.out.println("\nRUNNING RANGE OF DATA");
         printHeader();
         
         for(int n = leftBound; n <= rightBound; n += dx)
         {
            System.out.printf("%-10s", n);
            O2ElapsedTime(n);
         }
       
   }
   
   /*
   * Example of the selection sorting method.
   * Creates array of size n. Randomizes the array.
   * Prints the entire iteration of the UNSORTED array.
   * Executes the selection sort algorithim.
   * Prints the entire iteration of the SORTED array.
   * @param n :Size of the array to be sorted.
   */
   public static void exampleOfSelectionSort(int n)
   {
      ArrayOfSize tempArray = new ArrayOfSize(n);
      tempArray.randomize();
      System.out.println("\nRandomized UNSORTED Array - Size: " + n);
      tempArray.printArray(); 
      Sort.selectionSort(tempArray.getArray());
      System.out.println("\n SORTED Array - Size: " + n);
      tempArray.printArray();
   }
   
   /*
   *  line 1: Utilizes the class ArrayOfSize to create instance of array,
   *  line 2: randomizes the array using non static class
   *  line 3: Utilizes the class Sort to sort the randomized array with a
               selection sort of quadratic power, passing as an argument the
               randomized array of int[] via getArray() non static method of
               the ArrayOfSize class.
   *  line 4: Prints the time it took to sort the array, via the getSortingTime
               method of the Sort class. 
   */
   public static void O2ElapsedTime(int n)
      {
            ArrayOfSize tempArray = new ArrayOfSize(n);
            tempArray.randomize();
            Sort.selectionSort(tempArray.getArray());
            System.out.println(Sort.getSortingTime());
      }
   
   /*
   * Header to columns of Input and Output
   */   
   public static void printHeader()
   {
      String headerOne = "Size";
      String headerTwo = "Nanoseconds";
      System.out.printf("%-9s %-1s", headerOne, headerTwo);
      System.out.print("\n");
      System.out.println("-------------------------");
   }
      
  
}
   