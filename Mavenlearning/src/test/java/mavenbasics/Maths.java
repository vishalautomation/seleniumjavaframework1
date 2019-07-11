package mavenbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Maths {
	
	@Test
	public void sum(){
		System.out.println("SUM");
		int a =10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void subtraction(){
		System.out.println("SUBTRACTION");
		int a =10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void division(){
		System.out.println("DIVISION");
		int a =10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}
	
	@Test
	public void multiplication(){
		System.out.println("MULTIPLICATION");
		int a =10;
		int b = 20;
		Assert.assertEquals(200, b*a);
	}

}
