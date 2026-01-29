package exceptionMethods;

public class ExceptionExample {

	public static void main(String[] args) {
try {		// TODO Auto-generated method stub
int a=10;
int b=0;
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException e) {
	System.out.println(e);
}
finally {
	System.out.println("necessary code");
}
	}

}
