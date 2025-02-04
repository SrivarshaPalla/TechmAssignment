package intro;
import java.util.Scanner;
public class Ass1 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   char c[]=s.toCharArray();
	   for(int i=0;i<c.length;i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.print(c[i]);
		   }
	   }
			   }
}
