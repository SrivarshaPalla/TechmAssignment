package intro;

import java.util.Scanner;

public class Vowcon {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 
	         
	        int v = 0, c = 0;
	         
	         for (int i = 0; i < s.length(); i++) {
	             
	             
	             if (Character.isLetter(s.charAt(i))) {  // Consider only alphabets
	                 if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' ) //indexOf(ch) != -1) { // Check if it's a vowel
	                     v++;
	                 else { 
	                     c++;
	                 }
	             }
	         }
	         
	         System.out.println("Vowels count - " + v);
	         System.out.println("Consonants count - " + c);
	         
	         
	     
	 

 }
}
