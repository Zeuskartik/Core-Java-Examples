package coreJava;

public class Pattcount {
	public static void main  (String gd[]) {
		String sample="ABRACADABRA";
		String pattern = "ABRA";
		int x= sample.length();
		int y = pattern.length();
		int count = 0;
		int countx = 0;
		boolean b= false;
		char p,q,r,s;
		for (int i =0; i<=x-y;i++) {
			p=sample.charAt(i);
			q=pattern.charAt(0);
			//System.out.println("i-"+i);
			if(p==q) {
				for (int j=i,k=0;j<i+y;j++,k++) {
					p=sample.charAt(j);
					q=pattern.charAt(k);
					if(p==q) {
						count++;
					}

				}
			}

			if(count==y) {
				b=true;

			}

		}
		boolean flag = true;
		for(int l =0; l<x;l++) {
			p=sample.charAt(l);
			r=pattern.charAt(0);
			if(p==r) {
				if(sample.length()-l>= pattern.length()) {
					flag=true;
					for(int m=l+1, n=1;n<=y-1;n++,m++) {
						s=pattern.charAt(n);
						p=sample.charAt(m);
						if(s!=p) { 
						flag=false;
                        break;
						}
						if(s==p) {
							count++;
						}}
				if(count==y) {
					countx++;
				}
					if(flag) {
						countx++;
					}
				}
			}
		}

		if(b) {
			System.out.println("Pattern Found");
			System.out.println("Number of Occurence of Pattern "+countx);
		}
		else {
			System.out.println("Pattern does not exists");
		}


	}
}
