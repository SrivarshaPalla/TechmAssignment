package intro;
import java.lang.String;
import java.lang.System;
public class Ex7 {
	public static void main(String args[])
	{
		String s1="anurag";
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i=i+2)
		{
			arr[i]=Character.toUpperCase(arr[i]);
		}
		System.out.print(arr);
	}

}