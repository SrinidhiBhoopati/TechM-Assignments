package Filesio;

import java.io.File;

public class Listoffiledirectorynames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File folder=new File("C:\\Users\\srini\\Downloads");
         	String[] allfiles=folder.list();
         	if(allfiles!=null)
         	{
         		for(String f:allfiles)
         		{
         			System.out.println(f);
         		}
         	}
         	else
         		System.out.println("no cub directories or files exist");
	}

}
