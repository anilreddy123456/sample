package com.features;

public interface A {
	
	public String add(String a, int b);
	
	//public int squrtIt(int n);

}

//class B implements A{
//	public String add(String a, int b) {
//		System.out.println(a+b);
//		return a+b;
//	}
//   public int squrtIt(int n){
//      return n*n;
//}

class Test{
	public static void main(String[] args) {
		
		//A i = n -> n*n;
		A i2 = (a,b) -> a+b;
		//B i2 = new B();
		System.out.println(i2.add("10",30));
		//System.out.println(i.squrtIt(10));
		
	}
}
