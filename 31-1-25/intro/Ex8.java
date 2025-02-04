package intro;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	public static void main(String args[])
	{
		int arr[]= new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int arr2[]=Arrays.copyOfRange(arr, 0, 5);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
