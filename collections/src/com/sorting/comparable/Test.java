package com.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<EmpId> al = new ArrayList<>();
		al.add(new EmpId(11,"aaaa"));
		al.add(new EmpId(33,"djslajl"));
		al.add(new EmpId(99,"jkljlakk."));
		al.add(new EmpId(22,"hklaLK"));
		
		Collections.sort(al);
		
		for(EmpId e : al) {
			System.out.println(e.id+ " "+e.name);
		}

	}

}
 