package Generics;


import java.util.Arrays;
import java.util.List;

public class Serachofanelemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Write a Java program to create a generic method that takes a list of any type and a target element. It returns the index of the first occurrence of the target element in the list. 
		//Return -1 if the target element cannot be found.
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(findIndex(list,6));
		
	}
	
	public static <T> int findIndex(List<T> list,T target)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(target))
				return i;
		}
		return -1;
	}

}
