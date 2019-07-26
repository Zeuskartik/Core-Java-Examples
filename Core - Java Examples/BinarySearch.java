package coreJava;

import java.util.Scanner;

public class BinarySearch
{
       int binarySearch(int arr[], int x)
    {
        int left = 0, right = arr.length-1;
        
        while (left <= right)
        {
        //System.out.println("left "+left);
        //System.out.println("right "+right);
            int mid = left + (right-left)/2;
            //System.err.println("mid "+mid);
            if (arr[mid] == x) {
                return mid;}
            if (arr[mid] < x) {
                left = mid + 1;}
            else
                {right = mid - 1;}
        }
 
        return -1;
    }
 
    
    public static void main(String args[])
    {
        BinarySearch y = new BinarySearch();
        int arrayx[] = {2, 3, 4, 10, 40};
        System.out.println("Enter the number to be searched");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int result = y.binarySearch(arrayx, x);
        if (result == -1)
            System.out.println("Element not present in the given array");
        else
            System.out.println("Element found at position "+ result);
    }
}