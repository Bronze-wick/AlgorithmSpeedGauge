/*
*  Entirely static field that allow for calls of selection sorting method.
*  Also calculates the length of execution time of the algothrim.
*  Currently only contains the selection sort method. 
*/

public class Sort
{
   private static int[] array;//holds array 
   private static long sortingTime;//endTime minus startTime
   
   public static long getSortingTime()
   {
      return sortingTime;//sortingTime is initalized in selectionSort()
   }

   /*
   * Returns the index of the smallest value in
   * values[startIndex]..values[endIndex].
   */
   public static int minIndex(int startIndex, int endIndex)
   {
      int indexOfMin = startIndex;
      for (int index = startIndex + 1; index <= endIndex; index++)
         if (array[index] < array[indexOfMin])
            indexOfMin = index;
      return indexOfMin;
   }
   
   /*
   * Sorts the values array using the selection sort algorithm.
   * Using static method swap to sort ascending.
   */
   public static void selectionSort(int[] passedArray)
   {
      array = passedArray;

      long startTime = System.nanoTime();
      
      int endIndex = array.length - 1;
      for (int current = 0; current < endIndex; current++)
         swap(current, minIndex(current, endIndex));
        
      long endTime = System.nanoTime();
      
      sortingTime = (endTime - startTime);
   }
   
   /*
    *  Precondition: index1 and index2 are >= 0 and < size.
    *  Swaps the integers at locations index1 and index2 of the values array. 
    *  Allows for switching of lowest number with the current location
    *  of the algorithim. Sorts accending.
    */
   static public void swap(int index1, int index2)
   {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
   }

}