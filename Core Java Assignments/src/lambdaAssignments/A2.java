package lambdaAssignments;



interface OrderStatus {
	void operation(Orders o);
}

public class A2 {
	public static void main(String[] args) {

		OrderStatus task = (Orders o) -> {
			if((o.price>10000)&&((o.status.equalsIgnoreCase("completed"))||(o.status.equalsIgnoreCase("accepted")))) {
				System.out.println("Price:"+o.price);
			}
		};
		task.operation(new Orders(20000,"completed"));
		task.operation(new Orders(30000,"accepted"));
		task.operation(new Orders(40000,"not completed"));
		task.operation(new Orders(5000,"completed"));
	}
}
