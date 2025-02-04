package Exceptionss;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. Write a Java program that throws an exception and catch it using a try-catch block.
		int num1=10;
		int num2=0;
		try {
			int n=num1/num2;
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by zero");
		}
	}

}
