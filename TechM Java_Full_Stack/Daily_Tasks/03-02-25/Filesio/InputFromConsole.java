package Filesio;

import java.util.Scanner;

public class InputFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String name=sc.next();
         String college=sc.next();
         int year=sc.nextInt();
         System.out.println(name+" "+college+" "+year);
         sc.close();
	}

}
