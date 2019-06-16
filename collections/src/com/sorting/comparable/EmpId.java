package com.sorting.comparable;

public class EmpId implements Comparable<EmpId> {
	
	int id;
	String name;
	public EmpId(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(EmpId o) {
		
//		if(id==o.id) {
//			return 0;
//		}
//		else if (id>o.id) {
//			return 1;
//		}
//		return -1;
		
		return name.compareTo(o.name);
	}
	
	//o->(id==o.id):0?(id>o.id):1?-1;
	
	
}
