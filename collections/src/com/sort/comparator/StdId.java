package com.sort.comparator;

import java.util.Comparator;

public class StdId implements Comparator  {

	@Override
	public int compare(Object o1, Object o2) {

		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		
		if(s1.id==s2.id) {
			return 0;
		}
		else if (s1.id>s2.id) {
			return 1;
		}
		return -1;
		
		
	}

	
	

}
