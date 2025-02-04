package Generics;

public class ArraysEqualornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a1= {1,2,3,4,5,6};
		Integer[] a2= {1,2,3,4,5,6};
		Integer[] a3= {2,5,6,8,9,9};
		Character [] a4= {'a','b','c'};
		Character[] a5= {'a','b','c'};
		Character[] a6= {'c','h','i'};
		System.out.println(areEqual(a1,a2));
		System.out.println(areEqual(a1,a3));
		System.out.println(areEqual(a4,a5));
		System.out.println(areEqual(a5,a6));
		

	}
	public static <T> boolean areEqual(T[] arr1,T[] arr2)
	{
		if(arr1==null||arr2==null)
			return arr1==arr2;
		if(arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=(arr2[i]))
				return false;
				
		}
		return true;
	}

}
