package SeeleniumTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 
{
	@BeforeClass
	public void login()
	{
		System.out.println("login successful");
		
	}

	@Test(priority=1)
	public void searchWKurta()
	{
		System.out.println("Navigate to patient census");
	}
	
	@Test(priority=2)
	public void FilterByPrice()
	{
		System.out.println("Navigate to electronic section");
	}
	
	@Test(priority=2)
	public void FilterByDiscount()
	{
		System.out.println("Navigate to electronic section");
	}
	

	@Test(priority=3)
	public void testcase()
	{
		System.out.println("Testcase in"+getClass().getSimpleName()+" With Thread id :"+Thread.currentThread().getId());
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout successful");
	}
}

