package assignment1;
import java.util.Scanner;
public class lastletterinword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String m1=sc.nextLine();
		 String emp="";
		 for (int i = 0; i < m1.length(); i++) {
	         
	         if ((m1.charAt(i) == ' ') && i > 0 && Character.isLetter(m1.charAt(i - 1))) {
	             emp += m1.charAt(i - 1); // Append the last letter before the space
	         }
	     }
	
     
	     if (m1.length() > 0 && Character.isLetter(m1.charAt(m1.length() - 1))) {
	         emp += m1.charAt(m1.length() - 1); 
	     }
	     System.out.println(emp);
		
	}

}
