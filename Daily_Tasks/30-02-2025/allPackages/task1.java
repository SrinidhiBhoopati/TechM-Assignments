package allPackages;

import java.util.Arrays;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr1[]= {1,3,4,5,6,7,8};
         int arr2[]= {2,2,2,2,2,2,2};
          for(int i=0;i<arr1.length;i=i+2)
          {
             System.arraycopy(arr1, i, arr2, i, 1);
          }
          System.out.println(Arrays.toString(arr2));

}
}
