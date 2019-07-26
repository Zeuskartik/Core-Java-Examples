package coreJava;

public class BubbleSort
{
   public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
        	//System.out.println("i "+i);
            for (int j = 0; j < n-i-1; j++) {
            	//System.out.println("j "+j);
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }}}
    }

   
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String args[])
    {
        BubbleSort y = new BubbleSort();
        int arrayx[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("The array before sorting is - >");
        for(int i =0; i<arrayx.length;++i) {
        	System.out.print(arrayx[i] + " ");
        	 }
        y.bubbleSort(arrayx);
        System.out.println("\nThe array after sorting is - >");
        y.printArray(arrayx);
    }

}
