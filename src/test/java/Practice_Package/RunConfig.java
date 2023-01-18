package Practice_Package;

import org.testng.annotations.Test;

public class RunConfig {
@Test
public void ConfigTest() {
	String username = System.getProperty("username");
	String url = System.getProperty("url");
	String pw = System.getProperty("pw");
	String browser = System.getProperty("browser");
	System.out.println(username);
	System.out.println(url);
	System.out.println(pw);
	System.out.println(browser);
	
	
	
}
}
