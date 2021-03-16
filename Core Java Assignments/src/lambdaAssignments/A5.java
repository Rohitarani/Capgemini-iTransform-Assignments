package lambdaAssignments;

import java.util.ArrayList;
import java.util.function.Consumer;

public class A5 {
	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>();
	    myArray.add("Hello");
	    myArray.add("Hi");
	    myArray.add("Good morning");
	    myArray.add("Good night");
	    StringBuilder newstring=new StringBuilder();
	    Consumer<String> method = (n) -> { newstring.append(n.charAt(0)); };
	    myArray.forEach( method );
	    System.out.println(newstring);
	}

}
