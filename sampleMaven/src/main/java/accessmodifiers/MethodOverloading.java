package accessmodifiers;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.display();
		obj.display(10,7);
		obj.display("Hello Everyone");
	}
public void display() {
	System.out.println("Hello");
}
public void display(int x,int y) {
	int divide=x/y;
	System.out.println(divide);
}
public  void display(String g) {
	System.out.println(g);
	
}
}
