package coreJava;

import java.util.Scanner;

public class Stringx {
	public static void main (String args[]) {
	String a,b;
	Scanner x = new Scanner(System.in);
	System.out.println("Enter two strings");
	a=x.nextLine();
	b=x.nextLine();
	x.close();
	String c = a.concat(b);
	int y = a.length();
	int z = b.length();
	String d= a.toUpperCase();
	String e = b.toLowerCase();
	String rev1 = "" ;
	for (int i = y-1;i>=0;i--) {
		rev1 = rev1+a.charAt(i);
	}
	String rev2 ="";
	for(int j = z-1;j>=0;j--) {
		rev2 = rev2+b.charAt(j);
	}
	String f = a.trim();
	String g = b.trim();

	System.out.println("\n"+c+"\n"+y+"\n"+z+"\n"+d+"\n"+e+"\n"+rev1+"\n"+rev2+"\n"+f+"\n"+g);
	
	}

}
