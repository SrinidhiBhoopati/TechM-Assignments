package assignment1;
import java.util.Scanner;

public class Jan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pgrm1
		String s="nidhi";
          int v=0,c=0;
          for(int i=0;i<s.length();i++)
          {
        	  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
               v++;
               else
            	 c++;
          }
          System.out.println("no of vowels"+v);
          System.out.println("no of consonants"+c);
        
		
		
	}

}
