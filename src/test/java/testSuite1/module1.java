package testSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  //Run All
public class module1 {
	@Test
  
	public void beforeMethod()
	{
		System.out.println("before method is executed");

	}
	public void test001()

	{
		System.out.println("I am executing test  case 001");
	}
   @Test
   
   
	
	public void test002()
	{
		System.out.println("I am executing test  case 002");

	}
	@Test
	

	public void test003()
	{
		System.out.println("I am executing test  case 003");

	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method is called");
	}

}
