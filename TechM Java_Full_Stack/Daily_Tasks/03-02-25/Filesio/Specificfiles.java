package Filesio;

import java.io.File;

public class Specificfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Write a Java program to get specific files with extensions from a specified folder
		File folder =new File( "C:\\Users\\srini\\Downloads");
		String ex=".pdf";
		File[] files=folder.listFiles();
		if(files!=null)
		{
			for(File file:files)
			{
				if(file.isFile()&& file.getName().endsWith(ex))
				{
					System.out.println(file.getName());
				}
			}
			
		}
		else {
			System.out.println("No such files");
		}
		
	}

}
