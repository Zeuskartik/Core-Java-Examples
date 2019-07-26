package coreJava;


public class Insertionsort
{

 public void sort(int arr[])
 {
     int n = arr.length;
     for (int i=1; i<n; ++i)
     {	
    	 //System.out.println("i "+i);
         int element = arr[i];
         int j = i-1;
         while (j>=0 && arr[j] > element)
         {
             arr[j+1] = arr[j];
             j = j-1;
         }
         arr[j+1] = element;
     }
 }

 
 public static void printArray(int arr[])
 {
     int n = arr.length;
     System.out.println("\nArray after insertion sort - >");
     for (int i=0; i<n; ++i)
      System.out.print(arr[i] + " ");

     System.out.println();
 }

 
 public static void main(String args[])
 {        
     int arr[] = {12, 11, 13, 5, 6};
     System.out.println("Array before insertion sort - >");
     for(int g=0;g<arr.length;g++) {
    	 System.out.print(arr[g]+" ");
     }
     Insertionsort y = new Insertionsort();        
     y.sort(arr);
     printArray(arr);
 }
} 