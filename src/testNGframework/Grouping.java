package testNGframework;

import org.testng.annotations.Test;

public class Grouping {

	
	@Test (groups="X")
	public void f1() {
		System.out.println("f1");
	}
	@Test (groups="Y")
	public void f2() {
		System.out.println("f2");
	}
	@Test (groups="X")
	public void f3() {
		System.out.println("f3");
	}
	@Test (groups="Y")
	public void f4() {
		System.out.println("f4");
	}
	@Test (groups="X")
	public void f5() {
		System.out.println("f5");
	}
	@Test (groups="Y")
	public void f6() {
		System.out.println("f6");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
