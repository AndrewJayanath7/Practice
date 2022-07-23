package functioncalls;

public class UsePlane {
	public static void main(String[]args) {
		Plane plane1=new Plane();
		plane1.price=10000;
		plane1.taxAmount=100;
		plane1.brand="boeing";
		plane1.color="white";
	    //System.out.println(plane1.findNetPrice(plane1).price+plane1.findNetPrice(plane1).taxAmount);
	    System.out.println(plane1.findNetPrice(plane1));
	}

}
