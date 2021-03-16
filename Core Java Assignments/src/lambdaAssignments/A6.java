package lambdaAssignments;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class A6 {
	 public static void main(String[] args) throws CloneNotSupportedException {
	      ArrayList<String> list = new ArrayList<>();
	      list.add("Java");
	      list.add("JavaScript");
	      list.add("CoffeeScript");
	      list.add("HBase");
	      list.add("OpenNLP");
	      System.out.println("Contents of the list: "+list);
	      UnaryOperator<String> uo=e->e.toUpperCase();
	      list.replaceAll(uo);
	      System.out.println("Contents of the list after replace operation: \n"+list);
	   }

}
