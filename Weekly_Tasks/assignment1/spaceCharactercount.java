package assignment1;

public class spaceCharactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello This is ABCD from XYZ city";
		int space=0,character=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
				space++;
			else if(Character.isLetter(ch))
			    character++;
		}
		System.out.println("space"+space+"charcount"+character);
	}

}
