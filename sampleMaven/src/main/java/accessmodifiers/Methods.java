package accessmodifiers;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer( "Sree");
		a.insert(0,"Lakshmy");
		System.out.println(a);
		StringBuffer s= new StringBuffer("Hello");
		s.delete(1, 3);
		System.out.println(s);
		StringBuffer y=new StringBuffer ("Everyone");
		y.replace(1, 3,"Hello");
		System.out.println(y);

	}

}
