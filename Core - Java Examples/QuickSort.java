package coreJava;

public class QuickSort
{
public static int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = (low-1);
    for (int j=low; j<=high-1; j++)
    {   if (arr[j] <= pivot)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
}
 
 public void sort(int arr[], int low, int high)
 {
if (low < high)
     {
       int xyz = partition(arr, low, high);
       sort(arr, low, xyz-1);
       sort(arr, xyz+1, high);
     }
 }

 
 public static void printArray(int arr[])
 {
	 int n = arr.length;
	    System.out.println("\nArray after Quick sort - >");
	    for (int i=0; i<n; ++i)
	     System.out.print(arr[i] + " ");

	    System.out.println();
;
 }

 
 public static void main(String args[])
 {
     int arr[] = {12, 5, 8, 9, 2, 19};
     int n = arr.length;
     System.out.println("Array before Quick sort - >");
     for(int g=0;g<arr.length;g++) {
    	 System.out.print(arr[g]+" ");
     }
     QuickSort y = new QuickSort();
     y.sort(arr, 0, n-1);
     printArray(arr);
 }
}
