package generic;
import java.util.Arrays;
public class Arraysele {
	
	
	
		  public static <B> boolean areArraysEqual(B[] array1, B[] array2) {
		        return Arrays.equals(array1, array2);
		    }

		    public static void main(String[] args) {
		        Integer[] arr1 = {1, 2, 3, 4, 5};
		        Integer[] arr2 = {1, 2, 3, 4, 5};
		        Integer[] arr3 = {1, 2, 8, 4, 6};
		        
		        System.out.println("arr1 and arr2 are equal: " + areArraysEqual(arr1, arr2)); 
		        System.out.println("arr1 and arr3 are equal: " + areArraysEqual(arr1, arr3));
		        
		        String[] str1 = {"A", "B", "C"};
		        String[] str2 = {"A", "B", "C"};
		        String[] str3 = {"A", "C", "B"};
		        
		        System.out.println("str1 and str2 are equal: " + areArraysEqual(str1, str2)); 
		        System.out.println("str1 and str3 are equal: " + areArraysEqual(str1, str3)); 
		    }
		}

