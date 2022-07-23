package functioncalls;

public class Car {
	String brand;
	int price;
	int discountPercentage;
	String color;
	int netPrice;
	public void carDetails(Car[]cars) {
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].netPrice);
		}
	}
	

}
