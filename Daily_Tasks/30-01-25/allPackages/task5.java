package allPackages;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=3;
		String[] s=new String[n];
		int [][] marks= new int[n][3];
		int [] total=new int[n];
		int [] avg=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
			for(int j=0;j<n;j++)
			{
				marks[i][j]=sc.nextInt();
				total[i]=total[i]+marks[i][j];
			}
			avg[i]=total[i]/n;
		
		}
		Arrays.sort(avg);
		System.out.println(Arrays.toString(avg));
		sc.close();
	}

}
