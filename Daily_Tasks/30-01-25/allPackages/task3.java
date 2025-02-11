package allPackages;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,4,5,6,7,8};
        int arr2[]=  Arrays.copyOfRange(arr1, 2, 5);
        System.out.println(Arrays.toString(arr2));
	}

}
