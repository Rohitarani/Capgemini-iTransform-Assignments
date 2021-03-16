package oopsAssignments;

public class A1 {
	public static void main(String[] args) {
		Abc ob1;
		ob1=Abc.getInstance();// TODO Auto-generated method stub
		ob1.getName();
	}

}

class Abc{
	private static Abc object1; //private static member of type class Abc
	private Abc() //private constructor
	{
		//
	}
	public static Abc getInstance()//static method
	{
		if(object1==null)
			object1=new Abc();
		return object1;
	}
	public void getName() {
	       System.out.println("Hi! Rohita from singleton class");
	   }
}
