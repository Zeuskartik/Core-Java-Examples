package coreJava;

public class Selectionsort {
public void sort(int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
		int min = i;
		for(int j=i+1;j<arr.length;++j) {
			if(arr[j]<arr[min]) {
				min =j;
			}}
		if(arr[min]!=i) {
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			
		}
	}

	
}
public static void printarray(int arr []) {
	int n = arr.length;
    System.out.println("\nArray after insertion sort - >");
    for (int i=0; i<n; ++i)
     System.out.print(arr[i] + " ");

    System.out.println();

}
public static void main (String dfg[]) {
	int arr[] = {12, 11, 13, 5, 6};
    System.out.println("Array before insertion sort - >");
    for(int g=0;g<arr.length;g++) {
   	 System.out.print(arr[g]+" ");
    }
    Selectionsort y = new Selectionsort();        
    y.sort(arr);
    printarray(arr);

}
}
