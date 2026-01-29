package exceptionMethods;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int [3];
			a[3]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not valid");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		finally {
			System.out.println("finally block executes");
		}

	}

}
