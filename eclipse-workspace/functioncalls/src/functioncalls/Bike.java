package functioncalls;

public class Bike {
	String brand;
	int price;
	int speed;
	int taxAmount;
	int netPrice;
	public void bikeDetails(Bike[]bikes) {
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].netPrice);
		}
	}

}
