package Exceptionss;

import java.io.File;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that reads a file and throws an exception if the file is empty.
		try {
			checkFile("C:\\Users\\srini\\Downloads\\aud.txt");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	static void checkFile(String filename) throws Exception
	{
		File file = new File(filename);
		Scanner sc=new Scanner(file);
		if(file.length()==0)
			throw new Exception("the file is empty");
		else {
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		
	}

}
