package functioncalls;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="Audi";
		car1.price=300000;
		car1.discountPercentage=5;
		car1.netPrice=car1.price+(car1.price*car1.discountPercentage/100);
		car1.color="black";
		Car car2=new Car();
		car2.brand="wolks";
		car2.price=400000;
		car2.discountPercentage=10;
		car2.netPrice=car2.price+(car2.price*car2.discountPercentage/100);
		car2.color="white";
		Car car3=new Car();
		car3.brand="kia";
		car3.price=600000;
		car3.discountPercentage=15;
		car3.netPrice=car3.price+(car3.price*car3.discountPercentage/100);
		car3.color="red";
		Car[]cars= {car1,car2,car3};
		car2.carDetails(cars);
		
	}

}
