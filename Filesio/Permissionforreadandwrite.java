package Filesio;

import java.io.File;

public class Permissionforreadandwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to check if a file or directory has read and write permissions.
		File file =new File( "C:\\Users\\srini\\Downloads");
		System.out.println("permission for reading"+file.canRead());
		System.out.println("permission for writing"+file.canWrite());
	}

}
