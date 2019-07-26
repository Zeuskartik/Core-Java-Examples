package coreJava;

public class Split {
public static void main(String gh []) {
	String jx = "a_b,c-d,e,f_g,h,i=j+k)0*l";
	String jh [] = jx.split(",");
	StringBuffer x = new StringBuffer("louder");
	System.out.println(x.reverse());
	System.out.println(jh[3]);
	StringBuilder y = new StringBuilder("Anything");
	y.delete(0, 3);
	System.out.println(y.toString());
	x.append("Thread-Safe");
	y.append("not thread safe");
	System.out.println(x.toString());
	System.out.println(y.toString());
}
}
