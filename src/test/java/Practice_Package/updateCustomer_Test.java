package Practice_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class updateCustomer_Test {
	@Test(groups="regression")
	public void updateCustomer() {
		Reporter.log("customer1",true);
	}
	@Test(groups="smoke")
	public void updateCustomer1() {
		Reporter.log("customer2",true);
	}
	@Test(groups="regression")
	public void updateCustomer2() {
		Reporter.log("customer3",true);
	}

}
