package collections;

public class Employee {
	
	int eno;
	String ename;
	String dept;
	public Employee(int eno, String ename, String dept) {
		//super();
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	

}
