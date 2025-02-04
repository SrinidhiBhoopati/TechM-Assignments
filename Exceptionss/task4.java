package Exceptionss;

import java.io.File;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Write a Java program that reads a list of numbers from a file and throws 
		//an exception if any of the numbers are positive.
		try {
			readFile("aud.txt");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	static void readFile(String filename) throws Exception{
		File file=new File(filename);
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			int n=Integer.parseInt(sc.nextLine());
			if(n>0)
				throw new Exception("number is positive");
			else
				System.out.println("number is negative");
		}
		
	}

}
