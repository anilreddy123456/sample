package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove ele by set

public class ListSetEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		
		System.out.println(al.size());
		
		al.add(40);
		al.add(30);
		
		System.out.println(al.get(3));
		
		System.out.println(al.set(2, 90));
		
		for(int i=0;i<al.size();i++) {
			System.out.println("\t" +al.get(i));
		}
		
		System.out.println(al.size());
		System.out.println(al);
		
		
		
		Set s = new LinkedHashSet(al);
		
		System.out.println(s);
		
		Set<String> s1 =new HashSet<>();
		
		s1.add("anil");
		s1.add("amar");
		s1.add("anil");
		s1.add("umesh");
		s1.add("10");
		
		System.out.println(s1.add("umesh"));
		
		System.out.println(s1.add("ashok"));
		
		System.out.println(s1);
		
		
		
	}

}
