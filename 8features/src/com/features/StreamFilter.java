package com.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(15);
		al.add(1000);
		al.add(8);
		
		System.out.println(al);
		// with out stream concept untill 7v
		List<Integer> l = new ArrayList<Integer>(al);
		
		for(Integer i:l) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

		//with streams concept from 8v
		List<Integer> l1 = al.stream().filter(i->i%2==1).collect(Collectors.toList());
		
		System.out.println(l1);
		
		List<Integer> l2 = al.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(l2);
	}

}
