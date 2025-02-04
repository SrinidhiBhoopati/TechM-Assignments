package Filesio;

import java.io.File;

public class CheckingfileorDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. Write a Java program to check if the given pathname is a directory or a file.
		File file = new File("C:\\Users\\srini\\Downloads\\aud.txt");
		if(file.exists())
		{
			if(file.isDirectory())
				System.out.println("the path is for directory");
			else if(file.isFile())
				System.out.println("the path is for a file");
		}
		else
			System.out.println("no such path exists");

	}

}
