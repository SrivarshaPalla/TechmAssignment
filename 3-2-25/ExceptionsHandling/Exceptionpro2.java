package ExceptionsHandling;

public class Exceptionpro2 {
	
		public static void main(String[] args) {
			try {
				int[] number= {10,20,30};
				int m=number[26];
			}
			finally {
				System.out.println("Before scanner close");
			}
			System.out.println("Just before main");
		}

	}

