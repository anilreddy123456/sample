package com.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(11,"aaaa"));
		al.add(new Student(77,"djslajl"));
		al.add(new Student(99,"jkljlakk."));
		al.add(new Student(55,"hklaLK"));
		
		Collections.sort(al,new StdId());
		
		for(Student e : al) {
			System.out.println(e.id+ " "+e.name);
			
							
		}

		System.out.println("######################################");
		Collections.sort(al,new StdName());
		
		for(Student e1 : al) {
			System.out.println(e1.id+ " "+e1.name);
			}
	}

	}
 