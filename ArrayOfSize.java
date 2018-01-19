/*
*  Class used as blueprint 
*  to create objects of
*  arrays with given size. 
*  Mostly important method will 
*  randomize the array
*  with numbers between 0-100.
*/

import java.util.*;


public class ArrayOfSize
{
   private int size;
   private int[] array;
   
   private Random random = new Random();

   public ArrayOfSize()
   {
      size = 0;
      array = new int[size];
   }
   
   public ArrayOfSize(int size)
   {
      this.size = size;
      array = new int[size];
   }
   
   public int getSize()
   {
      return size;
   }
   
   public int[] getArray()
   {
      return array;
   }
   
   public void setSize(int size)
   {
      this.size = size; 
   }
   
   public int[] randomize()
   {
      for(int indexCounter = 0; indexCounter < size; indexCounter++)
         {
            array[indexCounter] = Math.abs(random.nextInt())%100;
         }
      return array;   
   }
   
   public void printArray()
   {
      for(int a : array)
         System.out.println(a);
      System.out.println("------");
   }
   
   public String toString()
   {
      return "Array Size : " + size;
   }
   
}