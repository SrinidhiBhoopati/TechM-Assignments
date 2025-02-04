package assignment1;
import java.util.Scanner;
public class smallestvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String m=sc.next();
	String vowels="aeiou";
		char smallvow='z';
		for(int i=0;i<m.length();i++)
		{
			char current=m.charAt(i);
			if(vowels.indexOf(current)!= -1&& (current <smallvow))
			{
				smallvow=current;
			}
		}
		if(smallvow=='z')
			System.out.println("no smallest vowel");
			else
				System.out.println("samllest vowel is "+smallvow);
		
		
		
		
	}

}
