package intro;

import java.util.Arrays;
public class Ex9 {
 public static void main(String[] args)
 {
	
	 		  
	 	        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
	 	        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
	 	        
	 	       
	 	        System.out.println("equals(): " + array1.equals(array2));  

	 	       
	 	        System.out.println("deepEquals(): " + Arrays.deepEquals(array1, array2)); 
	 	    }

	 
	 
 }

