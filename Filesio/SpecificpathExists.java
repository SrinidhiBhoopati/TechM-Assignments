package Filesio;

import java.io.File;

public class SpecificpathExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to check if a file or directory specified by pathname exists or not.
		String path="C:\\Users\\srini\\Downloads";
		File file=new File(path);
		if(file.exists())
			System.out.println("The file or directory exists");
		else
			System.out.println("no such path exists");

	}

}
