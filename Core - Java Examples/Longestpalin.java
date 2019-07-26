package coreJava;

import java.util.Scanner;

public class Longestpalin {
	static void stringer(String str, int a,int b) {
		System.out.println(str.substring(a, b+1));
	}

	public static int longstr(String str) {
		int max = 1;
		int x= str.length();
		int s = 0;
		int left,right;
		for(int i=1;i<x;i++) {
			left=i-1;
			right=i+1;
			while (left>=0 && right<x && str.charAt(left)==str.charAt(right)) {
				if(right-left + 1 > max) {
					s=left;
					max=right-left+1;
				}
				left--;
				right++;
			}
		}

		System.out.println("String ->");
		stringer(str,s,s+max-1);

		return max;
		}
	public static void main(String cvc[]) {
		String sample;
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		sample=sc.nextLine();
		sc.close();
		System.out.println("Length -> "+longstr(sample));
	}

}
