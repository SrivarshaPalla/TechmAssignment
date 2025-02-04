package ExceptionsHandling;

public class Exceptionpro1 {
	
		public static void main(String[] args)
		{
			int n1,n2,result;
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			try {
				result=n1/n2;
			}
			catch(ArithmeticException e) {
			
				e.printStackTrace();
			}
			finally {
				n2++;
				result=n1/n2;
				System.out.println("Ans is: "+result);
			}
			
		}
		

	}

