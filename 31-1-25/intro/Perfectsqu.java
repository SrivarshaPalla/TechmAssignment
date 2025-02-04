package intro;

import java.util.Scanner;

public class Perfectsqu {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int m=(int)Math.sqrt(a);
	 if(m*m == a)
	 {
		 System.out.println("Perfect Square");
	 }
	 else
	 {
		 System.out.println("Not a Perfect Square");
	 }
	 
 }
}