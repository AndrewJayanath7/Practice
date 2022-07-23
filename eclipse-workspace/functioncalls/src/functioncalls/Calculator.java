package functioncalls;

public class Calculator {
	public int addition() {
		int num=10;
		int num1=15;
		return num+num1;
		
	}
	public static void main(String[]args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator.addition());
	}
	

}
