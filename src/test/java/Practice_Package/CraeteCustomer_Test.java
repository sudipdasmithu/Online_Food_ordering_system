package Practice_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CraeteCustomer_Test {
	@Test(groups = "smoke")
	public void Customer_Test() {
		Reporter.log("createcustomer",true);
	}
	@Test(groups = "regression")
	public void Customer1_Test() {
		Reporter.log("createcustomer1",true);
	}
	@Test(groups="smoke")
	public void Customer2_Test() {
		Reporter.log("createcustomer2",true);
	}

}
