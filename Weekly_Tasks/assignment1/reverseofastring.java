package assignment1;
import java.util.Scanner;
public class reverseofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			reverse=reverse+ch;
		}
	System.out.println(reverse);

	}

}
