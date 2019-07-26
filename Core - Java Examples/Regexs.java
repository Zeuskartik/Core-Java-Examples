package coreJava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {
	public static void main (String gfh[]) {
		String xyz = "This group is meant for 18+!";
		String pattern = "(\\d+)";
		Pattern p = Pattern.compile(pattern);
		Matcher x = p.matcher(xyz);
		if(x.find()) {
		System.out.println("Found: "+x.groupCount());                																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
		System.out.println("Found: "+x.group(0 ));
    	//StringBuffer sb = new StringBuffer("10 ");
		System.out.println("Result: "+x.replaceFirst("20"));
//		//System.out.println("Found: "+x.group(2 ));
	}
		else {
			System.out.println("Nothing found");
		}

}}
	