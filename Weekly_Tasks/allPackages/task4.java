package allPackages;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="anurag";
          String str="";
          for(int i=0;i<s.length();i++)
          {
        	  char ch=s.charAt(i);
        	  if(i%2!=0)
        		  str=str+Character.toUpperCase(ch);
        	  else
        		  str=str+Character.toLowerCase(ch);
          }
          System.out.println(str);
	}

}
