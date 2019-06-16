package collections;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashTEst {

	public static void main(String[] args) {

		Employee e1 = new Employee(111, "kumar", "test");
		Employee e2 = new Employee(222, "umesh", "QT");
		
		Student s1= new Student(99, "amar");
		Student s2 = new Student(88, "ashoke");
		
		LinkedHashMap<Employee, Student> li = new LinkedHashMap<Employee,Student>();
		
		li.put(e1, s1);
		li.put(e2, s2);
		
		Set<Employee> s =li.keySet();
		for(Employee ee:s) {
		
		System.out.println(ee.eno+","+ee.ename+","+ee.dept);
		}
		
		for(Student ss:li.values()) {
			System.out.println(ss.sid+","+ss.sname);
		}
		
	}

	}
