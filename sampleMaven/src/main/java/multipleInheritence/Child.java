package multipleInheritence;

public class Child implements A,B {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("sree");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("lakshmy");
		// TODO Auto-generated method stub
		
	}

}
