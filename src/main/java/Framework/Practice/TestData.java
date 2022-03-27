package Framework.Practice;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="InputData")
	public Object[][] dataprovidertext()
	{
		Object[][] obj=new Object[2][1];
			obj[0][0]="Ayman";
			obj[1][0]="@#$%^";
			
			return obj;
					
	}

}
