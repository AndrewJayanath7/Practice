package functioncalls;

public class UseBike {
	public static void main(String[]args) {
		Bike bike1=new Bike();
		bike1.brand="bajaj";
		bike1.price=50000;
		bike1.speed=100;
		bike1.taxAmount=2000;
		bike1.netPrice=bike1.price+bike1.taxAmount;
		Bike bike2=new Bike();
		bike2.brand="tvs";
		bike2.price=70000;
		bike2.speed=150;
		bike2.taxAmount=3000;
		bike2.netPrice=bike2.price+bike2.taxAmount;
		Bike bike3=new Bike();
		bike3.brand="R15";
		bike3.price=90000;
		bike3.speed=180;
		bike3.taxAmount=4000;
		bike3.netPrice=bike3.price+bike3.taxAmount;
		Bike[]bikes= {bike1,bike2,bike3};
		bike1.bikeDetails(bikes);
		
	}

}
