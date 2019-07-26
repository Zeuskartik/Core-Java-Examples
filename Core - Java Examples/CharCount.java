package coreJava;
public class CharCount {
	    public static void main(String[] args) {
		String sample = "Demonstration";
		char pattern = 'D';
		int count =0;
		for (int i =0; i<sample.length();i++) {
			if(sample.charAt(i)==pattern) {
				count++;
			}
			
		}
		System.out.println("Number of occurence "+count );
	}

}
