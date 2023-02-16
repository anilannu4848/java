package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

@Test(priority = 1)

public void addEmploye() {
	
System.out.println("AddEmploye");
	
Assert.assertTrue(true); 	
}
@Test(priority = 2,dependsOnMethods = "addEmploye")	
public void editEmploye() {
	
System.out.println("EditEmploye");
}

@Test(priority = 3,dependsOnMethods = "addEmploye")
public void deleteEmploye() {
	
System.out.println("DeleteEmploye");
	
}	
}	
	
