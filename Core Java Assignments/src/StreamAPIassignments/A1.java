package StreamAPIassignments;



import java.util.ArrayList;
import java.util.List;

class Fruit{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	
}
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("apple", 154, 90, "red"));
		list.add(new Fruit("mango", 99, 40, "yellow"));
		list.add(new Fruit("banana", 94, 45, "yellow"));
		list.add(new Fruit("guava", 114, 30, "green"));

		list.stream()
		.filter(fruit->fruit.calories<100)
		.forEach(fruit->System.out.println("[" + fruit.name + ", " + fruit.calories + ", " + fruit.price + ", " + fruit.color + "] "));
	}

}