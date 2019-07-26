package coreJava;

import java.util.Scanner;

public class palindrome {
public static void main (String hc[]) {
	String input;
	Scanner x = new Scanner(System.in);
	System.out.println("Enter String to check");
	input=x.nextLine();
	x.close();
	int y = input.length();
	String output = "";
	for(int i =y-1;i>=0;i--) {
		output=output+input.charAt(i);
		}
	if(output.equalsIgnoreCase(input)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
