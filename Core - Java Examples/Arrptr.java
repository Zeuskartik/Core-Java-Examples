package coreJava;

public class Arrptr {
static char[] chararray = {'a','b','b','b','c','d','e','f'};
static char mychar = 'b';
static int ptr = 0;
public void search() {
	
	for(int i =0;i<chararray.length;i++) {
		if (chararray[i]!=mychar) {
			ptr++;
		}
	}

	System.out.println("The final pointer count is "+ptr);
}
public static void main(String[] args) {
		Arrptr p = new Arrptr();
		p.search();

	}

}
