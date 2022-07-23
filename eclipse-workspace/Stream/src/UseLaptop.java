import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop l1=new Laptop("lenovo",45000,"black");
		Laptop l2=new Laptop("hp",50000,"white");
		Laptop l3=new Laptop("Azus",70000,"blue");
		Laptop l4=new Laptop("dell",43000,"black");
		Laptop l5=new Laptop("Acer",80000,"silver");
		Laptop l6=new Laptop("monster",90000,"brown");
		ArrayList<Laptop>laptopDetails=new ArrayList<>();
		laptopDetails.add(l1);
		laptopDetails.add(l2);
		laptopDetails.add(l3);
		laptopDetails.add(l4);
		laptopDetails.add(l5);
		laptopDetails.add(l6);
		laptopDetails.stream().map(x->x.getBrand().concat(x.getColor())).forEach((y)->{System.out.println(y);});
		List<String>lap=laptopDetails.stream().map(z->z.getBrand().concat(z.getColor())).collect(Collectors.toList());
		for(String i:lap) {
			System.out.println(i);
		}
		
		laptopDetails.stream().filter(q->q.getColor().equals("white")).forEach((r)->{System.out.println(r);});
		List<Laptop>lap1=laptopDetails.stream().filter(u->u.getColor().equals("white")).collect(Collectors.toList());
		for(Laptop h:lap1) {
			System.out.println(h);
		}
		
		long laptopCount=laptopDetails.stream().count();
		System.out.println(laptopCount);
		
		long lenovoCount=laptopDetails.stream().filter(b->b.getBrand().equals("lenovo")).count();
		System.out.println(lenovoCount);
		
		long capscount=laptopDetails.stream().map(f->f.getBrand().toUpperCase()).count();
		System.out.println(capscount);
		
	}

}
