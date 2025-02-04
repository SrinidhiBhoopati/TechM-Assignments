package Multithreadinginjava;

public class Evenoddusingthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program that creates two threads to find
		//and print even and odd numbers from 1 to 20.
		
		Eventhread evenThread = new Eventhread(); 
        OddThread oddThread = new OddThread();   

        evenThread.start();  
        oddThread.start(); 
		
	}
	
	 static class Eventhread extends Thread{
		public void run()
		{
			for(int i=2;i<=20;i+=2)
			{
				System.out.println(i+"even");
			}
		}
	}
	 static class OddThread extends Thread{
		public void run(){
			for(int i=1;i<=20;i+=2)
			{
				System.out.println(i+"isodd");
			}
		}
	}

}
