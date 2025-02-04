package Exceptionss;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program to create a method that takes an integer as a parameter
		//and throws an exception if the number is odd
		try {
			checkeven(3);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}
	static void checkeven(int n) throws Exception
	{
		if(n%2!=0)
			throw new Exception("number is odd");
		else
			System.out.println("Number is even");
	}

}
