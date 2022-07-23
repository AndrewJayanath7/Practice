package functioncalls;

public class Calculator2 {
	public int multiplication() {
		int num1=20;
		int num2=12;
		return num1*num2;
		
	}
	public static void main(String[]args) {
		Calculator2 calculator2=new Calculator2();
		System.out.println(calculator2.multiplication());
	}

}
