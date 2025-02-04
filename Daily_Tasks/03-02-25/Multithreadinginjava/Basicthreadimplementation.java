package Multithreadinginjava;

public class Basicthreadimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to create a basic Java thread that prints "Hello, Java!" when executed.
		MyThread task=new MyThread();
		task.start();
		
	}
	 static class MyThread extends Thread{
		public void run()
		{
			System.out.println("Hellojava!");
		}
	}

}
