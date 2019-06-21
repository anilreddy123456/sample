package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


// here we are using the generic concept.
public class EmpList {

	public static void main(String[] args) {
		
		
		Employee e1= new Employee(111, "anil", "dev");
		Employee e2= new Employee(222, "amar", "admin");
		Employee e3= new Employee(333, "umesh", "test");
		Employee e4= new Employee(444, "ashok", "QA");
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println(al);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		
//		for(Employee ee:al) {
//			System.out.println(ee.eno+ "," +ee.ename+ "," +ee.dept);
//			
			Iterator<Employee> itr = al.iterator();
			
			while (itr.hasNext()) {
				
				Employee eee=itr.next();
				
				System.out.println(eee.eno+ "," +eee.ename+ "," +eee.dept);
			}
		}
		
	}


