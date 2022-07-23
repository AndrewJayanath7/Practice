package functioncalls;

public class Pencil {
	String brand;
	int price;
	String color;
	public void pencilDetails(Pencil[]pencils) {
		for(int i=0;i<pencils.length;i++) {
			if(pencils[i].price>20) {
				System.out.println(pencils[i].brand);
			}else {
				System.out.println(pencils[i].color);
			}
		}
	}

}
