import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseShoe {
	public static void main(String[]args) {
		Shoe s1=new Shoe("Adidas",8,3000,true,"Sports");
		Shoe s2=new Shoe("Nike",7,4000,true,"casuals");
		Shoe s3=new Shoe("woodLand",10,5000,true,"formal");
		Shoe s4=new Shoe("Puma",7,3500,false,"Sports");
		Shoe s5=new Shoe("Reebok",10,5500,true,"Sports");
		Shoe s6=new Shoe("Adidas",7,7000,true,"Sports");
		Shoe s7=new Shoe("Adidas",8,6000,true,"formal");
		Shoe s8=new Shoe("Puma",6,1000,false,"casuals");
		ArrayList<Shoe>shoeDetails=new ArrayList<>();
		shoeDetails.add(s1);
		shoeDetails.add(s2);
		shoeDetails.add(s3);
		shoeDetails.add(s4);
		shoeDetails.add(s5);
		shoeDetails.add(s6);
		shoeDetails.add(s7);
		shoeDetails.add(s8);
		shoeDetails.stream().map(x->x.getBrand().substring(1,x.getBrand().length()-1).length()).forEach((y)->{System.out.println(y);});
		List<Integer>sh=shoeDetails.stream().map(q->q.getBrand().substring(1,q.getBrand().length()-1).length()).collect(Collectors.toList());
		for(Integer i:sh) {
			System.out.println(i);
		}
		
		shoeDetails.stream().map(t->t.getShoeType().equals("Sports")&&t.getIsWarrantyAvailable()).forEach((n)->{System.out.println(n);});
		List<Boolean>sh1=shoeDetails.stream().map(l->l.getShoeType().equals("Sports")&&l.getIsWarrantyAvailable()).collect(Collectors.toList());
		for(boolean g:sh1) {
			System.out.println(g);
		}
		
		shoeDetails.stream().filter(e->e.getSize()<8).forEach((v)->{System.out.println(v.getBrand().toUpperCase());});
		List<Shoe>sho1=shoeDetails.stream().filter(j->j.getSize()<8).collect(Collectors.toList());
		for(Shoe u:sho1) {
			System.out.println(u.getBrand().toUpperCase());
		}
		
		shoeDetails.stream().filter(c->c.getShoeType().contains("Sports")&&c.getBrand().contains("Adidas")).map(f->f.getPrice()).forEach((h)->{System.out.println(h);});
		List<Integer>sho3=shoeDetails.stream().filter(c->c.getShoeType().contains("Sports")&&c.getBrand().contains("Adidas")).map(f->f.getPrice()).collect(Collectors.toList());
		for(Integer o:sho3) {
			System.out.println(o);
		}
		
		shoeDetails.stream().filter(b->b.getIsWarrantyAvailable()==false).forEach((s)->{System.out.println(s.getShoeType().charAt(0));});
		List<Shoe>sho4=shoeDetails.stream().filter(b->b.getIsWarrantyAvailable()==false).collect(Collectors.toList());
		for(Shoe p:sho4) {
			System.out.println(p.getShoeType().charAt(0));
		}
		shoeDetails.stream().filter(tk->tk.getShoeType().equals("Sports")&&tk.getIsWarrantyAvailable()).forEach((jk)->{System.out.println(jk);});
		List<Shoe>sho5=shoeDetails.stream().filter(tk->tk.getShoeType().equals("Sports")&&tk.getIsWarrantyAvailable()).collect(Collectors.toList());
		int max=0;
		for(Shoe rk:sho5) {
			if(max<rk.getPrice()) {
				max=rk.getPrice();	
			}
		}
		System.out.println(max);
	}
}
