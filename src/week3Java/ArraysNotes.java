package week3Java;

public class ArraysNotes {

	public static void main(String[] args) {
		
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		//array is able to hold multiple values compared to a variable only holding one value
		
		String[] students = new String[3];//[] this would mean its an array, arrays count by 0 so if you were to put 3 it would count 0,1,2 instead.
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		//enchanced for loop
		
		for(String student : students) { // for each student in my students 
			System.out.println(student);
		}
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for(String product : products) {
			System.out.println("product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		
        for (int i = 1; i <= multiplesOf3.length; i++) {
    	multiplesOf3[i-1] = i *3;
    	System.out.println("number: " + multiplesOf3[i-1]);
    	
        }
        int[] multiplesOf5 = new int[10];
        
        
        for (int i = 0; i < multiplesOf5.length; i++) {
        	multiplesOf5[i] = (i + 1)  * 5;
        	System.out.println(multiplesOf5[i]);
        	
        }
	}

}
