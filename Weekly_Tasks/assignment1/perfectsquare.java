package assignment1;
import java.util.Scanner;
public class perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();   
	 int sq=(int)Math.sqrt(number);
	 		 if(sq*sq==number)
	 System.out.println("TRUE");
		 else
			 System.out.println("FALSE");		
	}

}
