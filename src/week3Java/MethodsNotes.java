package week3Java;

public class MethodsNotes {

	public static void main(String[] args) {
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}
	//method is a bunch of lines of code that returns something, not all methods have to return something. if you wanted to do that you would use void where String is.
	//parameters have the method do something with it. 
	public static String createFullName(String x, String y) { 
		return  x + " " + y;
		
		//access modifier
		//return data type
		//method name
		//parameter
		//method body
		
		
		
	}

}
