package coreJava;
//java implementation of linear search
import java.util.Scanner;

public class Arrayser {
	static int [] x= {1,2,3,4,5,6,7,8,9,0};
	static int id ;
	public int searchx(int p) {

		for(int i=0;i<x.length;i++) {
			if(x[i]==p) {

				System.out.println(id);
				id=i;}
//			break;}
			else {
				System.out.println(id);
				id=-1;
			}
			}
		
		System.out.println(id);
		return id;
		

	}
	public static void main (String cv[]) {
		System.out.println("Enter the number whose position you wanna find -");
		Scanner sc = new Scanner (System.in);
		int z = sc.nextInt();
		sc.close();
		Arrayser sr = new Arrayser();
		sr.searchx(z);
		System.out.println("The position of the element in the array is -> "+id);


	}

}
