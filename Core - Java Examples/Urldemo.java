package coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class Urldemo {
public static void main (String hjk[]) {
	try {
		String x = "https://www.youtube.com/results?search_query=no+game+aarya";
	URL url = new URL(x);
//	System.out.println("URL is "+url);
//	System.out.println("default port is "+url.getDefaultPort());
//	System.out.println("query is "+url.getQuery());
//	System.out.println("Ref is "+url.getRef());
//	System.out.println("Protocol is "+url.getProtocol());
//	System.out.println("authority is "+url.getAuthority());
//	System.out.println("port is "+url.getPort());
//	System.out.println("path is "+url.getPath());
//	System.out.println("contents "+url.getContent());
//	System.out.println("file is "+url.getFile());
//	System.out.println("host is "+url.getHost());
    InetAddress add = InetAddress.getLocalHost();
    String ip = add.getHostAddress();
    System.out.println("IP is "+ip);
	URLConnection connection = url.openConnection();
	HttpURLConnection connectionx = null;
	if(connection instanceof HttpURLConnection ) {
	connectionx= (HttpURLConnection) connection;}
	else {return;}
	connectionx.setRequestMethod("GET");
	int code = connectionx.getResponseCode();
	System.out.println("Response code "+code);
	BufferedReader in = new BufferedReader(new InputStreamReader(connectionx.getInputStream()));
	String content = "" ;
	String current;
	while((current = in.readLine())!=null) {
		content += current;
	}System.out.println("The content of this page is "+"\n"+content);
	
}
	catch(Exception e) {
		System.out.println(e);
	}
}}
