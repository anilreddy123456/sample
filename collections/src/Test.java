import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List al = new ArrayList();
		
		al.add(20);
		al.add(30);
		al.add(40);
		
		Collections.sort(al);
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("decending order");
		Collections.sort(al, Collections.reverseOrder());
		for(Object o:al) {
			System.out.println(o);
		}	
		
		
		// bellow code decending iterater is not available in arraylist class
		/*Iterator it=al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}*/
		
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaaa");
		ll.add("bbbb");
		ll.add("cccc");
		
		Collections.sort(ll, Collections.reverseOrder());
		
		Iterator<String> itr=ll.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("decending order");
		
Iterator<String> itr1=ll.descendingIterator();
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
	}
	
}
