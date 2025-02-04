package assignment1;
import java.util.Scanner;

public class uniquecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     String s=sc.next();
     String uniq="";
     for(int i=0;i<s.length();i++)
     {
    	 char ch=s.charAt(i);
    	 if(uniq.indexOf(ch)==-1) {
    		 uniq+=ch;
    	 }
     }
     System.out.println(uniq);
	}

}
