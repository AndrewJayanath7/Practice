package functioncalls;

public class Student {
	public void addition() {
		int tamilmark=54;
		int englishmark=76;
		int biologymark=79;
		System.out.println(tamilmark+englishmark+biologymark);
	}
	public static void main(String[]args) {
		Student student=new Student();
		student.addition();
	}

}
