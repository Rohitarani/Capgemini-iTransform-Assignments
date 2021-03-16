package lambdaAssignments;

import java.util.ArrayList;

public class A4 {
	public static void main(String[] args) {
	    ArrayList<String> myArray = new ArrayList<String>();
	    myArray.add("Hello");
	    myArray.add("Hi");
	    myArray.add("Good morning");
	    myArray.add("Good night");
	    myArray.removeIf(n -> Math.floorMod(n.length(), 2)!=0);
	    for (String i : myArray) { 
            System.out.println(i); 
        } 
	  }

}
