package collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("anil");
		li.add("amar");
		li.add("umes");
		
		System.out.println(li);
		
		li.addFirst("ashok");
		
		//System.out.println(li);
		li.addLast("suda");
		System.out.println(li);
		
		li.add("kumar");
		
		System.out.println(li);
		
		li.set(0, "kumar");
		
		System.out.println(li);
		
		System.out.println(li.get(2));
		
		System.out.println(li.removeLast()+"," +li);
		
		LinkedList<String> li2 = new LinkedList<String>();
		
		li2.add("naresh");
		li2.add("anil");
		li2.add("babu");
		li2.add("amar");
		
		li2.addAll(li);
		System.out.println(li2);
	
		li2.retainAll(li);
		
		System.out.println(li2);
		
		
		
		
	}

}
