import java.util.ArrayList;

import java.util.stream.Collectors;
import java.util.List;

public class Employee {
	public static void main(String[]args) {
		ArrayList<String>empName=new ArrayList<>();
		empName.add("Ram");
		empName.add("Vishnu");
		empName.add("Ganesh");
		empName.stream().map(x->x.toUpperCase()).forEach((z)->{System.out.println(z);});
		List<String>l=empName.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		for(String i:l) {
			System.out.println(i);
			
		empName.stream().map(y->y.length()>3).forEach((z)->{System.out.println(z);});
		List<Boolean>m=empName.stream().map(x->x.length()>3).collect(Collectors.toList());
		for(Boolean t:m) {
			System.out.println(t);
		
		empName.stream().map(w->w.charAt(w.length()-1)).forEach((q)->{System.out.println(q);});	
		List<Character>b=empName.stream().map(r->r.charAt(r.length()-1)).collect(Collectors.toList());
		for(Character a:b) {
			System.out.println(a);
			
		empName.stream().map(s->s.length()+10).forEach((g)->{System.out.println(g);});
		List<Integer>c=empName.stream().map(v->v.length()+10).collect(Collectors.toList());
		for(Integer d:c) {
			System.out.println(d);
			
		empName.stream().filter(u->u.contains("n")).forEach((v)->{System.out.println(v);});	
		List<String>j=empName.stream().filter(h->h.contains("n")).collect(Collectors.toList());
		for(String p:j) {
			System.out.println(p);
		}
		}
		}
		}
			
			
		}
		
	}

}
