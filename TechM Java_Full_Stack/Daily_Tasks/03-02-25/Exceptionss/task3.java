package Exceptionss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a method that reads a file and throws an
		//exception if the file is not found.
		try {
			readFile("aud.txt");
		}
		catch(Exception e)
		{
			System.out.println("File Not Found "+e.getMessage());
		}

	}
	static void readFile(String filename) throws FileNotFoundException{
		File file=new File(filename);
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
