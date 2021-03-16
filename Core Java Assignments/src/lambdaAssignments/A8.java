package lambdaAssignments;

import java.util.ArrayList;
import java.util.function.Consumer;

public class A8 extends Thread{
	public void run(){  
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(5);
	    myArray.add(6);
	    myArray.add(10);
	    myArray.add(16);
		Consumer<Integer> method = (n) -> System.out.println(n);
		myArray.forEach( method );
		} 
	public static void main(String args[]){  
		
		A8 t1=new A8();  
		t1.start();  
	    
	
		 }  
}
