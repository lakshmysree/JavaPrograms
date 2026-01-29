package superKeyword;

public class Child extends Parent {
	int x=9;

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		
	}
	public void display() {
		System.out.println(x);
		System.out.println(super.x);
		
	}

}
