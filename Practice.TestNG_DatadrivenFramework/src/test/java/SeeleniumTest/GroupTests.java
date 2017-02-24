package SeeleniumTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupTests 
{

	@BeforeGroups(groups={"sanity","Regression"})
		public void login()
		{
			System.out.println("login successful");
			
		}

	@AfterGroups(groups={"sanity","Regression"})
	public void logout()
	{
		System.out.println("logout successful");
	}

	@Test(groups={"sanity"})
	public void navigateToWomenSection()
		{
			System.out.println("Navigate to patient census");
		}
		
	@Test(groups={"sanity"})
	public void navigateToElectronicSection()
		{
			System.out.println("Navigate to electronic section");
		}
		
	@Test(groups={"regression"})
	public void testcase()
		{
			System.out.println("Testcase in"+getClass().getSimpleName()+"With Thread id :"+Thread.currentThread().getId());
		}
		
		
	}


