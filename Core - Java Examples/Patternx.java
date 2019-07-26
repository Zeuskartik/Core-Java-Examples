package coreJava;

//n,o,t
public class Patternx {

	public static void main(String[] args) {
		String sample = "Demonstration";
		String pattern = "o";
		int count = 0;
		boolean b = false;
		int  x= sample.length();
		int y = pattern.length();
		char p,q;
		for (int i =0; i<=x-y;i++) {
			p=sample.charAt(i);
			q=pattern.charAt(0);
			//System.out.println("i-"+i);
			if(p==q) {
				for (int j=i,k=0;j<i+y;j++,k++) {
					p=sample.charAt(j);
					q=pattern.charAt(k);
					//System.out.println("Second Loop");
					//System.out.println("j-"+j+"k- "+k);
					if(p==q) {
						count++;
					}
				}
			}

			if(count==y) {
				b=true;
			}

		}

		if(b==true) {
			System.out.println("Pattern Found");
		}
		else {
			System.out.println("Pattern does not exists");
		}
	}
}




