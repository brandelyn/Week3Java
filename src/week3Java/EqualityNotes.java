package week3Java;

public class EqualityNotes {

	public static void main(String[] args) {
		
		String a = new String ("Hello");
		String b = new String ("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);//objects will not be equal to each other
		System.out.println(a.equals(b));//but if use the equals method it will make it true
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);

	}

}
