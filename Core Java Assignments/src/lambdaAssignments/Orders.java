package lambdaAssignments;

public class Orders {

	int price;
	String status;
	public Orders(int price,String status){
		this.price=price;
		this.status=status;
	}
	void updateStatus(String newStatus) {
		this.status=newStatus;
	}
	}


