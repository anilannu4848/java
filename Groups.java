package automation;

import org.testng.annotations.Test;

public class Groups {

@Test(priority = 1,groups = {"Regresson","Smoke"})	
	
public void addEmploye() {
	
System.out.println("AddEmploye");
}

@Test(priority =2,groups = {"Regression"})

public void editEmploye() {
	
System.out.println("EditEmploye");	
}

@Test(priority = 3,groups = {"Smoke"})
public void deleteEmploye() {

System.out.println("DeleteEmploye");
}

}	
	
	
	
	
	
