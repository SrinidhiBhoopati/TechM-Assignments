package allPackages;

import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            int arr1[]= {1,2,3,4};
//            int arr2[]= {1,2,3,4};
//            if(Arrays.equals(arr1, arr2))
//            	System.out.println("both are equal");
//            else
//            	System.out.println("not equal");
//            	
            int a1[][]= {{1,2,4},{5,6,7,8}};
            int a2[][]= {{1,2,3,4},{5,7,8}};
            
            if(Arrays.deepEquals(a1, a2))
            	System.out.println("both are equal");
            else
            	System.out.println("not equal");
            
            
	}

}
