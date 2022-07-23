package functioncalls;

public class Plane {
	int price;
	int taxAmount;
	String brand;
	String color;
	int netPrice;
	public int findNetPrice(Plane plane1) {
		return plane1.price+plane1.taxAmount;
		
		
	}

}
