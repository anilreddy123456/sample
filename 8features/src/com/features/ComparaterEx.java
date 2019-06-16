package com.features;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class ComparaterEx {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		
		l.add("anil");
		l.add("amar");
		l.add("ashok");
		l.add("aaa");
		l.add("bbb");
		
		
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		
		// this is for integer concept
		
//		Comparator<String> c = (i1,i2)-> (i1<i2)?-1:(i1>i2)?1:0;
//		Collections.sort(l, c);
//		System.out.println(l);
	
		//this is for String concept
		
		Comparator<String> c = (s1,s2)-> s1.compareTo(s2);
		Collections.sort(l, c);
		System.out.println(l);
	}

}
