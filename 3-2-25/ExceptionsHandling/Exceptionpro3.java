package ExceptionsHandling;

public class Exceptionpro3 {
	
		public static void main(String[] args) {
			int arr[]= {10,40,30,90};
			try {
				int num=arr[5];
				System.out.println(num);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds exception ");
				
			}
			finally {
				System.out.println("last element of array");
				System.out.println(arr[arr.length-1]);
			}
		}

	}

