package Filesio;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to determine the last modified date of a file.
		File file = new File("C:\\Users\\srini\\Downloads\\aud.txt");
		if(file.exists())
		{
			long last=file.lastModified();
			SimpleDateFormat f=new SimpleDateFormat("mm/dd/yyyy HH:mm:ss");
			String formatted=f.format(last);
			
			System.out.println("last modified info "+formatted);
		}
		else
			System.out.println("no such path exits");

	}

}
