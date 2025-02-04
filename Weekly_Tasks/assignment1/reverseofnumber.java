package assignment1;

import java.util.Scanner;

public class reverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int num=0;
		  while(n>0)
		  {
			  int r=n%10;
			  num=num*10+r;
		  n=n/10;
		  }
		  System.out.println(num);

	}

}
