package com.features;

@FunctionalInterface
public interface Info {

	public void m1();
	//public void m7();
	
	default void m2() {
		
	}
	
	static void m3() {
		
	}
}
 // @FunctionalInterface
  interface Info2 extends Info{
	
	public void m8();
	default void m4() {
		
	}
	
}
