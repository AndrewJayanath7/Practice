package functioncalls;

public class UsePencil {
	public static void main(String[]args) {
		Pencil pencil1=new Pencil();
		pencil1.brand="Apsara";
		pencil1.price=5;
		pencil1.color="red";
		Pencil pencil2=new Pencil();
		pencil2.brand="nataraj";
		pencil2.price=6;
		pencil2.color="black";
		Pencil[]pencils= {pencil1,pencil2};
		pencil2.pencilDetails(pencils);
		
	}

}
