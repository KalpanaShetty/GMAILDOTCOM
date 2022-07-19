package production;

import org.testng.annotations.Test;

public class ContactModuleTest {
@Test
public void createContactTest() {
	System.out.println("createContactTest executed");
		System.out.println("createContactTest executed");
	String browser = System.getProperty("BROWSER");
	System.out.println(browser);
	String url = System.getProperty("URL");
	System.out.println(url);
	
}
@Test
public void createOrganizationTest() {
	System.out.println("createOrganizationTest executed");
}
}
