package FirstProject;

import org.testng.annotations.Test;

public class RestAPITest {
	
	@Test
	public void RestAPILogin() {
		System.out.println("RestAPILogin");
		System.out.println("Code 1 is added by User Y");
		System.out.println("Code 2 is added by User Y");
		//By X
		System.out.println("Code 3 is added by User X");
		System.out.println("Code 4 is added by User X");
	}

	@Test
	public void RestAPILogout() {
		System.out.println("RestAPILogout");
	}

}
