package exceptionMethods;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		if(x>=18) {
			System.out.println("eligible");
		}
		else {
			throw new ArithmeticException("Not Eligible");
		}

	}

}
