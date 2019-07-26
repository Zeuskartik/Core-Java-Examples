package coreJava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Urlpostdemo {

	public static void main(String[] args) throws IOException {
		String user = "Google Chrome";
		String x = "https://support.apple.com/";
		URL url = new URL(x);
		HttpURLConnection connectionx = null;
		connectionx= (HttpURLConnection)url.openConnection();
		connectionx.setRequestMethod("POST");
		connectionx.setRequestProperty("user", user);
		connectionx.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
		connectionx.setDoOutput(true);
		DataOutputStream dos = new DataOutputStream(connectionx.getOutputStream());
		dos.writeBytes(urlParameters);
		dos.flush();
		dos.close();
		int code = connectionx.getResponseCode();
		System.out.println("Response code "+code);
		BufferedReader in = new BufferedReader(new InputStreamReader(connectionx.getInputStream()));
		String content = "" ;
		String current;
		while((current = in.readLine())!=null) {
			content += current;
		}System.out.println("The content of this page is "+"\n"+content.toString());
		
	}
		




	}


