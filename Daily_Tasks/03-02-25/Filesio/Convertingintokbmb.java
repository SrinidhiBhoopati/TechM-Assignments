package Filesio;

import java.io.File;

public class Convertingintokbmb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\srini\\Downloads\\aud.txt");
		double bytetype=file.length();
		double kbtype=bytetype/1024.0;
		double mbtype=kbtype/1024.0;
		System.out.println("byte:"+bytetype+" kb:"+kbtype+" mb:"+mbtype);
		

	}

}
