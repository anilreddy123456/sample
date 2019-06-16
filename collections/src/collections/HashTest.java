package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {

		HashMap<Integer, String> h= new HashMap<Integer, String>();
		h.put(11, "anil");
		h.put(22, "kumar");
		h.put(33, "amar");
		h.put(44, "umesh");
		
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		Set<Entry<Integer,String>> s =h.entrySet();
		System.out.println(s);
		for(Entry<Integer, String> e: s) {
			System.out.println(e.getKey()+","+e.getValue()); 
		}
		System.out.println(h.entrySet());
	}

}
