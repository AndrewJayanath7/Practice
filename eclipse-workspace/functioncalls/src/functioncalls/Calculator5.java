package functioncalls;

public class Calculator5 {
	public String addString(String word1,String word2) {
		return word1.concat(word2);
	}
	public static void main(String[]args) {
		Calculator5 calculator5=new Calculator5();
		System.out.println(calculator5.addString("hello","world"));
		
	}

}
